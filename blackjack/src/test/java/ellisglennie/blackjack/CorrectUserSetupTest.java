package ellisglennie.blackjack;


import junit.framework.TestCase;



public class CorrectUserSetupTest extends TestCase {

    public void testPlayerSetup() { //the dealer and user exist
        Menu.game.run();

        assertTrue(Menu.game.getPlayers().length == 2);
    }

    public void testHandSetup() { //the dealer and the user both have hands of cards
        Menu.game.run();

        assertTrue(Menu.game.getPlayers()[0].getHand() >= 2);
        assertTrue(Menu.game.getPlayers()[1].getHand() >= 2);
    }

    public void testHandShow() { //the dealer and user's hands are appropriately visible
        Menu.game.run();

        assertEquals(Menu.game.getPlayers()[0].showHand(), 0);
        assertEquals(Menu.game.getPlayers()[1].showHand(), 0);
    }






}

