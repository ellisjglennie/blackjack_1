package ellisglennie.blackjack;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;


public class Menu {
    protected static Game game = new Game();                        //game interface and program
    protected static Scanner sc = new Scanner(System.in);           //scanner
    protected static ArrayList<String> input = new ArrayList<>();   //for file reading
    protected static String mode = "";                              //for determining game type

    public static void main(String[] args) {
		
        System.out.print("Welcome to Blackjack. \n\n\n");
        
        while (!validGameType(mode)) {
            System.out.print("Select file input (f) or console input (c):  "); //select game type
            mode = sc.nextLine();
        }

        if (mode.equals("f")) {
            System.out.print("Enter the name of a .txt file in your current folder: ");
            input = getCards();
            game.run(input); //file input game
        } else {
            game.run(); //console game
        }

    }


	
    /*getCards(): returns a full ArrayList of all cards and commands from a file
        
    */
    public static ArrayList<String> getCards() { //tests if a file was provided and if it is .txt
        String f = "";
        ArrayList<String> c = new ArrayList<>();
        while (true) {
            f = sc.nextLine();

            c = getGameContent(f);
            if (c != null) {
                boolean pass = isValid(c);
                if (pass) { 
                    return c;
                }
            }
            System.out.println("Invalid file. Try again.");
        }
    }

    //Read the file's 
    public static ArrayList<String> getGameContent(String fileName) {
        try {
            fileName = new String(Files.readAllBytes(Paths.get(fileName)));
            ArrayList<String> c = new ArrayList<>(Arrays.asList(fileName.split(" ")));

            if (c.size() > 0) {
                return c;
            } else {
                return null;
            }
        }
        catch (IOException e) {
			return null;
        }
    }

    //checks that the file input makes valid input for a game
    public static boolean isValid(ArrayList<String> c) {
        for (String item : c) {
            if (item.length() == 3) { //the only 3-character string allowed is a 10-rank card
                Card thisCard = new Card(Character.toString(item.charAt(0)), item.substring(-2));
                if (thisCard.getRank() == -1 || thisCard.getSuit() == -1) {
                    return false;
                }
            }
            else if (item.length() == 2) { //testing card validity
                Card thisCard = new Card(Character.toString(item.charAt(0)), Character.toString(item.charAt(1)));
				if (thisCard.getRank() == -1 || thisCard.getSuit() == -1) {
                    return false;
                }
            } else if (item.length() == 1) { //testing command validity
                if (!item.equals("H") && !item.equals("S")) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static boolean validGameType(String t) { //make sure the game type entered is either file or console
        if (t.equals("c") || t.equals("f")) {
            return true;
        }
        return false;
    }






}
