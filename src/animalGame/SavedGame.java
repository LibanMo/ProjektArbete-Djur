package animalGame;

import java.io.Serializable;
import java.util.List;

public class SavedGame implements Serializable {

    private int rounds;
    private List<Player> players;
    private int currentRound;

    /**
     * Denna metod sparar spelet för att sedan ladda upp den vid framtida tillfällen
     * @param rounds antalet rundor som skall spelas
     * @param currentRound antalet rundor som spelats
     * @param players lista av spelare som ligger i Game klassen
     * @author Liban Mohamed
     */

    public SavedGame(int rounds,int currentRound, List<Player> players) {
        this.rounds = rounds;
        this.currentRound = currentRound;
        this.players = players;
    }

    public int getRounds() {
        return rounds;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getCurrentRound() {
        return currentRound;
    }
}
