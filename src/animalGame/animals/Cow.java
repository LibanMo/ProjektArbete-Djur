package animalGame.animals;

import animalGame.animals.models.Animal;

public class Cow implements Animal {

    public String name;

    int health = 100;
    Boolean isAlive;
    String gender;

    public Cow(String name){
        this.name = name;
    }


    @Override
    public void healthDecline() {

    }

    @Override
    public void health() {

    }

    @Override
    public void feed() {

    }

    @Override
    public void proCreate() {

    }

    @Override
    public void isDead() {

    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;

    }

    @Override
    public String getGender() {
        return gender;
    }
}
