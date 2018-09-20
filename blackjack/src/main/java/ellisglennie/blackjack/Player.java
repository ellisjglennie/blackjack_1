package ellisglennie.blackjack;


import java.util.*;

public interface Player {
    Scanner sc = new Scanner(System.in);

    
    //draw both at the beginning and throughout the game
    void draw(Deck deck);
    
    //plays the player's turn
    void startTurn();

    //prints out the player's hand and returns to prove it worked
    int showHand();

    //ask the player if they want to hit or stand, then returns a boolean
    boolean standing();

    //returns the total score of the player's hand
    int getHand();

}