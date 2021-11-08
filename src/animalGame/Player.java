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

    ArrayList<Animal> animals = new ArrayList<Animal>();
    ArrayList <Food> myFood = new ArrayList<Food>();



// player.chickens.add()


    Player(String name) {
        this.name = name;


    }



    public void setBalance(int cash){
        this.cash = cash;
    }


    public Integer getBalance() {
        return cash;
    }

    public String getName() { return name;}

    public void getAnimals(){
        for(Animal animal :animals){
            multipleValues.put(animal.animalType(), new ArrayList<String>());
            multipleValues.get(animal.animalType()).add(animal.getName());
            multipleValues.get(animal.animalType()).add(animal.getGender());
            multipleValues.get(animal.animalType()).add(animal.showHealth());
            multipleValues.get(animal.animalType()).add(animal.getDecline());
            System.out.println(multipleValues);
        }
    }

    void DeclineAnimal(){
        for (Animal animal : animals){
            if (animals.isEmpty()){
                break;
            }
            else {
                animal.healthDecline();
            }


        }
    }

    void addFood(Food food){
        myFood.add(food);
    }

    void showFood(){
        for (Food food : myFood){
            System.out.println(food.getType());
        }
    }

    //  HÄR INNE KOMMER JAG KUNNA MATA DJURET, DET SOM KRÄVS ÄR ETT SÄTT INDEX DJURET MED INT I FÖR ATT SEDAN VÄLJA DEN

    void feedAnimal(){
        System.out.println("Which Animal would you want to feed");
        System.out.println("Enter the number next to your animal");
        int i = 0;

        for (Animal a : animals){
            System.out.println( i + ": " + a.getName() + " Health: " +  a.getHealth());
            i ++;

        }
        int whoToFeed = sc.nextInt();
        System.out.println("1. Wheat   2. Soy   3. Corn  ");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                animals.get(whoToFeed).feed("Wheat");
               for(Food f : myFood){
                   if(f.getType().equalsIgnoreCase("Wheat")){
                       myFood.remove(f);
                       break;
                   }
               }
                break;

            case 2:
                animals.get(whoToFeed).feed("Soy");
                for(Food f : myFood){
                    if(f.getType().equalsIgnoreCase("Soy")){
                        myFood.remove(f);
                        break;
                    }
                }
                break;

            case 3:
                animals.get(whoToFeed).feed("Corn");
                for(Food f : myFood){
                    if(f.getType().equalsIgnoreCase("Corn")){
                        myFood.remove(f);
                        break;
                    }
                }
                break;



        }





            }

        }




















