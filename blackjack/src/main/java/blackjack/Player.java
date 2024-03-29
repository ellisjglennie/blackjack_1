package blackjack;

import java.util.*;



public interface Player {
    static Scanner sc = new Scanner(System.in);

    //return name
    String getName();
    
    //draw both at the beginning and throughout the game
    void draw(Deck deck);

    //add a card manually
    void add(Card c);
    
    //prints out the player's hand and returns to prove it worked
    int showHand();

    //ask the player if they want to hit or stand, then returns a boolean
    boolean standing();

    //returns the total score of the player's hand
    int getHand();

    //purely for testing. sets new value to hand
    void setHand(Card[] c);

}