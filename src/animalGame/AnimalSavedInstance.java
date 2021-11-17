package animalGame;

import java.io.*;
import animalGame.Player;

public class AnimalSavedInstance implements Serializable {
    int amountRoundsLeft;
    Player player;

    // Vilka värden måste vi lagra här, så att när vi startar spelet från en gammal fil,
    // Vi har tillräckligt med data/info för att fortsätta var vi stannade sist

    /*
    DET SOM BEHÖVS ÄR FÖLJANDE

    Players pengar, player mat, player djur, samt info om spelar info.

    Samtidigt ska man också kunna spara spelets antal rundor som är kvar.
     */

    public void save(Player player, int amountRoundsLeft) {
        try {
            this.amountRoundsLeft = amountRoundsLeft;
            FileOutputStream FileOut = new FileOutputStream("C:\\Users\\liban\\OneDrive\\Dokument\\GitHub\\ProjektArbete-Djur\\UserInfo.ser");
            ObjectOutputStream ObjectOut = new ObjectOutputStream(FileOut);

            ObjectOut.writeObject(player);
            ObjectOut.writeObject(amountRoundsLeft);
            FileOut.close();
            ObjectOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void load() {

        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\liban\\OneDrive\\Dokument\\GitHub\\ProjektArbete-Djur\\UserInfo.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Player pr1  = (Player) objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
