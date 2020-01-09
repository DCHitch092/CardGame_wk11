import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
        assertEquals(51, deck.getCards());
    }

//    @Test
//    public voic areCardsShuffled(){
//
//    }

}
