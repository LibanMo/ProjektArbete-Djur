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


    // Konstruktor
    public Game(){
        System.out.println("Hey Welcome"); // HÄLSING INNAN SPEL
        startMenu();

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

        while (rounds > num) {
            for (Player p : players) {
                System.out.println("\n" + p.name + " Make your move " + p.getBalance()+ "\n");
                System.out.print("----------------------------->");
                p.getAnimals();
                p.showFood();

                System.out.println("\n");
                System.out.println("1. Buy an Animal   2. Buy Foods   3. Feed animal   4. Sell Animal   5. Procreate Animal");
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
                        System.out.println("Option 4");
                        break;

                    case 5:
                        System.out.println("Option 5");
                        break;


                }
                    p.DeclineAnimal();

            }

            num++;


        }
    }
}


