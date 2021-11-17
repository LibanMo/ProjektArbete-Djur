package animalGame.animals;

import animalGame.animals.models.Animal;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class Cow extends Animal implements Serializable {

    public String name;
    String type = "Cow";

    Cow cow;
    int health = 100;
    Boolean isAlive;
    String gender;
    String b = Integer.toString(health);
    int decline;
    String eatsOnly = "Wheat";
    int age = 1;

    public Cow(String name) {
        this.name = name;
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
        System.out.println("Your Cow " + name + " Health: " + health);
    }

    public void feed(String food) {

        if (food.equalsIgnoreCase(eatsOnly)){
            System.out.println("Yummy!");
            health += 10;

        }

        else  {
            System.out.println("Your Cow cant eat " + food );
            System.out.println("Cow only eats " + eatsOnly);

        }
    }





    public void isDead() {
        System.out.println("Your Cow " + name + " is dead");
    }


    public void setGender(String gender) {
        this.gender = gender;

    }


    public void setType(String type) {
        this.type = type;
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

