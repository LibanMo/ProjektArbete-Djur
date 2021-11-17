package animalGame;

import animalGame.animals.*;
import animalGame.animals.models.Animal;

import java.io.Serializable;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class BabyFactory implements Serializable {

    Cow cow;
    Sheep sheep;
    Chicken chicken;
    Horse horse;
    Goat goat;


    public void proCreate(Player player, Animal animalMale, Animal animalFemale) {
        Scanner sc = new Scanner(System.in);


        if (Objects.equals(animalMale.getType(), animalFemale.getType())) {
            if (animalFemale.getGender().equalsIgnoreCase("Girl")) {
                Random random = new Random();
                int choice = random.nextInt(2) + 1;
                switch (choice) {
                    case 1:
                        System.out.println("No baby this time sorry...");
                        break;

                    case 2:
                        int choiceTwo = random.nextInt(2) + 1;
                        switch (choiceTwo) {
                            case 1:
                                String type = animalMale.animalType();
                                switch (type) {
                                    case "Chicken":
                                        System.out.println("You got a male, what's its name going to be?");
                                        String chickenMale = sc.nextLine();
                                        chicken = new Chicken(chickenMale);
                                        chicken.setGender("Boy");
                                        chicken.setType(type);
                                        player.addBaby(chicken);
                                        break;

                                    case "Sheep":
                                        System.out.println("You got a male, what's its name going to be?");
                                        String sheepMale = sc.nextLine();
                                        sheep = new Sheep(sheepMale);
                                        sheep.setGender("Boy");
                                        sheep.setType(type);
                                        player.addBaby(sheep);
                                        break;

                                    case "Goat":
                                        System.out.println("You got a male, what's its name going to be?");
                                        String goatMale = sc.nextLine();
                                        goat = new Goat(goatMale);
                                        goat.setGender("Boy");
                                        goat.setType(type);
                                        player.addBaby(goat);
                                        break;

                                    case "Cow":
                                        System.out.println("You got a male, what's its name going to be?");
                                        String cowMale = sc.nextLine();
                                        cow = new Cow(cowMale);
                                        cow.setGender("Boy");
                                        cow.setType(type);
                                        player.addBaby(cow);
                                        break;


                                    case "Horse":
                                        System.out.println("You got a male, what's its name going to be?");
                                        String horseMale = sc.nextLine();
                                        horse = new Horse(horseMale);
                                        horse.setGender("Boy");
                                        horse.setType(type);
                                        player.addBaby(horse);
                                        break;
                                }

                            case 2:
                                String femaleType = animalFemale.animalType();
                                switch (femaleType) {
                                    case "Chicken":
                                        System.out.println("You got a female, what's its name going to be?");
                                        String chickenFemale = sc.nextLine();
                                        chicken = new Chicken(chickenFemale);
                                        chicken.setGender("Girl");
                                        chicken.setType(femaleType);
                                        player.addBaby(chicken);
                                        break;

                                    case "Sheep":
                                        System.out.println("You got a female, what's its name going to be?");
                                        String sheepFemale = sc.nextLine();
                                        sheep = new Sheep(sheepFemale);
                                        chicken.setGender("Girl");
                                        chicken.setType(femaleType);
                                        player.addBaby(sheep);
                                        break;

                                    case "Goat":
                                        System.out.println("You got a female, what's its name going to be?");
                                        String goatFemale = sc.nextLine();
                                        goat = new Goat(goatFemale);
                                        goat.setGender("Girl");
                                        goat.setType(femaleType);
                                        player.addBaby(goat);
                                        break;

                                    case "Cow":
                                        System.out.println("You got a female, what's its name going to be?");
                                        String cowFemale = sc.nextLine();
                                        cow = new Cow(cowFemale);
                                        cow.setGender("Girl");
                                        cow.setType(femaleType);
                                        player.addBaby(cow);
                                        break;

                                    case "Horse":
                                        System.out.println("You got a female, what's its name going to be?");
                                        String horseFemale = sc.nextLine();
                                        horse = new Horse(horseFemale);
                                        horse.setGender("Girl");
                                        horse.setType(femaleType);
                                        player.addBaby(horse);
                                        break;


                                }
                        }
                }
            }
        }

    }
}