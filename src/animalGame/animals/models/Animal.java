package animalGame.animals.models;

public interface Animal {


    void  setType(String type);

    String getName();

    String animalType();

    void healthDecline();

    String getDecline();

    void health(); // Visar djurets hälsa.

    void feed(String food); // Mata djuret, detta leder till Health ökar.


    void isDead(); // Ifall djuret hälsa = 0 så är djuret död #Boolean.

    void setGender(String  gender);

     String getGender();

     Integer getHealth();

    String showHealth();

    Integer getAge();

    String getType();


/**
 * Någon behöver skapa en lista av djurobjektet för att sedan kunna lägga till djur i spelarens lista
 */

}
