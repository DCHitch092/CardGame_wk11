import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Deck shuffledDeck;
    Player player1;
    Player player2;

    @Before
    public void before(){
       deck = new Deck();
       player1 = new Player("Sophia");
       player2 = new Player("Hitchia");
       shuffledDeck = new Deck();
       shuffledDeck.populateCards();
       shuffledDeck.shuffleCards();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canPopulateWithCards(){
        deck.populateCards();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void hasCards(){
        deck.populateCards();
        assertEquals(52, deck.cardsInCurrentOrder().size());
    }

    @Test
    public void areCardsShuffled(){
        deck.populateCards();
        ArrayList<Card> startingDeck = new ArrayList<Card>(deck.cardsInCurrentOrder());
        deck.shuffleCards();
        assertNotEquals(startingDeck.get(0), deck.cardsInCurrentOrder().get(0));
    }

    @Test
    public void deckCanDeal(){
        shuffledDeck.deal(player1);
        assertEquals(1, player1.cardsInHand().size());
    }



}
