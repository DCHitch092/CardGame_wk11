import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Play {
    public static void main(String[] args) throws Exception {

        Deck deck;
        Deck shuffledDeck;
        Player player1;
        Player player2;
        ArrayList<Player> players;
        Game game;
        deck = new Deck();
        player1 = new Player("Sophia");
        player2 = new Player("Hitchia");
        shuffledDeck = new Deck();
        shuffledDeck.populateCards();
        shuffledDeck.shuffleCards();
        players = new ArrayList<Player>();
        players.add(player1);
        players.add(player2);
        game = new Game(players, shuffledDeck);
        game.dealCards();

        System.out.println("player 1 is " + players.get(0).getName());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("player 2 is " + players.get(1).getName());
        TimeUnit.SECONDS.sleep(1);
        System.out.println("The cards are dealt");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("They look at their cards in secret...");
        TimeUnit.SECONDS.sleep(1);

        System.out.println(players.get(0).getName() + " has the " + players.get(0).cardsInHand().get(0).getRank() + " of " + players.get(0).cardsInHand().get(0).getSuit());
        TimeUnit.SECONDS.sleep(1);

        String winner = game.getWinner();

        if (winner == player1.getName()){
            System.out.println("Hitchia winces...");
            TimeUnit.SECONDS.sleep(1);
        } else {
            System.out.println("Sophia grins..!");
            TimeUnit.SECONDS.sleep(1);
        }

        System.out.println(players.get(1).getName() + " has the " + players.get(1).cardsInHand().get(0).getRank() + " of " + players.get(1).cardsInHand().get(0).getSuit());
        TimeUnit.SECONDS.sleep(1);


        TimeUnit.SECONDS.sleep(1);
        System.out.println("The Winner is... ");
        TimeUnit.SECONDS.sleep(3);
        System.out.println("ヽ(^o^)ノ " + winner + " ヽ(^o^)ノ");






    }
}
