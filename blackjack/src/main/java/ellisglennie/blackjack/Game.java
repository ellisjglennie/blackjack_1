package ellisglennie.blackjack;

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
        a serious a premade commands
    */
    public void run(ArrayList<String> input) { 
        
    }


    /*  run(): creates a game based on console input. This game requires
        constant prompts to the user, and complete access to a shuffled deck.
    */
    public void run() {
        int turn = 0;
        int swap = -1;
        //draws hands for user and dealer
        players[0].draw(deck);
        players[0].draw(deck);
        players[1].draw(deck);
        players[1].draw(deck);

        System.out.println("The game has begun.");
        players[0].showHand();
        players[1].showHand();

        while (true) {
            //check for blackjack!

            players[turn].startTurn();
            if (players[turn].standing()) {
                players[turn].showHand();
                turn += 1;
            } else {
                System.out.println("Testing.");
                players[turn].draw(deck);
                players[turn].showHand();
            }


        }



    

    }


 








}