package ellisglennie.blackjack;


public class Card {

    private int rank;
    private int suit;
    private int value;
    private static String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private static String[] suits = {"C","D","H","S"};

    public int getRank() { return rank; }
    public int getSuit() { return suit; }
    public int getValue() { return value; }


    Card(String suit, String rank) {

        this.rank = -1;
        this.suit = -1;

        for (int i=0; i<ranks.length; i++) {
            if (ranks[i].equals(rank)) { this.rank = i; }
        }
        for (int i=0; i<suits.length; i++) {
            if (suits[i].equals(suit)) { this.suit = i; }
        }

        if (this.rank > 10) { this.value = 10; 
        } else { this.value = this.rank; }
        
    }


}