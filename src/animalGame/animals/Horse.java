package animalGame.animals;

import animalGame.animals.models.Animal;

public class Horse implements Animal {


    String name;
    String type = "Horse";
    int health = 100;
    Boolean isAlive;
    String gender;
    String b = Integer.toString(health);
    public Horse(String name) {
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
    public String getHealth() {
        return b + "%";
    }


    @Override
    public void setGender(String  gender) {
        this.gender = gender;
    }
}
