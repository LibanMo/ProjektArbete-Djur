package animalGame.animals;

import animalGame.animals.models.Animal;

import java.io.Serializable;
import java.util.Random;

public class Sheep extends Animal implements Serializable {
    Sheep sheep;
    public String name;
    String type = "Sheep";
    int health = 100;
    Boolean isAlive;
    String gender;
    String b = Integer.toString(health);
    int decline;
    int age = 1;
    int maxAge = 12;

    String eatsOnly = "Wheat";

    public Sheep(String name){
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
        System.out.println("Your Sheep " + name + " Health: " + health);
    }


    public void feed(String food) {

        if (food.equalsIgnoreCase(eatsOnly)){
            System.out.println("Yummy!");
            health += 10;

        }

        else  {
            System.out.println("Your Sheep cant eat " + food );
            System.out.println("Sheep only eats " + eatsOnly);

        }
    }









    public void isDead() {
        System.out.println("Your Sheep " + name + " is dead");
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


    public String getAge() {
        return "age: " + age;
    }

    public String getType() {
        return type;
    }


    public void animalAging() {
        age += 10;
    }
    public Integer showAge() {
        return  age;
    }

}


