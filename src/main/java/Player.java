import java.util.ArrayList;
import java.util.Collection;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name){
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public String getName(){
        return name;
    }

    public Collection cardsInHand() {
    }
}
