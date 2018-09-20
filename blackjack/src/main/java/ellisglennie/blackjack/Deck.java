package ellisglennie.blackjack;

import java.util.*;


public class Deck {
    private ArrayList<Card> cards;


    public int getSize() { return this.cards.size(); }
    public ArrayList<Card> getCards() { return cards; }


    Deck() {
        for (int s=0; s<Card.suits.length; s++) {
            for (int r=0; r<Card.ranks.length; r++) {
                cards.add(new Card(s, r));
            }
        }

    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }



}