import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public void populateCards(){

        ArrayList<Card> allCards = new ArrayList<Card>();

        for ( SuitType suit : SuitType.values()){
            for ( RankType rank : RankType.values()){
            Card newCard = new Card(suit, rank);
            allCards.add(newCard);
            }
        }

        this.cards = new ArrayList<Card>(allCards);

    }

    public int countCards() {
        return cards.size();
    }
}
