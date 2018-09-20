package blackjack;

import java.util.*;



public class Dealer implements Player {
    private ArrayList<Card> hand = new ArrayList<>();
    private String name;

    public String getName() { return name; }
    
    // Player hand is an array
    public Dealer() {  
        this.name = "Dealer";
    }

    //draw both at the beginning and throughout the game
    @Override
    public void draw(Deck deck) {
        hand.add(deck.drawCard());
        System.out.println("Dealer draws.");
    }


    //prints out the player's hand at the beginning of the game
    @Override
    public int showHand() {
        System.out.print("Dealer has: ");
        for (int i=1; i<hand.size(); i++) { 
            System.out.print(" " + hand.get(i).toString());
        }
        System.out.println(", and one face-down card.\n");
        return 0;
    }


    //ask the player if they want to hit or stand, then returns a boolean
    @Override
    public boolean standing() {
        int softCheck = 0;
        if (getHand() <= 16) {
            return false;
        } else if (getHand() == 17) { 
            for (Card card : hand) {
                softCheck += card.getValue();
            }
            if (softCheck == 7) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
     }

    //returns the total score of the player's hand
    @Override
    public int getHand() { 
        int total = 0;
        for (Card card : hand) {
            if (card.getRank() != 0) {
                total += card.getValue();
            }
        }
        for (Card card: hand) {
            if (card.getRank() == 0) {
                if ((total + 11) <= 21) {
                    total += 11;
                } else {
                    total += 1;
                }
            }
        }
        return total;
     }

     @Override
     public void setHand(Card[] c) {
        hand.clear();
        for (int i=0; i<c.length; i++) {
            hand.add(c[i]);
        }          
     }


    
}