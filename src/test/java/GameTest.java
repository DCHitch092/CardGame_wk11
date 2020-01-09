import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Deck deck;
    Deck shuffledDeck;
    Player player1;
    Player player2;
    ArrayList<Player> players;
    Game game;

    @Before
    public void before(){
        game = new Game(players, deck);
        deck = new Deck();
        player1 = new Player("Sophia");
        player2 = new Player("Hitchia");
        shuffledDeck = new Deck();
        shuffledDeck.populateCards();
        shuffledDeck.shuffleCards();

    }

    @Test
    public void hasSetUp(){
        assertEquals(52, game.getDeck().size());_
        assertEquals(2, game.getPlayers().size());_
    }
}
