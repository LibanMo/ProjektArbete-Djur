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

                System.out.println("A Horse costs 500");
                thePrice = 500;
                cardScan = this.player.cash;

                if(thePrice > cardScan){
                    System.out.println("The card got declined");
                }
                else{
                    int newer =   cardScan -= thePrice;
                    player.setBalance(newer);

                    System.out.println("Name Your Horse...");
                    String name = sc.next();
                    this.horse = new Horse(name);
                    System.out.println("What Gender:  1. Boy    0 . Girl");
                    int Gender = sc.nextInt();
                    switch (Gender) {
                        case 1:
                            horse.setGender("Boy");
                            break;

                        case 0:
                            horse.setGender("Girl");
                    }

                    player.animals.add(horse);

                    System.out.println("New Balance: " + cardScan);
                }
                break;

            case 3:

                System.out.println("A Cow costs 450");
                thePrice = 450;
                cardScan = this.player.cash;

                if(thePrice > cardScan){
                    System.out.println("The card got declined");
                }
                else{
                    int newer =   cardScan -= thePrice;
                    player.setBalance(newer);

                    System.out.println("Name Your Cow...");
                    String name = sc.next();
                    this.cow = new Cow(name);
                    System.out.println("What Gender:  1. Boy    0 . Girl");
                    int Gender = sc.nextInt();
                    switch (Gender) {
                        case 1:
                            cow.setGender("Boy");
                            break;

                        case 0:
                            cow.setGender("Girl");
                    }

                    player.animals.add(cow);

                    System.out.println("New Balance: " + cardScan);
                }
                break;


            case 4:

                System.out.println("The Goat Costs 300");
                thePrice = 300;
                cardScan = this.player.cash;

                if(thePrice > cardScan){
                    System.out.println("The card got declined");
                }
                else{
                    int newer =   cardScan -= thePrice;
                    player.setBalance(newer);

                    System.out.println("Name Your Goat...");
                    String name = sc.next();
                    this.goat = new Goat(name);
                    System.out.println("What Gender:  1. Boy    0 . Girl");
                    int Gender = sc.nextInt();
                    switch (Gender) {
                        case 1:
                            goat.setGender("Boy");
                            break;

                        case 0:
                            goat.setGender("Girl");
                    }

                    player.animals.add(goat);

                    System.out.println("New Balance: " + cardScan);
                }
                break;



            case 5:

                System.out.println("The Sheep Costs 250");
                thePrice = 250;
                cardScan = this.player.cash;

                if(thePrice > cardScan){
                    System.out.println("The card got declined");
                }
                else{
                    int newer =   cardScan -= thePrice;
                    player.setBalance(newer);

                    System.out.println("Name Your Sheep...");
                    String name = sc.next();
                    this.sheep = new Sheep(name);
                    System.out.println("What Gender:  1. Boy    0 . Girl");
                    int Gender = sc.nextInt();
                    switch (Gender) {
                        case 1:
                            sheep.setGender("Boy");
                            break;

                        case 0:
                            sheep.setGender("Girl");
                    }

                    player.animals.add(sheep);

                    System.out.println("New Balance: " + cardScan);
                }
                break;
                }




        }
    }



