package animalGame.Foods;

import animalGame.Foods.models.Food;

import java.io.Serializable;

public class Corn extends Food implements Serializable {
    String type = "Corn";

    @Override
    public String getType() {
        return type;
    }
}