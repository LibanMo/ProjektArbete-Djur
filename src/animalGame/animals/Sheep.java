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
        System.out.println("Your Sheep " + name + " Health: " + health);
    }

    @Override
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

    @Override
    public void proCreate(Sheep sheep) {
        if(sheep.getGender().equalsIgnoreCase("Girl")){

        }

        Random random = new Random();
        int choice = random.nextInt(2) + 1;
        switch (choice) {
            case 1:
                System.out.println("No baby this time sorry...");
                break;

            case 2:
                int choiceTwo = random.nextInt(2) + 1;
                switch (choiceTwo) {
                    case 1:
                        System.out.println("You got a male, what's its name going to be?");
                        String male = sc.nextLine();
                        sheep = new Sheep(male);
                        break;

                    case 2:
                        System.out.println("You got a female, what's its name going to be?");
                        String female = sc.nextLine(female);
                        sheep = new Sheep(name);


                }
        }

    }

    @Override
    public void isDead() {
        System.out.println("Your Sheep " + name + " is dead");
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


