package animalGame.animals;

import animalGame.animals.models.Animal;

import java.util.Random;

public class Cow implements Animal {

    public String name;
    String type = "Cow";

    int health = 100;
    Boolean isAlive;
    String gender;
    String b = Integer.toString(health);
    int decline;

    public Cow(String name){
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
        return health - decline + "%";
    }
}
