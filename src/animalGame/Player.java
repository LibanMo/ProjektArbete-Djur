package animalGame;

import animalGame.Foods.Corn;
import animalGame.Foods.Soy;
import animalGame.Foods.Wheat;
import animalGame.Foods.models.Food;
import animalGame.animals.models.Animal;
import animalGame.Foods.Soy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Player {
    String name;
    int cash = 5000;

    Soy soy = new Soy();
    Wheat wheat = new Wheat();
    Corn corn = new Corn();
    Store store;
    Scanner sc = new Scanner(System.in);
    HashMap<String, ArrayList<String>> multipleValues = new HashMap<String, ArrayList<String>>();
    BabyFactory BabyFactory = new BabyFactory();

    ArrayList<Animal> animals = new ArrayList<Animal>();
    ArrayList<Food> myFood = new ArrayList<Food>();


// player.chickens.add()


    public Player(String name) {
        this.name = name;

    }


    public void setBalance(int cash) {
        this.cash = cash;
    }


    public Integer getBalance() {
        return cash;
    }

    public String getName() {
        return name;
    }

    public void getAnimals() {
        for (Animal animal : animals) {
            if (animal.getHealth() <= 0){
                multipleValues.remove(animal.animalType());
            }
            else {
                multipleValues.put(animal.animalType(), new ArrayList<String>());
                multipleValues.get(animal.animalType()).add(animal.getName());
                multipleValues.get(animal.animalType()).add(animal.getGender());
                multipleValues.get(animal.animalType()).add(animal.showHealth());
                multipleValues.get(animal.animalType()).add(animal.getDecline());
                System.out.println(multipleValues);
            }

        }
    }

    void DeclineAnimal() {
        for (Animal animal : animals) {
            if (animals.isEmpty()) {
                break;
            } else {
                animal.healthDecline();
            }


        }
    }

    void addFood(Food food) {
        myFood.add(food);
    }

    void showFood() {
        for (Food food : myFood) {
            System.out.println(food.getType());
        }
    }

    //  HÄR INNE KOMMER JAG KUNNA MATA DJURET, DET SOM KRÄVS ÄR ETT SÄTT INDEX DJURET MED INT I FÖR ATT SEDAN VÄLJA DEN

    void feedAnimal() {
        System.out.println("Which Animal would you want to feed");
        System.out.println("Enter the number next to your animal");
        int i = 0;

        for (Animal a : animals) {
            System.out.println(i + ": " + a.getName() + " Health: " + a.getHealth());
            i++;

        }
        int whoToFeed = sc.nextInt();
        System.out.println("1. Wheat   2. Soy   3. Corn  ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:

                animals.get(whoToFeed).feed("Wheat");
                for (Food f : myFood) {

                    if (f.getType().equalsIgnoreCase("Wheat")) {
                        myFood.remove(f);
                        break;
                    }
                }
                break;

            case 2:
                animals.get(whoToFeed).feed("Soy");
                for (Food f : myFood) {
                    if (f.getType().equalsIgnoreCase("Soy")) {
                        myFood.remove(f);
                        break;
                    }
                }
                break;

            case 3:
                animals.get(whoToFeed).feed("Corn");
                for (Food f : myFood) {
                    if (f.getType().equalsIgnoreCase("Corn")) {
                        myFood.remove(f);
                        break;
                    }
                }
                break;


        }

    }

    public void proCreateAnimals() {
        System.out.println("Choose one animal type to procreate");
        System.out.println("1. Chicken   2. Sheep   3. Goat   4. Cow   5. Horse");
        int switcher = sc.nextInt();
        switch (switcher) {
            case 1:
                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Chicken")) {
                        System.out.println(i + ": " + animals.get(i).animalType() + " Gender: " + animals.get(i).getGender());
                    } // Här inne ska alla djur som finns med i listan utifrån den inmatade värdet

                }
                System.out.println("Choose one Male chicken, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Chicken")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Boy")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int chickenMaleChoice = sc.nextInt();
                System.out.println("Choose a Female chicken, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Chicken")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int chickenFemaleChoice = sc.nextInt();
                // animals.get(maleChoice).proCreate(animals.get(femaleChoice));
                BabyFactory.proCreate(this, animals.get(chickenMaleChoice), animals.get(chickenFemaleChoice));
                break;


            case 2:
                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Sheep")) {
                        System.out.println(i + ": " + animals.get(i).animalType() + " Gender: " + animals.get(i).getGender());
                    } // Här inne ska alla djur som finns med i listan utifrån den inmatade värdet

                }
                System.out.println("Choose one Male Sheep, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Sheep")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Boy")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int sheepMaleChoice = sc.nextInt();
                System.out.println("Choose a Female Sheep, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Sheep")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int sheepFemaleChoice = sc.nextInt();
                // animals.get(maleChoice).proCreate(animals.get(femaleChoice));
                BabyFactory.proCreate(this, animals.get(sheepMaleChoice), animals.get(sheepFemaleChoice));

                break;

            case 3:
                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Goat")) {
                        System.out.println(i + ": " + animals.get(i).animalType() + " Gender: " + animals.get(i).getGender());
                    } // Här inne ska alla djur som finns med i listan utifrån den inmatade värdet

                }
                System.out.println("Choose one Male Goat, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Goat")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Boy")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int goatMaleChoice = sc.nextInt();
                System.out.println("Choose a Female Goat, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Goat")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int goatFemaleChoice = sc.nextInt();
                // animals.get(maleChoice).proCreate(animals.get(femaleChoice));
                BabyFactory.proCreate(this, animals.get(goatMaleChoice), animals.get(goatFemaleChoice));
                break;

            case 4:
                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Cow")) {
                        System.out.println(i + ": " + animals.get(i).animalType() + " Gender: " + animals.get(i).getGender());
                    } // Här inne ska alla djur som finns med i listan utifrån den inmatade värdet

                }
                System.out.println("Choose one Male Cow, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Cow")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Boy")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int cowMaleChoice = sc.nextInt();
                System.out.println("Choose a Female Cow, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Cow")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int cowFemaleChoice = sc.nextInt();
                // animals.get(maleChoice).proCreate(animals.get(femaleChoice));
                BabyFactory.proCreate(this, animals.get(cowMaleChoice), animals.get(cowFemaleChoice));
                break;

            case 5:
                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Horse")) {
                        System.out.println(i + ": " + animals.get(i).animalType() + " Gender: " + animals.get(i).getGender());
                    } // Här inne ska alla djur som finns med i listan utifrån den inmatade värdet

                }
                System.out.println("Choose one Male Horse, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Horse")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Boy")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int horseMaleChoice = sc.nextInt();
                System.out.println("Choose a Female Horse, Enter the index next to the animal");

                for (int i = 0; i < animals.size(); i++) {
                    if (animals.get(i).getType().equalsIgnoreCase("Horse")) {
                        if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                            System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                        }
                    }
                }
                int horseFemaleChoice = sc.nextInt();
                // animals.get(maleChoice).proCreate(animals.get(femaleChoice));
                BabyFactory.proCreate(this, animals.get(horseMaleChoice), animals.get(horseFemaleChoice));
                break;


        }


    }

    public void addBaby(Animal animal) {
        animals.add(animal);
    }






}




















