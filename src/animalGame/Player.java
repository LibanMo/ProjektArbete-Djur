package animalGame;

import animalGame.Foods.Corn;
import animalGame.Foods.Soy;
import animalGame.Foods.Wheat;
import animalGame.Foods.models.Food;
import animalGame.animals.models.Animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Player implements Serializable {
    String name;
    int cash = 5000;

    Soy soy = new Soy();
    Wheat wheat = new Wheat();
    Corn corn = new Corn();
    Store store;

    HashMap<String, ArrayList<String>> multipleValues = new HashMap<String, ArrayList<String>>();
    BabyFactory BabyFactory = new BabyFactory();

    ArrayList<Animal> animals = new ArrayList<Animal>();
    ArrayList<Food> myFood = new ArrayList<Food>();


    /**
     * Detta är player konstruktör
     *
     * @param name name hänvisar till name i fältet
     *
     */


    public Player(String name) {
        this.name = name;

    }

    /**
     * Denna metoden när en setter för att kunna ge spelaren plånbok ett nytt värde vid köp eller vid försäljning
     * @param cash är den variabeln cash i fältet hänvisas till.
     */
    public void setBalance(int cash) {
        this.cash = cash;
    }

    /**
     *
     * @return Playerns pengar som den ahr att spela med
     */
    public Integer getBalance() {
        return cash;
    }

    /**
     *
     * @return Playerns namn
     */

    public String getName() {
        return name;
    }


    /**
     * Detta ör en hashmap för att kunna visa spelaren vilka djur dom äger samt
     * hälsan, ålder, namnet, könet och hur mycket den minskades senaste rundan
     * @return null ifall listan skulle visa sig vara tom annars visas hashmappen.
     *
     * @author Liban Mohamed
     */
    public Object getAnimals() {
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
                multipleValues.get(animal.animalType()).add(animal.getAge());
                System.out.println(multipleValues);
            }

        }
        return null;
    }

    /**
     * Denna metoden ser till att djuren spelaren äger kommer fp sin hälsa minskad vid varje runda.
     * denna metoden kallas i gameklassen vid varje spelad runda
     */
    void DeclineAnimal() {
        for (Animal animal : animals) {
            if (animals.isEmpty()) {
                break;
            } else {
                animal.healthDecline();
            }


        }
    }

    /**
     * Denna metoden fyller på en lista med typ food med food.
     * Denna metoden kallas i store klassen när man gör att köp av mat
     * @param food är objektet som skall läggas in i listan av mat hos spelaren
     *
     * @author Liban Mohamed
     */

    void addFood(Food food) {
        myFood.add(food);
    }

    /**
     * Denna metoden visar för spelaren om sin food som är lagrade i listan myFood
     */
    void showFood() {
        for (Food food : myFood) {
            System.out.println(food.getType());
        }
    }

    //  HÄR INNE KOMMER JAG KUNNA MATA DJURET, DET SOM KRÄVS ÄR ETT SÄTT INDEX DJURET MED INT I FÖR ATT SEDAN VÄLJA DEN

    /**
     * Denna metod matar ett djur från en spelarens lista av djur
     * Detta gör att man med hjälp av djurets index i listan
     * Ifall man skulle ha djur men ingen mat får man en ett felmeddelande. Samma sak tvärtom
     *
     *@author Liban Mohamed
     */
    void feedAnimal() {
        Scanner sc = new Scanner(System.in);
        if(animals.isEmpty()){
            System.out.println("Hey! :( ");
            System.out.println("You don't have any Animals");
            System.out.println("You have wasted your move");

        }
        else {

        System.out.println("Which Animal would you want to feed");
        System.out.println("Enter the number next to your animal");
        int i = 0;

        for (Animal a : animals) {
            System.out.println(i + ": " + a.getName() + " Health: " + a.getHealth());
            i++;

        }
        int whoToFeed = Integer.parseInt(sc.nextLine());
        System.out.println("1. Wheat   2. Soy   3. Corn  ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                if(myFood.isEmpty()){
                    System.out.println("You don't have any food");
                    System.out.println("You have wasted your move...");
                }



                for (Food f : myFood) {

                    if (f.getType().equalsIgnoreCase("Wheat")) {
                        animals.get(whoToFeed).feed("Wheat");
                        myFood.remove(f);
                        break;
                    }
                }
                break;

            case 2:
                if(myFood.isEmpty()){
                    System.out.println("You don't have any food");
                    System.out.println("You have wasted your move...");
                }
                animals.get(whoToFeed).feed("Soy");
                for (Food f : myFood) {
                    if (f.getType().equalsIgnoreCase("Soy")) {
                        myFood.remove(f);
                        break;
                    }
                }
                break;

            case 3:
                if(myFood.isEmpty()){
                    System.out.println("You don't have any food");
                    System.out.println("You have wasted your move...");
                }
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
    }

    /**
     * Här inne i denna metoden väljer spelaren två djur man vill ska procreate ett nytt barn.
     * Man får se samtliga djur i listan för att sedan välja en hane och en hona för att starta processen.
     * När man har valt sina två djur kallar man Babyfactorys metod procreate animals för att sedan visa spelaren
     * ifall man får ett barn eller inte.
     *
     * @author Liban Mohamed
     */
    public void proCreateAnimals() {

        Scanner sc = new Scanner(System.in);
        if (animals.isEmpty()) {
            System.out.println("You don't have any animals");
            System.out.println("You have wasted your move");
        } else if (animals.size() == 1) {
            System.out.println("You only have one animal. it takes two animals to procreate ");
            System.out.println("You have wasted your move");
        } else {


            System.out.println("Choose one animal type to procreate");
            System.out.println("1. Chicken   2. Sheep   3. Goat   4. Cow   5. Horse");
            int switcher = Integer.parseInt(sc.nextLine());
            try {
                switch (switcher) {

                    case 1:
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Chicken")) {
                                System.out.println("All Chickens :");
                                System.out.println(i + ": " + animals.get(i).animalType() + " Gender: " + animals.get(i).getGender());
                            } // Här inne ska alla djur som finns med i listan utifrån den inmatade värdet

                        }
                        System.out.println("Choose one Male chicken, Enter the index next to the animal");

                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Chicken")) {
                                if (animals.get(i).getGender().equalsIgnoreCase("Boy")) {
                                    System.out.println("All Male Chickens:");
                                    System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                                }
                                else {
                                    System.out.println("You don't have any Male Chickens");
                                }
                            }
                        }
                        int chickenMaleChoice = Integer.parseInt(sc.nextLine());
                        System.out.println("Choose a Female chicken, Enter the index next to the animal");

                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Chicken")) {
                                if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                                    System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                                }
                                else {
                                    System.out.println("You don't have any Female Chickens");
                                }
                            }
                        }
                        int chickenFemaleChoice = Integer.parseInt(sc.nextLine());
                        // animals.get(maleChoice).proCreate(animals.get(femaleChoice));
                        BabyFactory.proCreate(this, animals.get(chickenMaleChoice), animals.get(chickenFemaleChoice));
                        break;


                    case 2:
                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Sheep")) {
                                System.out.println("All Your Sheeps: ");
                                System.out.println(i + ": " + animals.get(i).animalType() + " Gender: " + animals.get(i).getGender());
                            } // Här inne ska alla djur som finns med i listan utifrån den inmatade värdet

                        }
                        System.out.println("Choose one Male Sheep, Enter the index next to the animal");

                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Sheep")) {
                                if (animals.get(i).getGender().equalsIgnoreCase("Boy")) {
                                    System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                                }
                                else {
                                    System.out.println("You don't have any Male Sheeps");
                                }
                            }
                        }
                        int sheepMaleChoice = Integer.parseInt(sc.nextLine());
                        System.out.println("Choose a Female Sheep, Enter the index next to the animal");

                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Sheep")) {
                                if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                                    System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                                }
                                else {
                                    System.out.println("You don't have any Female Sheeps");
                                }
                            }
                        }
                        int sheepFemaleChoice = Integer.parseInt(sc.nextLine());
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
                                else {
                                    System.out.println("You don't have any Male Goats");
                                }
                            }
                        }
                        int goatMaleChoice = Integer.parseInt(sc.nextLine());
                        ;
                        System.out.println("Choose a Female Goat, Enter the index next to the animal");

                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Goat")) {
                                if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                                    System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                                }
                                else {
                                    System.out.println("You don't have any Female Goats");
                                }
                            }
                        }
                        int goatFemaleChoice = Integer.parseInt(sc.nextLine());
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
                                else {
                                    System.out.println("You don't have any Male Cows");
                                }
                            }
                        }
                        int cowMaleChoice = Integer.parseInt(sc.nextLine());
                        System.out.println("Choose a Female Cow, Enter the index next to the animal");

                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Cow")) {
                                if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                                    System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                                }
                                else {
                                    System.out.println("You don't have any Female Cow");
                                }
                            }
                        }
                        int cowFemaleChoice = Integer.parseInt(sc.nextLine());
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
                                System.out.println("You don't have any Male Horses");

                            }
                        }
                        int horseMaleChoice = Integer.parseInt(sc.nextLine());
                        System.out.println("Choose a Female Horse, Enter the index next to the animal");

                        for (int i = 0; i < animals.size(); i++) {
                            if (animals.get(i).getType().equalsIgnoreCase("Horse")) {
                                if (animals.get(i).getGender().equalsIgnoreCase("Girl")) {
                                    System.out.println(i + ": " + animals.get(i).getName() + " Age: " + animals.get(i).getAge() + " Gender: " + animals.get(i).getGender());
                                }
                                System.out.println("You don't have any Female Horses ");

                            }
                        }
                        int horseFemaleChoice = Integer.parseInt(sc.nextLine());
                        // animals.get(maleChoice).proCreate(animals.get(femaleChoice));
                        BabyFactory.proCreate(this, animals.get(horseMaleChoice), animals.get(horseFemaleChoice));
                        break;

                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        }

    /**
     * Denna metoden fyller på listan av djur med ett nyt djur som skapades vid procreate.
     * Den används inne hos Babyfactory klassen
     * @param animal är objektet djur om skal l läggas in i spelarens lista av djur
     *
     * @author Liban Mohamed
     */

    public void addBaby (Animal animal){
            animals.add(animal);
        }

        public void agingPlayerAnimals(){
        for(Animal a : animals){
            a.animalAging();
        }
        }

    /**
     * Denna metoden kollar ifall djurens hälsa eller ålder är godkänt
     * ifall något inte skulle vara godkänt tas objektet bort från spelaren lista av djurobjekt
     * @author Liban Mohamed
     */
        public void checkAnimalHealth(){
        for(Animal animal : animals){
            if (animal.getHealth() <= 0){
                removeAnimalFromList(animal);
        }
            if (animal.showAge() >= 100 ){
                removeAnimalFromList(animal);
            }

        }
        }

    /**
     * Denna metod tar bort ett djur från listan av djurobjekt
     * @param animal är det djur man vill få bort från listan.
     * @author Liban Mohamed
     */

    public void removeAnimalFromList(Animal animal){
        animals.remove(animal);

        }


    }






















