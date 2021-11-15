package animalGame.animals;

import animalGame.animals.models.Animal;

import java.util.Random;
import java.util.Scanner;

public class Cow implements Animal {

    public String name;
    String type = "Cow";
    Scanner sc = new Scanner(System.in);
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


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String animalType() {
        return type;
    }

    @Override
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

    @Override
    public String getDecline() {
        return "-" + decline;
    }

    @Override
    public void health() {
        System.out.println("Your Cow " + name + " Health: " + health);
    }

    @Override
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




    @Override
    public void isDead() {
        System.out.println("Your Cow " + name + " is dead");
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;

    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public Integer getHealth() {
        return  health;
    }

    @Override
    public String showHealth() {
        if (health <= 0 ){
            isDead();
        }


        health = health - decline;
        return health + "%";
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public String getType() {
        return type;
    }
}

