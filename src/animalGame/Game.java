package animalGame;




import animalGame.animals.models.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// här inne ska spelet köras, vi behöver skapa hjälpmetoder som hänvisar spelaren om spelet.

public class Game {
    int users; // Hur många spelare som är med
    int rounds; // ANTALET RUNDOR
    Player player;
    List<Player> players; // LISTA AV OBJEKT PLAYER
    Store store;
    Scanner scanner = new Scanner(System.in);
    String winnerName;
    AnimalSavedInstance save;


    // Konstruktor
    public Game(){
        System.out.println("Hey Welcome\n"); // HÄLSING INNAN SPEL
        System.out.println("1. Start New Game   2. Load Game");
        int todo = scanner.nextInt();
        switch(todo){
            case 1:
                startMenu();
                break;

            case 2:
                loadFromFile();

        }






    }

    private void loadFromFile() {

       AnimalSavedInstance A = new AnimalSavedInstance();
       A.load();
       nextMove();

    }


    // HÄR INNE LIGGER SPELETS START MENY.

    private void startMenu() {
        System.out.println("How many players are playing: ");
        users = scanner.nextInt();
        System.out.println("There is " + users + " players\n");
        System.out.println("How many rounds would you like to play ");
        rounds = scanner.nextInt();
        System.out.println(rounds + " Rounds...\n");

        createPlayers();


    }


    /**
     * DENNA METOD SKAPAR NYA SPELARE SEDAN STORAS DOM INNE HOS LISTAN AV TYP SPELARE
     */

    private void createPlayers() {
        players = new ArrayList<>();
        int a = 0;

        // for loop med int i=0, i<users; i++
        while (users != a) {
            System.out.println("Player " + (1 + a) + " Name:");
            String val = scanner.next();
            player = new Player(val);
            players.add(player);
            a++;
        }
        showPlayers();
    }


    /**
     * HÄR INNE VISAS SPELARE SOM ÄR SKAPADE
     */
    private void showPlayers() {
        System.out.println("amount of players: " + players.size());
        for (Player i : players) {
            System.out.println("----------------");
            System.out.println(i.name + " Money: " + i.cash);
        }

        nextMove();

    }


    public void nextMove() {

        // Hur ska jag få spelare separat från listan?
        int num = 0;
        int a = 0;

        while (rounds > num && a == 0) {
            for (Player p : players) {
                System.out.println("\n" + p.name + " Make your move " + p.getBalance()+ "\n");
                System.out.print("----------------------------->");
                p.getAnimals();
                p.showFood();

                System.out.println("\n");
                System.out.println("1. Buy an Animal   2. Buy Foods   3. Feed animal   4. Sell Animal   5. Procreate Animal    6. Save Game");
                int val = scanner.nextInt();

                switch (val) {
                    case 1:
                        store = new Store(p);
                        store.buyAnimal();

                        break;
                    case 2:
                        store = new Store(p);
                        store.buyFood();

                        break;
                    case 3:
                        p.feedAnimal();

                        break;
                    case 4:
                        store.sellAnimals();
                        break;

                    case 5:
                        player.proCreateAnimals();
                        break;

                    case 6:
                        save = new AnimalSavedInstance();
                        for (Player player : players){
                            save.save(player, rounds - num);
                        }
                        a = 1;
                        exit();
                        break;

                }
                    p.DeclineAnimal();

            }

            num++; // round finished, add to roundCounter
        } // end of while loop
        endGame();
    }// end of nextMove method



    void endGame() {
        if (this.store == null ){

            exit();
        }


        else {
            int largest = players.get(0).getBalance();
            for (Player p : players) {
                store.sellAllAnimals();

            }
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getBalance() > largest) {
                    largest = players.get(i).getBalance();
                    winnerName = players.get(i).getName();
                }
            }
            System.out.println("The winner is: " + winnerName + " Balance: " + largest);
        }

    }
    void exit(){
        System.out.println("The Game is now saved");
        System.out.println("Exiting Game...");

    }

}


