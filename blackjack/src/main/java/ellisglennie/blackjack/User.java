package ellisglennie.blackjack;

import java.util.*;



public class User implements Player {
    private ArrayList<Card> hand = new ArrayList<>();


    public User() {    }

    @Override
    public void draw(Deck deck) { //draw a new card from the deck and announce it to the user
        hand.add(deck.drawCard());
        System.out.println("You drew a " + hand.get(0).toString() + ".");
    }

    //plays the player's turn
    @Override
    public void startTurn() {
        System.out.println("------\nYour turn.");
    }

    //prints out the player's hand at the beginning of the game
    @Override
    public int showHand() {
        System.out.println("You start with the " + hand.get(0).toString() + " and the " + hand.get(1).toString() + ".");
        return 0;
    }

    //ask the player if they want to hit or stand, then returns a boolean
    @Override
    public boolean standing() { return false; }

    //returns the total score of the player's hand
    @Override
    public int getHand() { 
        int total = 0;
        for (Card card : hand) {
            total += card.getValue();
        }
        return total;
     }

}