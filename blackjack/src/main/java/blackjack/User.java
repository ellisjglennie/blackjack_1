package blackjack;

import java.util.*;



public class User implements Player {
    private ArrayList<Card> hand = new ArrayList<>();
    private String name;
    static Scanner sc = new Scanner(System.in);
    

    public String getName() { return name; }

    public User() { 
        this.name = "User";
    }

    @Override
    public void draw(Deck deck) { //draw a new card from the deck and announce it to the user
        hand.add(deck.drawCard());
        System.out.println("You drew a " + hand.get(hand.size()-1).toString() + ".");
    }

    @Override
    public void add(Card c) {
        hand.add(c);
        System.out.println("You drew a " + c.toString() + ".");
    }


    //prints out the player's hand
    @Override
    public int showHand() {
        System.out.print("You have the following cards: ");
        for (Card card : hand) { 
            System.out.print(" " + card.toString());
        }
        System.out.println(".\n");
        return 0;
    }

    //ask the player if they want to hit or stand, then returns a boolean
    @Override
    public boolean standing() {
        String command = "";
        System.out.print("Press (h) to hit, and (s) to stand:  ");
        while (true) {
            command = sc.nextLine();
            if (command.equals("h")) {
                return false;
            }
            else if (command.equals("s")) {
                System.out.println("You have chosen to stand.");
                return true;
            }
            else { 
                System.out.print("Invalid input, try again: ");
            }
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


     //this is purely a tester function that changes the value of a hand
     @Override
     public void setHand(Card[] c) {
        hand.clear();
        for (int i=0; i<c.length; i++) {
            hand.add(c[i]);
        }          
     }

}