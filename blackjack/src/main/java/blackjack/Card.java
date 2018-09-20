package blackjack;


public class Card {

    private int rank;
    private int suit;
    private int value;
    protected static String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    protected static String[] ranksFull = {"Ace", "Two", "Three", "Four", 
                                        "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    protected static String[] suits = {"C","D","H","S"};
    protected static String[] suitsFull = {"Clubs", "Diamonds", "Hearts", "Spades"};

    public int getRank() { return rank; }
    public int getSuit() { return suit; }
    public int getValue() { return value; }


    public Card(String suit, String rank) {

        this.rank = -1;
        this.suit = -1;

        for (int i=0; i<ranks.length; i++) {
            if (ranks[i].equals(rank)) { this.rank = i; }
        }
        for (int i=0; i<suits.length; i++) {
            if (suits[i].equals(suit)) { this.suit = i; }
        }

        if (this.rank >= 10) { 
            this.value = 10; 
        } else { this.value = this.rank+1; }
        
    }

    public Card(int suit, int rank) {
        
        this.suit = suit;
        this.rank = rank;

        if (this.rank >= 10) { 
            this.value = 10; 
        }
        else { 
            this.value = this.rank; 
        }

    }

    public String toString() {
        return (ranksFull[this.rank] + " of " + suitsFull[this.suit]);
    }


}