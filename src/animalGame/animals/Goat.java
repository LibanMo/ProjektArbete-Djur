package animalGame.animals;

import animalGame.animals.models.Animal;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Goat extends Animal implements Serializable{

    public String name;
    String type = "Goat";
    int health = 100;
    Boolean isAlive;
    String gender;
    String b = Integer.toString(health);
    int decline;
    String eatsOnly = "Soy";
    int age = 1;
    Goat goat;



    public Goat(String name) {
        this.name = name;
    }



    public void setType(String type) {
        this.type = type;
    }



    public String getName() {
        return name;
    }


    public String animalType() {
        return type;
    }

    public void healthDecline() {
        Random random = new Random();
        int choice = random.nextInt(3)+1;
        switch (choice) {

            case 1:
                decline = 10;

                break;

            case 2:
                decline = 20;

                break;

            case 3:
                decline = 30;

                break;
        }

    }


    public String getDecline() {
        return "-" + decline;
    }


    public void health() {
        System.out.println("Your Goat " + name + " Health: " + health);
    }


    public void feed(String food) {

        if (food.equalsIgnoreCase(eatsOnly)){
            System.out.println("Yummy!");
            health += 10;

        }

        else  {
            System.out.println("Your Goat cant eat " + food );
            System.out.println("Goat only eats " + eatsOnly);

        }
    }




    public void isDead() {
        System.out.println("Your Goat " + name + " is dead");
    }


    public void setGender(String gender) {
        this.gender = gender;

    }


    public String getGender() {
        return gender;
    }


    public Integer getHealth() {
        return  health;
    }


    public String showHealth() {
        if (health <= 0 ){
            isDead();
        }


        health = health - decline;
        return health + "%";
    }


    public Integer getAge() {
        return age;
    }


    public String getType() {
        return type;
    }
}


