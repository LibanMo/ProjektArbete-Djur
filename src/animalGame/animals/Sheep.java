package animalGame.animals;

import animalGame.animals.models.Animal;

import java.util.Random;

public class Sheep implements Animal {

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
        age ++;
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

    // Djurets Hälsa skav visas med denna metod
    public void health() {

    }

    @Override
    public void feed(String food) {
        if (health == 100) {
            System.out.println("Health is already full");
        }
        else if (food.equalsIgnoreCase(eatsOnly)){
            System.out.println("Yummy!");
            health += 10;

        }

        else  {
            System.out.println("Your Sheep cant eat " + food );
            System.out.println("Sheep only eats " + eatsOnly);

        }
    }
    @Override
    public void proCreate() {

    }

    @Override
    public void isDead() {
        System.out.println("Your Sheep " + name + " is dead");

    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getHealth() {
        if (health <= 0){
            isDead();
        }
        else if (age == maxAge)
        {
            isDead();
        }
        return health - decline + "%";
    }

    @Override
    public Integer getAge() {
        return age;
    }
}
