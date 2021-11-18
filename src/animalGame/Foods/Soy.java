package animalGame.Foods;

import animalGame.Foods.models.Food;

import java.io.Serializable;

public class Soy extends Food implements Serializable {
    String type = "Soy";


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