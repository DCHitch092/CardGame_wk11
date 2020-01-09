public class Card {
    private RankType rank;
    private SuitType suit;

    public Card (RankType rank, SuitType suit){
        this.rank = rank;
        this.suit = suit;
    }

    public SuitType getSuit(){
        return suit;
    }

    public RankType getRank(){
        return rank;
    }

}
