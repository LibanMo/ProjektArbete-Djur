package animalGame.Foods;

import animalGame.Foods.models.Food;

public class Corn implements Food {
    String type = "Corn";

    @Override
    public String getType() {
        return type;
    }
}

