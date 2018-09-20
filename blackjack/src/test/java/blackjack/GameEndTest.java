package blackjack;

import junit.framework.TestCase;
import java.util.*;


public class GameEndTest extends TestCase {


    public void testDealerHit() { //If dealer has <=16, it hits
        Menu.game.getPlayers()[1].setHand(new Card[]{new Card(1, 10), new Card(2, 6)});

        assertFalse(Menu.game.getPlayers()[1].standing());
    }

    public void testDealerHitAgain() { //dealer can hit repeatedly 
        Menu.game.getPlayers()[1].setHand((new Card[]{new Card(1, 2)}));
        assertFalse(Menu.game.getPlayers()[1].standing());
        assertFalse(Menu.game.getPlayers()[1].standing());
        
    }


    public void testDisplayHand() {//The hand of the user or the dealer is displayed at the end of the player's turn

        assertEquals(0, Menu.game.getPlayers()[0].showHand());
        assertEquals(0,Menu.game.getPlayers()[1].showHand());

    }

    public void testBust() { //one player can bust, causing the other to win
        Menu.game.getPlayers()[0].setHand(new Card[]{new Card(1, 10), new Card(2, 10), new Card(3,9)}); //checking user
        assertTrue(Menu.game.checkBJ(Menu.game.getPlayers()));

        Menu.game.getPlayers()[1].setHand(new Card[]{new Card(1, 10), new Card(2, 10), new Card(3,9)}); //checking dealer
        assertTrue(Menu.game.checkBJ(Menu.game.getPlayers()));

    }


}