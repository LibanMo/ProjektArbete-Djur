package animalGame;

import animalGame.animals.models.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Player {
    String name;
    int cash = 5000;


    Store store;
    Scanner sc = new Scanner(System.in);
    HashMap<String, ArrayList<String>> multipleValues = new HashMap<String, ArrayList<String>>();

    public ArrayList<Animal> animals = new ArrayList<Animal>();



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
            multipleValues.get(animal.animalType()).add(animal.getHealth());
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


}










