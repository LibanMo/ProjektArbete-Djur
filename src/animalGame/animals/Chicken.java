package animalGame.animals;

import animalGame.animals.models.Animal;

import java.util.Random;
import java.util.Scanner;

public class Chicken implements Animal {


    public String name;

    String type = "Chicken";
    int health = 100;
    String b = Integer.toString(health);
    Boolean isAlive;
    String gender;
    Chicken chicken; // KALLA DENNA VARIABEL NÄR PROCREATE BLIR TILL ETT NYTT OBJEKT
    Scanner sc = new Scanner(System.in);
    int decline;
    String eatsOnly = "Corn";
    int age = 1;

    public Chicken(String name) {
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
        System.out.println("Your Chicken " + name + " Health: " + health);
    }

    @Override
    public void feed(String food) {

        if (food.equalsIgnoreCase(eatsOnly)){
            System.out.println("Yummy!");
            health += 10;

        }

        else  {
            System.out.println("Your Chicken cant eat " + food );
            System.out.println("Chicken only eats " + eatsOnly);

        }
    }

    @Override
    public void proCreate() {

        Random random = new Random();
        int choice = random.nextInt(2)+ 1;
        switch (choice){
            case 1:
                System.out.println("No baby this time sorry...");
                break;

            case 2:
                System.out.println("Name your chicken");
                String n = sc.nextLine();
                chicken = new Chicken(n);
        }
    }

    @Override
    public void isDead() {
        System.out.println("Your Chicken " + name + " is dead");
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
        if (health <= 0 ){
            isDead();
        }

        return health - decline + "%";
    }

    @Override
    public Integer getAge() {
        return age;
    }
}



