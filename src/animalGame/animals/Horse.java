package animalGame.animals;

import animalGame.animals.models.Animal;

public class Horse implements Animal {


    String name;

    int health = 100;
    Boolean isAlive;
    String gender;

    public Horse(String name) {
        this.name = name;

    }


    @Override
    public void healthDeclinje() {

    }

    @Override
    public void health() {
        System.out.println(health + "%");
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
    public String getGender() {
        return gender;
    }


    @Override
    public void setGender(String  gender) {
        this.gender = gender;
    }
}
