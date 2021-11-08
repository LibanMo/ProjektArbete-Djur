package animalGame.animals.models;

public interface Animal {



    String getName();

    String animalType();

    void healthDecline();

    String getDecline();

    void health(); // Visar djurets hälsa.

    void feed(String food); // Mata djuret, detta leder till Health ökar.

    void proCreate(); // Djuren parar sig.

    void isDead(); // Ifall djuret hälsa = 0 så är djuret död #Boolean.

    void setGender(String  gender);

    public String getGender();

    String getHealth();

    Integer getAge();


/**
 * Någon behöver skapa en lista av djurobjektet för att sedan kunna lägga till djur i spelarens lista
 */

}
