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

    public Card compareCard(Card card1, Card card2){
        if (card1.getRankValue() == card2.getRankValue()) {
            if (card1.getSuitValue() > card2.getSuitValue()) {
                return card1;
            } else {
                return card2;
            }
        }

        else if (card1.getRankValue() > card2.getRankValue()){
            return card1;
        } else {
            return card2;
        }
    }

    public String getWinner() throws InterruptedException {

        ArrayList<Card> cardsInPlay = new ArrayList<Card>();
        for ( Player player : this.players){
            cardsInPlay.add(player.cardsInHand().get(0));
        }
        Card card1 = cardsInPlay.get(0);
        Card card2 = cardsInPlay.get(1);


        if (compareCard(card1, card2) == card1){
//            System.out.println("The Winner is... " + players.get(0).getName());
            return players.get(0).getName();
        } else {
//            System.out.println("The Winner is... " + players.get(1).getName());
            return players.get(1).getName();
        }

    }
}

