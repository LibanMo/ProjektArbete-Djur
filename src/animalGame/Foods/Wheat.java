package animalGame.Foods;

import animalGame.Foods.models.Food;

public class Wheat implements Food {
    String type = "Wheat";


    @Override
    public String getType() {
        return type;
    }
}
