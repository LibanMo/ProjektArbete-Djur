package animalGame;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// här inne ska spelet köras, vi behöver skapa hjälpmetoder som hänvisar spelaren om spelet.

public class Game {
    int users; // Hur många spelare som är med
    int rounds; // ANTALET RUNDOR
    Player createdPlayer;
    List<Player> players; // LISTA AV OBJEKT PLAYER
    Store store;
    Scanner scanner = new Scanner(System.in);
    String winnerName;
    int maxRounds = 30;
    int minRounds = 5;
    int minPlayers = 2;
    int maxPlayers = 4;

    int currentRound;


    /**
     * I Game konstruktor matar spelaren antigen 1 för starta ett nytt spel.
     * eller matar man in 2 för att kunna läsa in filen där tidigare spel har sparats
     * @author Liban Mohamed
     */
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
                this.nextMove();
                break;
        }

}

    /**
     * I denna metoden läser man in tidigare skapade filer för att sedan kunna läsa av dom.
     * det tidigare inmatade filen tas in i FileHandler.loadsaveGame.
     * ifall filen inte skulle finnas får man ett felmeddelande om att filen inte existerar
     * @author Liban Mohamed
     */
    private void loadFromFile() {
        System.out.println("Choose a filename");
        String filename = scanner.next();
        SavedGame savedGame = FileHandler.loadSavedGame(filename);
        if(savedGame != null){
            this.players = savedGame.getPlayers();
            this.currentRound = savedGame.getCurrentRound();
            this.rounds = savedGame.getRounds();

        }
        else{
            System.out.println("The entered file does not exist");
            System.out.println("Exiting game...");
        }

    }

    /**
     * I denna metod sparar man spelet, det som sparats är listan av spelare i game.
     * Samt sparar vi också ronderna man skall spela och den ronden man befinner sig i när spelet sparas
     * @author Liban Mohamed
     */
    private void saveToFile(){
        System.out.println("Choose a filename to save");
        String newFile = scanner.next();
        SavedGame savedGame = new SavedGame(rounds, currentRound, players);
        FileHandler.saveGameRuntime(savedGame, newFile);



    }


    /**
     * Denna metod fungerar som en hjälp metod fär att kunna hänvisa spelaren att mata in antalet spelare
     * (2-4) som minimum och maximum,
     * Därefter hänvisar vi spelaren om att hen ska mata in antalet rundor som ska spelas (5-30)
     * Innan programmets slut kallas metoden createPlayers för att fortsätta med programmet.
     * @author Liban Mohamed
     */

    private void startMenu() {
        System.out.println("How many players are playing: ");
        users = scanner.nextInt();
        if(users < minPlayers ){
            System.out.println("You have entered to few players");
            System.out.println("How many players are playing: ");
            users = scanner.nextInt();
        }
        else if(users > maxPlayers){
            System.out.println("You have entered to many players\"");
            System.out.println("How many players are playing: ");
            users = scanner.nextInt();
        }

         System.out.println("There is " + users + " players\n");
         System.out.println("How many rounds would you like to play (5-30) ");
         rounds = scanner.nextInt();



        if (rounds > maxRounds){
            System.out.println("You have entered to many rounds");
            System.out.println("How many rounds would you like to play (5-30)");
            rounds = scanner.nextInt();
        }
        if(rounds < minRounds){
            System.out.println("You have entered to few rounds");
            System.out.println("How many rounds would you like to play (5-30)");
            rounds = scanner.nextInt();
        }
        System.out.println(rounds + " Rounds...\n");

        createPlayers();


    }


    /**
     * DENNA METOD SKAPAR NYA SPELARE SEDAN STORAS DOM INNE HOS LISTAN AV TYP SPELARE
     * Listan fylls på tills den tidigare inmatade värdet av users är lika med variablen a.
     * När listan sedan fyllts på med spelare fortsätter den vidare.
     * @author Liban Mohamed , Felah Hassan, Fahim Hadi
     */

    private void createPlayers() {
        players = new ArrayList<>();
        int a = 0;

        // for loop med int i=0, i<users; i++
        while (users != a) {
            System.out.println("Player " + (1 + a) + " Name:");
            String val = scanner.next();
            createdPlayer = new Player(val);
            players.add(createdPlayer);
            a++;
        }
        showPlayers();
    }


    /**
     * HÄR INNE VISAS SPELARE SOM ÄR SKAPADE
     * SAMT VISAS OCKSÅ DERAS PENGAR SOM DOM FÅR VID SPELETS BÖRJAN
     * DENNA PLÅNBOK ÄR DET MAN HANDLAR MED OCH SAMMA PLÅNBOK ÄR DET SOM AVGÖR VEM SOM VINNER
     * DEN MED MEST PENGAR VID SPELETS SLUT VINNER
     * @author Liban Mohamed, Felah Hassan, Fahim Hadi
     */
    private void showPlayers() {
        System.out.println("amount of players: " + players.size());
        for (Player i : players) {
            System.out.println("----------------");
            System.out.println(i.name + " Money: " + i.cash);
        }

        nextMove();

    }


    /**
     * Här inne börjar spelet där allt som spelaren kan göra med sina drag visas upp med en textrad
     * Spelet körs så länge den tidigare inmatade variabeln currentrounds är lika med rounds
     * som är antalet rundor man ska spela.
     *
     * Switch caset ser sedan till att spelaren val hanteras där varje case kallar en ny metod
     * efter spelaren har gjort sitt drag kommer det gå vidare till nästa spelare i listan.
     * När samtliga spelare har gjort sina drag kommer man sedan att öka med currentround med 1.
     * Denna metod körs hela tiden tills alla rundor är färdig spelade.
     *
     *@author Liban Mohamed, Felah Hassan, Fahim Hadi
     */
    public void nextMove() {

        // Hur ska jag få spelare separat från listan?
        currentRound = 0;


        while (rounds > currentRound ) {
            for (Player p : players) {
                System.out.println("\n" + p.name + " Make your move " + p.getBalance()+ "\n");
                System.out.print("----------------------------->");
                p.agingPlayerAnimals();
                p.checkAnimalHealth();
                p.getAnimals();


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
                        p.showFood();
                        p.feedAnimal();

                        break;
                    case 4:
                        store = new Store(p);
                        store.sellAnimals();
                        break;

                    case 5:

                        p.proCreateAnimals();
                        break;

                    case 6:
                        saveToFile();

                        exit();


                }
                    p.DeclineAnimal();

            }

            currentRound++; // round finished, add to roundCounter
        } // end of while loop
        endGame();
    }// end of nextMove method

    /**
     * Denna metod är sker avgörandet på vem är dom som vann när spelet är färdig spelad.
     * För varje spelare som är med tar man deras djur för att sälja dom till store klassen.
     * När alla djur har sålts får spelaren sina pengar i sin plånbok för att sedan kunna
     * jämföra med dom andra spelarna.
     * Den med mest pengar sätts in i variabeln largest av typ int.
     * Spelaren som vann skrivs ner i en textrad där namnet på spelaren och summan av pengar har i sin plånbok
     *
     * @author Liban Mohamed, Felah Hassan, Fahim Hadi
     */

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

    /**
     * Denna metod kallas när en spelare valt att spara spelet.
     * Denna metoden serv till att samtliga spelare vet spelet har avslutas.
     * Sedan avslutas hela programmet.
     *
     * @author Liban Mohamed
     */
    void exit(){
        System.out.println("The Game is now saved");
        System.out.println("Exiting Game...");
        System.exit(0);

    }

}


