package animalGame;

import animalGame.Foods.Corn;
import animalGame.Foods.Soy;
import animalGame.Foods.Wheat;
import animalGame.animals.*;
import animalGame.animals.models.Animal;

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
    Wheat wheat;
    Corn corn;
    Soy soy;

    int horsePrice = 500;
    int cowPrice = 450;
    int chickenPrice = 150;
    int goatPrice = 300;
    int sheepPrice = 250;

    int amount;
    int Total;




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

    public void buyAnimal() {
        System.out.println("Hey Welcome to  our store");
        System.out.println("Would You Like to Buy?: ");
        System.out.println("1. Chicken     2. Horse     3. Cow     4. Goat     5. Sheep");

        int val = sc.nextInt();

        switch (val){
            case 1:

                        System.out.println("The Chicken Costs " + chickenPrice);

                        cardScan = this.player.cash;

                        if(chickenPrice > cardScan){
                            System.out.println("The card got declined");
                        }
                        else{
                          int newer =   cardScan -= chickenPrice;
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

                System.out.println("A Horse costs " + horsePrice);

                cardScan = this.player.cash;

                if(horsePrice> cardScan){
                    System.out.println("The card got declined");
                }
                else{
                    int newer =   cardScan -= horsePrice;
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

                System.out.println("A Cow costs "+ cowPrice);

                cardScan = this.player.cash;

                if(cowPrice > cardScan){
                    System.out.println("The card got declined");
                }
                else{
                    int newer =   cardScan -= cowPrice;
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

                System.out.println("The Goat Costs " + goatPrice);

                cardScan = this.player.cash;

                if(goatPrice > cardScan){
                    System.out.println("The card got declined");
                }
                else{
                    int newer =   cardScan -= goatPrice;
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

                System.out.println("The Sheep Costs " + sheepPrice);

                cardScan = this.player.cash;

                if(sheepPrice > cardScan){
                    System.out.println("The card got declined");
                }
                else{
                    int newer =   cardScan -= sheepPrice;
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

        public void buyFood(){
            System.out.println("Today in store we have ");
            System.out.println("1. Wheat [100]    2. Soy [150]    3. Corn [200]");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    thePrice = 100;
                    System.out.println("A Kilo of Wheat costs 100");
                    System.out.println("Enter amount of kilo you want to buy");
                    amount = sc.nextInt();
                    Total = amount * thePrice;
                    System.out.println("Your Total comes to " + Total + "\n");
                    cardScan = this.player.cash;

                    if(Total > cardScan){
                        System.out.println("***Declined***\n");

                    }
                    else if(Total < cardScan){
                        System.out.println("***Accepted***");
                        int num = 0;
                        while(num != amount){
                            wheat = new Wheat();
                            player.addFood(wheat);
                            num ++;

                        }
                        int newer = cardScan - Total;
                        player.setBalance(newer);
                    }
                    break;

                case 2:
                    thePrice =  150;
                    System.out.println("A Kilo of Soy costs 100");
                    System.out.println("Enter amount of kilo you want to buy");
                    amount = sc.nextInt();
                    Total = amount * thePrice;
                    System.out.println("Your Total comes to " + Total + "\n");
                    cardScan = this.player.cash;

                    if(Total > cardScan){
                        System.out.println("***Declined***\n");
                        buyFood();

                    }
                    else if(Total < cardScan){
                        System.out.println("***Accepted***");
                        int num = 0;
                        while(num != amount){
                            soy = new Soy();
                            player.addFood(soy);

                            num ++;


                        }
                        int newer = cardScan - Total;
                        player.setBalance(newer);
                    }
                    break;

                case 3:
                    thePrice =  200;
                    System.out.println("A Kilo of Corn costs 200");
                    System.out.println("Enter amount of kilo you want to buy");
                    amount = sc.nextInt();
                    Total = amount * thePrice;
                    System.out.println("Your Total comes to " + Total + "\n");
                    cardScan = this.player.cash;

                    if(Total > cardScan){
                        System.out.println("***Declined***\n");

                    }
                    else if(Total < cardScan){
                        System.out.println("***Accepted***");
                        int num = 0;
                        while(num != amount){
                            corn = new Corn();
                            player.addFood(corn);
                            num ++;

                        }
                        int newer = cardScan - Total;
                        player.setBalance(newer);
                    }
                    break;

         }

     }

       void sellAnimals(){
           System.out.println("Hey! So you want to sell one of ur animals?\n");
           System.out.println("Enter the number next to the animal you wish to sell");
           int choice = sc.nextInt();
           for(int i = 0; i <= player.animals.size(); i++){
               System.out.println(i + ": " + player.animals.get(i) + " Health: " + player.animals.get(i).getHealth() + " Age: " + player.animals.get(i).getAge() );

           }
           String whatType = player.animals.get(choice).getType();
           switch (whatType){
               case "Chicken":
                   int payOut =(chickenPrice * player.animals.get(choice).getHealth()) - player.animals.get(choice).getAge() * 5;


           }

     }
    }



