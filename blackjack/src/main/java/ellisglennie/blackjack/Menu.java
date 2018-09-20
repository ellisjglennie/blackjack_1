package ellisglennie.blackjack;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;


public class Menu {
    protected static Scanner sc = new Scanner(System.in);
    protected static ArrayList<String> input = new ArrayList<>();
    protected static String mode = "";

    public static void main(String[] args) {
		
        System.out.print("Welcome to Blackjack. /n Select file input (f) or console input (c): ");

        System.out.print("Enter the name of a .txt file in your current folder: ");

        
        input = getCards();
        

		



    }


	

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

    public static boolean isValid(ArrayList<String> c) {
        for (String item : c) {
            if (item.length() == 3) {
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






}
