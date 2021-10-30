package animalGame;

import animalGame.animals.*;

import java.util.Scanner;



public class Store {



    Player player;
    Scanner sc = new Scanner(System.in);
    int thePrice;
    int cardScan;
    Horse horse;
    Chicken chicken;
    Cow cow;
    Sheep sheep;
    Goat goat;




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
        System.out.println("1. Chicken     2. Horse     3. Cow     4. Goat     5. Sheep");

        int val = sc.nextInt();

        switch (val){
            case 1:
                switch (val){
                    case 1:

                        System.out.println("The Chicken Costs 150");
                        thePrice = 150;
                        cardScan = this.player.cash;

                        if(thePrice > cardScan){
                            System.out.println("The card got declined");
                        }
                        else{
                          int newer =   cardScan -= thePrice;
                          player.setBalance(newer);

                            System.out.println("Name Your Chicken...");
                            String name = sc.next();
                            this.chicken = new Chicken(name);
                            System.out.println("What Gender:  1. Boy    0 . Girl");
                            int Gender = sc.nextInt();
                            switch (Gender) {
                                case 1:
                                    chicken.setGender("Boy");
                                    break;

                                case 0:
                                    chicken.setGender("Girl");
                            }

                            player.animals.add(chicken);

                            System.out.println("New Balance: " + cardScan);
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


                    case 3:
                        System.out.println("The Cow costs 400");
                        thePrice = 400;
                        cardScan = player.cash;

                        if(thePrice > cardScan){
                            System.out.println("The card got declined");
                        }
                        else{

                            System.out.println("Name your Cow");
                            String name = sc.nextLine();
                            cow = new Cow(name);
                            System.out.println("Gender of your horse  1. Boy    2. Girl");
                            int gender = sc.nextInt();
                            switch(gender){
                                case 1:
                                    cow.setGender("Boy");
                                    break;

                                case 2:

                                    cow.setGender("Girl");
                                    break;
                            }

                            player.cash -= thePrice;
                            System.out.println("New Balance: " + player.cash);
                        }
                        break;


                    case 4:
                        System.out.println("The Goat costs 300");
                        thePrice = 300;
                        cardScan = player.cash;

                        if(thePrice > cardScan){
                            System.out.println("The card got declined");
                        }
                        else{

                            System.out.println("Name your Goat");
                            String name = sc.nextLine();
                            goat = new Goat(name);
                            System.out.println("Gender of your horse  1. Boy    2. Girl");
                            int gender = sc.nextInt();
                            switch(gender){
                                case 1:
                                    goat.setGender("Boy");
                                    break;

                                case 2:

                                    goat.setGender("Girl");
                                    break;
                            }

                            player.cash -= thePrice;
                            System.out.println("New Balance: " + player.cash);
                        }
                        break;

                    case 5:
                        System.out.println("The Sheep costs 250");
                        thePrice = 250;
                        cardScan = player.cash;

                        if(thePrice > cardScan){
                            System.out.println("The card got declined");
                        }
                        else{

                            System.out.println("Name your Sheep");
                            String name = sc.nextLine();
                            sheep = new Sheep(name);
                            System.out.println("Gender of your horse  1. Boy    2. Girl");
                            int gender = sc.nextInt();
                            switch(gender){
                                case 1:
                                    goat.setGender("Boy");
                                    break;

                                case 2:

                                    goat.setGender("Girl");
                                    break;
                            }

                            player.cash -= thePrice;
                            System.out.println("New Balance: " + player.cash);
                        }
                        break;

                }




        }
    }
}


