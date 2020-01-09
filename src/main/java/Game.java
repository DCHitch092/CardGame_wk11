import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Deck deck;

    public Game (ArrayList<Player> players, Deck deck){
        this.players = new ArrayList<Player>(players);
        this.deck = deck;
    }

    public Deck getDeck(){
        return deck;
    }

    public ArrayList<Player> getPlayers(){
        return players;
    }

    public void dealCards(){
        for(Player player : this.players){
            deck.dealCard(player);
        }
    }
}
