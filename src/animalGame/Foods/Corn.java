package animalGame.Foods;

import animalGame.Foods.models.Food;

import java.io.Serializable;

public class Corn extends Food implements Serializable {
    String type = "Corn";

    /**
     *
     * @return djurtupen
     *
     * @author Fahim Hadi
     */
    public String getType() {
        return type;
    }
}