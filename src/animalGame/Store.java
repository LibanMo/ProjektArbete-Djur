package animalGame;

import animalGame.animals.Chicken;
import animalGame.animals.Horse;

import java.util.Scanner;



public class Store {



    Player player;
    Scanner sc = new Scanner(System.in);
    int thePrice;
    int cardScan;
    Horse horse;
    Chicken chicken;



    //DETTA SKA REPRENSETRA EN BUTIK

    // I EN BUTIK KAN KÖPET NEKAS


    public Store(Player player){
        this.player = player;
    }

    /**
     * DENNA METOD KOMMER AGERA SOM EN RIKTIG BUTIK.
     * KUNDENS SALDO KOMMER JÄMFLÖRAS MED DET SOM SÄLJS PRIS.
     * OM SPELARENS SALDO ÄR TILLRÄCKLIGT FORSTÄTTER BUTIKEN SOM FRÅGOR OM DJURETS NAMN OCH KÖN.
     * TILLSLUT LÄGS SPELARENS DJUR I EN LISTA MED SAMMA OBJEKT SOM DJURETS SOM KÖPTES
     */

    public void Welcome() {
        System.out.println("Hey Welcome to  our store");
        System.out.println("Would You Like to Buy?: ");
        System.out.println("1. Animal      ");
        int val = sc.nextInt();

        switch (val){
            case 1:
                System.out.println("The animal game.animals u can buy");
                System.out.println("1. Chicken     2. Horse");
                val = sc.nextInt();


                switch (val){
                    case 1:

                        System.out.println("The Chicken Costs 150");
                        thePrice = 150;
                        cardScan = player.cash;

                        if(thePrice > cardScan){
                            System.out.println("The card got declined");
                        }
                        else{

                            player.cash -= thePrice;
                            System.out.println("New Balance: " + player.cash);
                        }
                        break;



                    case 2:
                        System.out.println("The Horse costs 500");
                        thePrice = 500;
                        cardScan = player.cash;

                        if(thePrice > cardScan){
                            System.out.println("The card got declined");
                        }
                        else{

                            System.out.println("Name your Horse");
                            String name = sc.nextLine();
                            horse = new Horse(name);
                            System.out.println("Gender of your horse  1. Boy    2. Girl");
                            int gender = sc.nextInt();
                            switch(gender){
                                case 1:
                                    horse.setGender("Boy");
                                    break;

                                case 2:

                                    horse.setGender("Girl");
                                    break;
                            }

                            player.cash -= thePrice;
                            System.out.println("New Balance: " + player.cash);
                        }
                        break;
                }

                break;

            case 2:
                System.out.println("fixa food klassen");
                break;
        }
    }
}


