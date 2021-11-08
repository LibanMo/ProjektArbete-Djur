package animalGame;

import animalGame.animals.Horse;
import animalGame.animals.Sheep;

import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    String name;
    public int cash = 5000;


    Store store;
    Scanner sc = new Scanner(System.in);

    ArrayList<Horse>horses = new ArrayList<Horse>();
    ArrayList<Sheep>sheeps = new ArrayList<Sheep>();



// player.chickens.add()


    Player(String name) {
        this.name = name;


    }




    public Integer getBalance() {
        return cash;
    }


}










