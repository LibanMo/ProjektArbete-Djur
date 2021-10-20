package animalGame;

import java.util.Scanner;



public class Store {



    Player player;
    Scanner sc = new Scanner(System.in);
    int thePrice;
    int cardScan;


    //DETTA SKA REPRENSETRA EN BUTIK

    // I EN BUTIK KAN KÖPET NEKAS


    public Store(Player player){
        this.player = player;
    }



    public void Welcome() {
        System.out.println("Hey Welcome to  our store");
        System.out.println("Would You Like to Buy?: ");
        System.out.println("1. Animal      ");
        int val = sc.nextInt();

        switch (val){
            case 1:
                System.out.println("The animal game.animals u can buy");
                System.out.println("1. Chicken     2. Horse");
                val = sc.nextInt();


                switch (val){
                    case 1:

                        System.out.println("The Chicken Costs 150");
                        thePrice = 150;
                        cardScan = player.cash;

                        if(thePrice > cardScan){
                            System.out.println("The card got declined");
                        }
                        else{
                            System.out.println(player.cash);
                            player.cash -= thePrice;
                            System.out.println("New " + player.cash);
                        }
                        break;



                    case 2:
                        System.out.println("Fixa hästköp metod.....");
                        break;
                }

                break;

            case 2:
                System.out.println("fixa food klassen");
                break;
        }
    }
}


