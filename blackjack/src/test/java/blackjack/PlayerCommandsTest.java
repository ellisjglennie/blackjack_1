package blackjack;


import junit.framework.TestCase;
import java.util.*;


public class PlayerCommandsTest extends TestCase {

    public void testcanPlayerHit() { //user can hit
        Menu.game.run();
        User.sc = new Scanner("h");

        assertFalse(Menu.game.getPlayers()[0].standing());        
    }

    public void testcanPlayerHitAgain() { //user can hit repeatedly
        Menu.game.run();
        User.sc = new Scanner("h");
        assertFalse(Menu.game.getPlayers()[0].standing());
        User.sc = new Scanner("h");
        assertFalse(Menu.game.getPlayers()[0].standing());

    }

    public void testcanPlayerStand() { //user can stand
        Menu.game.run();
        User.sc = new Scanner("s");

        assertTrue(Menu.game.getPlayers()[0].standing());

    }


}