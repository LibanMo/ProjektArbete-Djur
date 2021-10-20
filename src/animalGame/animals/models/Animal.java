package animalGame.animals.models;

public interface Animal {


    void health(); // Visar djurets hälsa.

    void feed(); // Mata djuret, detta leder till Health ökar.

    void proCreate(); // Djuren parar sig.

    void isDead(); // Ifall djuret hälsa = 0 så är djuret död #Boolean.





}
