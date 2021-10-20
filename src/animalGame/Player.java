package animalGame;

import java.util.ArrayList;
import java.util.Scanner;


public class Player {
    String name;
    public int cash = 5000;


    Store store;
    Scanner sc = new Scanner(System.in);



// player.chickens.add()


    Player(String name) {
        this.name = name;


    }




    public Integer getBalance() {
        return cash;
    }


}









 /*   public void buyAnimal(){


        System.out.println("What Animal do you wanna buy");
        System.out.println("1. Horse   2. Chicken");
       int val = sc.nextInt();

       switch(val){
           case 1:
               System.out.println("a Horse costs you 1000 ");
               System.out.println("do u wanna buy it?:   1/0");
               val = sc.nextInt();
               switch (val){
                   case 1:

               }
       }

    }*/





/*
Spelarens ska dessa egenskaper:
    - SUMMA PENGAR
    - NAMN PÅ SPELAREN
    -

 */
