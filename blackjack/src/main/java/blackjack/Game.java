package blackjack;


import java.util.*;

/*Object: Game
    Purpose: Runs the interface and does the math for a game of blackjack.
*/



public class Game {
    private Player[] players;   //one dealer and one user for every console game
    private Deck deck;          //one deck for the game

    public Player[] getPlayers() { return players; }
    public Deck getDeck() { return deck; }


    //Creates a game. 
    public Game() {
        players = new Player[2];
        players[0] = new User();
        players[1] = new Dealer();
        deck = new Deck();
        deck.shuffle();
    }


    /*  run(ArrayList<String>): creates a game based on file input
        This game requires no user input or even the game's deck, just iterates through
        a serious a premade commands*/
    
    public void run(ArrayList<String> input) {
        /*
        boolean winner = false;
        int pos;
        int turn = 0;
        players[0].setHand(new Card[] {
            new Card(Character.toString(input.get(0).charAt(0)), Character.toString(input.get(0).charAt(1))),
            new Card(Character.toString(input.get(1).charAt(0)), Character.toString(input.get(1).charAt(1)))
        });
        players[1].setHand(new Card[] {
            new Card(Character.toString(input.get(2).charAt(0)), Character.toString(input.get(0).charAt(1))),
            new Card(Character.toString(input.get(3).charAt(0)), Character.toString(input.get(1).charAt(1)))
        });
        pos = 4;

        System.out.println("The game has begun.");
        players[0].showHand();
        players[1].showHand();

        while (!winner) { //loop hitting/standing until someone wins!
            winner = checkBJ(players);  //test for immediate blackjack

            if (winner) { break; }      //break if game is already won

            System.out.print("-----\n" + players[turn].getName() + "'s turn.\n"); //begin turn
            //if user stands, their hand is revealed and the dealer has a chance to hit
            if (turn == 0) {
                if (input.get(pos).equals("S")) {
                    System.out.println("User stands");
                    pos++;
                    players[turn].showHand();
                    turn += 1;
                } else {
                    //every time the player chooses hit, their hand is revealed and tested for a bust
                    System.out.println("User hits.");
                    pos++;
                    players[turn].add(new Card(Character.toString(input.get(pos).charAt(0)), 
                                                Character.toString(input.get(pos).charAt(1)))); //draw card
                    players[turn].showHand();
                
                }
            }
            else if (turn == 1) {
                if (players[turn].standing()) {
                    players[turn].showHand();
                    turn += 1;
                } else {
                    //every time the player chooses hit, their hand is revealed and tested for a bust
                    pos++;
                    players[turn].add(new Card(Character.toString(input.get(pos).charAt(0)), 
                                                Character.toString(input.get(pos).charAt(1)))); //draw card
                    players[turn].showHand();
                    
                }
                
            
            }
            else if (turn == 2) {
                winner = checkBJ(players);
                if (!winner) {
                    compareScore(players);
                }
                winner = true;
            }

        
    }
    */
}











    /*  run(): creates a game based on console input. This game requires
        constant prompts to the user, and complete access to a shuffled deck.
    */
    public void run() {
        int turn = 0;
        boolean winner = false;
        //draws hands for user and dealer
        players[0].draw(deck);
        players[0].draw(deck);
        players[1].draw(deck);
        players[1].draw(deck);

        //begins the game
        System.out.println("The game has begun.");
        players[0].showHand();
        players[1].showHand();

        while (!winner) { //loop hitting/standing until someone wins!
            winner = checkBJ(players);  //test for immediate blackjack

            if (winner) { break; }      //break if game is already won

            System.out.print("-----\n" + players[turn].getName() + "'s turn.\n"); //begin turn
            //if user stands, their hand is revealed and the dealer has a chance to hit
            if (players[turn].standing()) {
                players[turn].showHand();
                turn += 1;
            } else {
                //every time the player chooses hit, their hand is revealed and tested for a bust
                players[turn].draw(deck); //draw card
                players[turn].showHand();
                
            }

            if (turn == 2) {
                winner = checkBJ(players);
                if (!winner) {
                    compareScore(players);
                }
                winner = true;
            }


        }


    }

    public boolean checkBJ(Player[] players) {
        if (players[0].getHand() > 21) {
            System.out.println("User has a score of " + players[0].getHand() + " and busts. Dealer wins.");
            return true;
        } else if (players[0].getHand() == 21) {
            if (players[1].getHand() != 21) {
                System.out.println("User has blackjack and Dealer does not. User wins.");
                return true;
            }
        }
        if (players[1].getHand() > 21) {
            System.out.println("Dealer has a score of " + players[1].getHand() + " and busts. Player wins.");
            return true;
        } else if (players[1].getHand() == 21) {
            System.out.println("Dealer has blackjack and wins.");
            return true;
        }
        return false;
    }

    public int compareScore(Player[] players) {
        System.out.print("User has " + players[0].getHand() + " points and Dealer has " + players[1].getHand() + " points. ");
        if (players[0].getHand() > players[1].getHand()) {
            System.out.println("User wins!");
            return 0;
        }
        else {
            System.out.println("Dealer wins!");
            return 1;
        }

    }


}