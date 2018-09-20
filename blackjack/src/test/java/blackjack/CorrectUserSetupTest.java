package blackjack;


import junit.framework.TestCase;



public class CorrectUserSetupTest extends TestCase {

    public void testPlayerSetup() { //the dealer and user exist

        assertTrue(Menu.game.getPlayers().length == 2);
    }

    
    public void testHandShow() { //the dealer and user's hands are appropriately visible

        assertEquals(Menu.game.getPlayers()[0].showHand(), 0);
        assertEquals(Menu.game.getPlayers()[1].showHand(), 0);
    }






}

