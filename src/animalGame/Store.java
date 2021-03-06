package animalGame;

import animalGame.Foods.Corn;
import animalGame.Foods.Soy;
import animalGame.Foods.Wheat;
import animalGame.animals.*;
import animalGame.animals.models.Animal;

import java.io.Serializable;
import java.util.Scanner;



public class Store implements Serializable {

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
    int payOut; // Priset för det sålda djuret.


    //DETTA SKA REPRENSETRA EN BUTIK

    // I EN BUTIK KAN KÖPET NEKAS


    public Store(Player player) {
        this.player = player;
    }

    /**
     * DENNA METOD KOMMER AGERA SOM EN RIKTIG BUTIK.
     * KUNDENS SALDO KOMMER JÄMFÖRA MED DET SOM SÄLJS PRIS.
     * OM SPELARENS SALDO ÄR TILLRÄCKLIGT FORTSÄTTER BUTIKEN SOM FRÅGOR OM DJURETS NAMN OCH KÖN.
     * TILL SLUT LÄGGS SPELARENS DJUR I EN LISTA MED SAMMA OBJEKT SOM DJURETS SOM KÖPTES
     *
     * @author Liban Mohamed
     */

    public void buyAnimal() {
        System.out.println("Hey Welcome to  our store");
        System.out.println("Would You Like to Buy?: ");
        System.out.println("1. Chicken     2. Horse     3. Cow     4. Goat     5. Sheep");

        int val = sc.nextInt();

        switch (val) {
            case 1:

                System.out.println("The Chicken Costs " + chickenPrice);

                cardScan = this.player.cash;

                if (chickenPrice > cardScan) {
                    System.out.println("The card got declined");
                } else {
                    int newer = cardScan -= chickenPrice;
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

                if (horsePrice > cardScan) {
                    System.out.println("The card got declined");
                } else {
                    int newer = cardScan -= horsePrice;
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

                System.out.println("A Cow costs " + cowPrice);

                cardScan = this.player.cash;

                if (cowPrice > cardScan) {
                    System.out.println("The card got declined");
                } else {
                    int newer = cardScan -= cowPrice;
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

                if (goatPrice > cardScan) {
                    System.out.println("The card got declined");
                } else {
                    int newer = cardScan -= goatPrice;
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

                if (sheepPrice > cardScan) {
                    System.out.println("The card got declined");
                } else {
                    int newer = cardScan -= sheepPrice;
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

    /**
     * Denna metod kallas ifall spelaren skulle vilja köpa mat.
     * Man får 3 alternativ på mat. När spelaren har valt mat
     * Kollar butiken ifall saldot är tillräckligt fär att sedan dra av beloppet från spelaren plånbok
     *
     * @author Liban Mohamed
     */

    public void buyFood() {
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

                if (Total > cardScan) {
                    System.out.println("***Declined***\n");

                } else if (Total < cardScan) {
                    System.out.println("***Accepted***");
                    int num = 0;
                    while (num != amount) {
                        wheat = new Wheat();
                        player.addFood(wheat);
                        num++;

                    }
                    int newer = cardScan - Total;
                    player.setBalance(newer);
                }
                break;

            case 2:
                thePrice = 150;
                System.out.println("A Kilo of Soy costs 100");
                System.out.println("Enter amount of kilo you want to buy");
                amount = sc.nextInt();
                Total = amount * thePrice;
                System.out.println("Your Total comes to " + Total + "\n");
                cardScan = this.player.cash;

                if (Total > cardScan) {
                    System.out.println("***Declined***\n");
                    buyFood();

                } else if (Total < cardScan) {
                    System.out.println("***Accepted***");
                    int num = 0;
                    while (num != amount) {
                        soy = new Soy();
                        player.addFood(soy);

                        num++;


                    }
                    int newer = cardScan - Total;
                    player.setBalance(newer);
                }
                break;

            case 3:
                thePrice = 200;
                System.out.println("A Kilo of Corn costs 200");
                System.out.println("Enter amount of kilo you want to buy");
                amount = sc.nextInt();
                Total = amount * thePrice;
                System.out.println("Your Total comes to " + Total + "\n");
                cardScan = this.player.cash;

                if (Total > cardScan) {
                    System.out.println("***Declined***\n");

                } else if (Total < cardScan) {
                    System.out.println("***Accepted***");
                    int num = 0;
                    while (num != amount) {
                        corn = new Corn();
                        player.addFood(corn);
                        num++;

                    }
                    int newer = cardScan - Total;
                    player.setBalance(newer);
                }
                break;

        }

    }

    /**
     * Denna metoden är en metod som låter spelaren välja ett djur från sin lista
     * för att sedan kunna sälja den, spelaren skall sedan få sin plånbok ökas med
     * priset Denna klass väljer att erbjuda playern
     *
     * @author Liban Mohamed
     */

    void sellAnimals() {
        if(player.animals.isEmpty()) {
            System.out.println("This Does not work");
            System.out.println("You need to own animals to sell");
        }


        else {
        System.out.println("Hey! So you want to sell one of ur animals?\n");
        System.out.println("Enter the number next to the animal you wish to sell");



            for (int i = 0; i < player.animals.size(); i++) {
                System.out.println(i + ": " + player.animals.get(i).animalType() + " Health: " + player.animals.get(i).getHealth() + " Age: " + player.animals.get(i).getAge());

            }
            int choice = sc.nextInt();
            String whatType = player.animals.get(choice).getType();
            switch (whatType) {
                case "Chicken":
                    payOut = (chickenPrice * (player.animals.get(choice).getHealth()) / 100) - (player.animals.get(choice).showAge() * 5);
                    player.animals.remove(choice);
                    System.out.println("The price for your Chicken is " + payOut);
                    int newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

                case "Sheep":
                    payOut = (sheepPrice * (player.animals.get(choice).getHealth()) / 100) - (player.animals.get(choice).showAge() * 5);
                    player.animals.remove(choice);
                    System.out.println("The price for your Sheep is " + payOut);
                    newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

                case "Goat":
                    payOut = (goatPrice * (player.animals.get(choice).getHealth()) / 100) - (player.animals.get(choice).showAge() * 5);
                    player.animals.remove(choice);
                    System.out.println("The price for your Goat is " + payOut);
                    newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

                case "Cow":
                    payOut = (cowPrice * (player.animals.get(choice).getHealth()) / 100) - (player.animals.get(choice).showAge() * 5);
                    player.animals.remove(choice);
                    System.out.println("The price for your Cow is " + payOut);
                    newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

                case "Horse":
                    payOut = (horsePrice * (player.animals.get(choice).getHealth()) / 100) - (player.animals.get(choice).showAge() * 5);
                    player.animals.remove(choice);
                    System.out.println("The price for your Horse is " + payOut);
                    newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;


            }
        }
    }

    /**
     * Denna metoden använder sig sav en spelaren lista av djur för att sedan värdera dom.
     * Därefter köper butiken djuren och fyller spelarens plånbok med den summa alla djur var värda
     *
     * @author Liban Mohamed
     */
    public void sellAllAnimals() {

        for(Animal a : player.animals){
            String animalType = a.getType();
            switch(animalType){
                case "Chicken":
                    payOut = (chickenPrice * (a.getHealth()) / 100) - (a.showAge() * 5);
                    int newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

                case "Sheep":
                    payOut = (sheepPrice * (a.getHealth()) / 100) - (a.showAge() * 5);
                    newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

                case "Goat":
                    payOut = (goatPrice * (a.getHealth()) / 100) - (a.showAge() * 5);
                    newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

                case "Cow":
                    payOut = (cowPrice * (a.getHealth()) / 100) - (a.showAge() * 5);
                    newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

                case "Horse":
                    payOut = (horsePrice * (a.getHealth()) / 100) - (a.showAge() * 5);
                    newer = player.cash + payOut;
                    player.setBalance(newer);
                    break;

            }


        }



    }
}



