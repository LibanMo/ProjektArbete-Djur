package animalGame.animals;

import animalGame.Player;
import animalGame.animals.models.Animal;

import java.io.Serializable;
import java.util.Random;

public class Chicken extends Animal implements Serializable {


   private String name;
   private Player player;
   private String type = "Chicken";
   private int health = 100;
   private String b = Integer.toString(health);
   private Boolean isAlive;
   private String gender;
   private Chicken chicken; // KALLA DENNA VARIABEL NÄR PROCREATE BLIR TILL ETT NYTT OBJEKT

   private int decline;
   private String eatsOnly = "Corn";
   private int age = 1;

    /**
     * Detta är min konstruktor
     * @param name är namnet på djuret.
     *
     */

    public Chicken(String name) {
        this.name = name;

    }

    /**
     * Denna är en setter för att kunna set objekts djurtyp,
     * @param type djurtypen
     *
     * @author Fahim Hadi
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Denna metod är en Getter.
     * @return namnet på objektet
     *
     * @author Fahim Hadi
     */

    public String getName() {
        return name;
    }

    /**
     * detta är en getter på objektet
     * @return objektets typ
     *
     * @author Fahim Hadi
     */
    public String animalType() {
        return type;
    }

    /**
     * I denna metod sker en Randomizer som väljer ett värde mellan 1 - 3
     * Beroende på vad som sker kommer decline variabeln att defineas
     *
     * @author Fahim Hadi
     *
     */
    public void healthDecline() {
        Random random = new Random();
        int choice = random.nextInt(3) + 1;
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

    /**
     * Denna metod fungerar som en hjälp metod att se till att djurets decline
     * formas till en sträng för att sedan användas i en hashmap som ligger i player.
     * @return retunerar decline som en sträng (typ)
     *
     * @author Fahim Hadi
     */
    public String getDecline() {
        return "-" + decline;
    }

    /**
     * Denna metoden skriver ut djurets hälsa
     */
    public void health() {
        System.out.println("Your Chicken " + name + " Health: " + health);
    }

    /**
     * Denna metoden matar djurobjektet
     * @param food är en sträng som jag använder för att jämföra med variabeln eatsonly.
     *  Djurets hälsa ökar med 10 ifall maten är korrekt
     *  Djuret skriver ut ett felmeddlande ifall maten inte är korrekt med eatsonly
     *
     * @author Fahim Hadi
     */

    public void feed(String food) {

        if (food.equalsIgnoreCase(eatsOnly)) {
            System.out.println("Yummy!");
            health += 10;

        } else {
            System.out.println("Your Chicken cant eat " + food);
            System.out.println("Chicken only eats " + eatsOnly);
        }
    }


    /**
     * Denna metoden settar djurets kön
     * @param gender Är en String variabel som settar param till genderVaribalen i fältet
     *
     * @author Fahim Hadi
     */

    public void setGender(String gender) {
        this.gender = gender;

    }

    /**
     *
     * @return detta retunerar könet på djurobjektet
     *
     * @author Fahim Hadi
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return Djurets hälsa
     *
     * @author Fahim Hadi
     */
    public Integer getHealth() {

        return health;
    }

    /**
     * denna metod returnerar hälsan i Sträng format för att sedan kunna använda
     * den i hashmap i player klassen
     * @return Hälsa i sträng format
     *
     * @author Fahim Hadi
     */
    public String showHealth() {
        if (health <= 0) {
            isDead();
        }


        health = health - decline;
        return health + "%";
    }

    /**
     *
     * @return Djurobjekts ålder i ett strängformat
     * används sedan i player klassen
     *
     * @author Fahim Hadi
     */
    public String getAge() {
        return "age: " + age;
    }


    public String getType() {
        return type;
    }




    public void isDead() {


    }

    /**
     * Denna metod ser till att objektet åldras
     * detta är för att kunna avgöra hur mycket djuret är värt
     * värdet på djuret påverkas utav hälsan samt ålder
     *
     * @author Fahim Hadi
     */

    public void animalAging() {
        age += 10;

    }


    public Integer showAge() {
        return  age;
    }


}



