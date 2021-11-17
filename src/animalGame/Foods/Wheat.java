package animalGame.Foods;

import animalGame.Foods.models.Food;

import java.io.Serializable;

public class Wheat extends Food implements Serializable {
    String type = "Wheat";


    @Override
    public String getType() {
        return type;
    }
}
