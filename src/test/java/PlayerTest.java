import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Before
    public void before(){
        Player player1 = new Player("Sophia");
        Player player2 = new Player("Hitchia");
    }


    @Test
    public void hasName(){
        assertEquals("Sophia", player1.getName());
    }
}
