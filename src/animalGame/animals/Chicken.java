package animalGame.animals;

import animalGame.animals.models.Animal;

import java.util.Random;

public class Chicken implements Animal {


    public String name;

    int health = 100;
    Boolean isAlive;
    String gender;

    public Chicken(String name) {
        this.name = name;

    }

    @Override
    public void healthDeclinje() {
        Random random = new Random();
        int choice = random.nextInt(3)+ 1;
        switch(choice){
            case 1:
                health = health - 10;
                break;

            case 2:
                health = health - 20;
                break;

            case 3:
                health = health - 30;
                break;
        }

    }

    @Override
    public void health() {
        System.out.println("Your Chicken " + name + " Health: " + health);
    }

    @Override
    public void feed() {
        if (health == 100) {
            System.out.println("Health is already full");
        } else {
            health = health + 10;
        }


    }

    @Override
    public void proCreate() {

    }

    @Override
    public void isDead() {
        System.out.println("Your chicken is dead... \n Sorry");
    }

    @Override
    public void setGender(String gender) {

    }

    @Override
    public String getGender() {
        return null;
    }
}



