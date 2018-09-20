package ellisglennie.blackjack;

import junit.framework.TestCase;


public class CreatesCorrectDeckTest extends TestCase {


    public void testDeckHas52Cards() {
        Deck deck1 = new Deck();
        
        assertEquals(52, deck1.getSize());

    }

    public void testDeckIsShuffled() {
        Deck deck2 = new Deck();
        Deck deck3 = new Deck();
        deck2.shuffle();
        deck3.shuffle();
        
        assertFalse(deck2.getCards().equals(deck3.getCards()));


    }





}