import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player1;
    Player player2;

    @Before
    public void before(){
        player1 = new Player("Sophia");
        player2 = new Player("Hitchia");
    }

    @Test
    public void hasName(){
        assertEquals("Sophia", player1.getName());
    }

    @Test
    public void hasCards(){
        assertEquals(0, player1.cardsInHand().size());
    }
}
