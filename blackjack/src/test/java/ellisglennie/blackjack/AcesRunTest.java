package ellisglennie.blackjack;

import junit.framework.TestCase;
import java.util.*;




public class AcesRunTest extends TestCase {


    public void testAcesPickBestValue() { //aces will be worth the highest value that does not trigger bust
        User n = new User();
        n.setHand(new Card[]{new Card("D", "4"), new Card("S", "A")});
        assertEquals(n.getHand(), 15);

        n.setHand(new Card[]{new Card("D", "10"), new Card("S", "10"), new Card("D", "A")});
        assertEquals(n.getHand(), 21);

        n.setHand(new Card[]{new Card("D", "9"), new Card("S", "A"), new Card("D", "A")});
        assertEquals(n.getHand(), 21);

    }

    public void testFaceWorth() { //J, Q, and K are all worth 10
        Card testJack = new Card("D", "J");
        Card testQueen = new Card("D", "Q");
        Card testKing = new Card("D", "K");

        assertEquals(testJack.getValue(), 10);
        assertEquals(testQueen.getValue(), 10);
        assertEquals(testKing.getValue(), 10);

    }

    public void testSoftSeventeen() {
        User n = new User();
        n.setHand(new Card[]{new Card("D", "A"), new Card(2, 6)});

        assertFalse(Menu.game.getPlayers()[1].standing());

    }






}