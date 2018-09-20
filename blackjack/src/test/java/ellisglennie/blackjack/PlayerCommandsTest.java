package ellisglennie.blackjack;


import junit.framework.TestCase;
import java.util.*;


public class PlayerCommandsTest extends TestCase {

    public void canPlayerHit() { //user can hit
        Menu.game.run();
        Menu.game.sc = new Scanner("h");

        assertFalse(Menu.game.getPlayers()[0].standing());        
    }

    public void canPlayerHitAgain() { //user can hit repeatedly
        Menu.game.run();
        Menu.game.sc = new Scanner("h");
        assertFalse(Menu.game.getPlayers()[0].standing());
        assertFalse(Menu.game.getPlayers()[0].standing());

    }

    public void canPlayerStand() { //user can stand
        Menu.game.run();
        Menu.game.sc = new Scanner("s");

        assertTrue(Menu.game.getPlayers()[0].standing());

    }


}