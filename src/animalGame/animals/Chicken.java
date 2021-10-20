package animalgame.animals;

import animalGame.animals.models.Animal;

public class Chicken implements Animal {


    public String name;

    int health = 100;
    Boolean isAlive;
    String gender;

    public Chicken(String name) {
        this.name = name;

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
}



