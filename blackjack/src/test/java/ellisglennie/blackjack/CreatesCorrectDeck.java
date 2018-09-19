package ellisglennie.blackjack;

import junit.framework.TestCase;
import java.util.*;


public class CreatesCorrectDeck extends TestCase {


    public void testDeckHas52Cards() {
        
        assertEquals(52, Deck.getSize());

    }

    public void testDeckIsShuffled() {
        Deck deck1 = new Deck;
        Deck deck2 = new Deck;
        
        assertNotEquals(deck1.shuffle(), deck2.shuffle());

    }





}