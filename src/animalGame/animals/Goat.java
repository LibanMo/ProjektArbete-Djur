package animalGame.animals;

import animalGame.animals.models.Animal;

public class Goat implements Animal {

    public String name;
    String type = "Goat";
    int health = 100;
    Boolean isAlive;
    String gender;
    String b = Integer.toString(health);
    public Goat(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;    }

    @Override
    public String animalType() {
        return type;
    }

    @Override
    public void healthDeclinje() {

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

    @Override
    public String getHealth() {
        return b + "%";
    }
}
