package ellisglennie.blackjack;

import java.util.*;


public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();


    public int getSize() { return this.cards.size(); }
    public ArrayList<Card> getCards() { return cards; }


    public Deck() {
        for (int s=0; s<Card.suits.length; s++) {
            for (int r=0; r<Card.ranks.length; r++) {
                cards.add(new Card(s, r));
            }
        }

    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card drawCard() {
        Card top = cards.get(0);
        cards.remove(0);
        return top;
    }



}