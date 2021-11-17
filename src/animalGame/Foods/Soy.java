package animalGame.Foods;

import animalGame.Foods.models.Food;

import java.io.Serializable;

public class Soy extends Food implements Serializable {
    String type = "Soy";


    @Override
    public String getType() {
        return type;
    }
}