package animalGame.animals.models;

import java.io.Serializable;

public abstract class Animal implements Serializable{


    public abstract void  setType(String type);

    public abstract String getName();

    public abstract String animalType();

    public abstract void healthDecline();

   public abstract String getDecline();

   public abstract void health(); // Visar djurets hälsa.

   public abstract void feed(String food); // Mata djuret, detta leder till Health ökar.


   public abstract void isDead(); // Ifall djuret hälsa = 0 så är djuret död #Boolean.

   public abstract void setGender(String  gender);

   public abstract String getGender();

   public abstract Integer getHealth();

   public abstract String showHealth();

   public abstract String getAge();

   public abstract String getType();

   public abstract void animalAging();

   public abstract Integer showAge();




/**
 * Någon behöver skapa en lista av djurobjektet för att sedan kunna lägga till djur i spelarens lista
 */

}
