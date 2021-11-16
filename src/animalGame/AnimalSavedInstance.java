package animalGame;

import java.io.*;

public class AnimalSavedInstance implements Serializable {
    int amountRoundsLeft;

    // Vilka värden måste vi lagra här, så att när vi startar spelet från en gammal fil,
    // Vi har tillräckligt med data/info för att fortsätta var vi stannade sist

    /*
    DET SOM BEHÖVS ÄR FÖLJANDE

    Players pengar, player mat, player djur, samt info om spelar info.

    Samtidigt ska man också kunna spara spelets antal rundor som är kvar.
     */

    public void save(Player player, int amountRoundsLeft) {
        try {
            FileOutputStream FileOut = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream ObjectOut = new ObjectOutputStream(FileOut);
            this.amountRoundsLeft = amountRoundsLeft;
            ObjectOut.writeObject(player.getName());
            ObjectOut.writeObject(player.getBalance());
            ObjectOut.writeObject(player.getAnimals());
            ObjectOut.writeObject(amountRoundsLeft);
            FileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void load() {
        Object object = null;
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\liban\\OneDrive\\Dokument\\GitHub\\ProjektArbete-Djur\\UserInfo.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            object = objectIn.readObject();
            objectIn.close();
            fileIn.close();
            System.out.println("Save file to upload");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
