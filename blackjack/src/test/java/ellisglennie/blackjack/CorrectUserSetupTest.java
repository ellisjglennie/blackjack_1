package ellisglennie.blackjack;


import junit.framework.TestCase;



public class CorrectUserSetupTest extends TestCase {

    public void testPlayerSetup() { //the dealer and user exist
        Menu.game.run("c");

        assertTrue(Menu.game.players.size() == 2);
    }

    public void testHandSetup() { //the dealer and the user both have hands of cards
        Menu.game.run("c");

        assertTrue(Menu.game.players.get(0).getHand().length == 2);
        assertTrue(Menu.game.players.get(1).getHand().length == 2);
    }

    public void testHandShow() { //the dealer and user's hands are appropriately visible

        assertEquals(Menu.game.players.get(0).showHand(), 0);
        assertEquals(Menu.game.players.get(1).showHand(), 0);
    }






}

