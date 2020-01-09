import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void before(){
       deck = new Deck();
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
        assertEquals(52, deck.getCards().size());
    }

    @Test
    public voic areCardsShuffled(){
        deck.populateCards();
        ArrayList<Card> startingDeck = deck.cardsInCurrentOrder();
        deck.shuffleCards();
        assertNotEquals(startingDeck, deck.cardsInCurrentOrder());


    }

}
