package animalGame.Foods;

import animalGame.Foods.models.Food;

import java.io.Serializable;

public class Wheat extends Food implements Serializable {
    String type = "Wheat";


    /**
     *
     * @return djurtypen
     *
     * @author Felah Hassan
     */
    public String getType() {
        return type;
    }
}
