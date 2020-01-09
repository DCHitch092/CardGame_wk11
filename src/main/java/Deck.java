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

    public ArrayList<Card> cardsInCurrentOrder() {
        return cards;
    }

    public void shuffleCards() {

        ArrayList<Card> shuffledDeck = new ArrayList<Card>();

        while (cards.size() > 0){
            int randomCardIndex = (int)(Math.random() * cards.size());
            shuffledDeck.add(cards.remove(randomCardIndex));
        }

        this.cards = shuffledDeck;

    }


    public void dealCard(Player player) {
        player.addCard(cards.remove(0));
    }
}
