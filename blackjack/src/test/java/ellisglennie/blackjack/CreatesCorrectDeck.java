package ellisglennie.blackjack;

import junit.framework.TestCase;
import java.util.*;


public class CreatesCorrectDeck extends TestCase {


    public void testDeckHas52Cards() {
        Deck deck1 = new Deck();
        
        assertEquals(52, deck1.getSize());

    }

    public void testDeckIsShuffled() {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        deck1.shuffle();
        deck2.shuffle();
        
        assertFalse(deck1.getCards().equals(deck2.getCards()));


    }





}