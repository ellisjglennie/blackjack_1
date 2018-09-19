package ellisglennie.blackjack;

import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.*;


public class Menu {
    protected static Scanner sc = new Scanner(System.in);
    protected static ArrayList<String> input = new ArrayList<>();
	

    public static ArrayList<String> getCards() { //tests if a file was provided and if it is .txt
        ArrayList<String> c = new ArrayList<>();
        String f = "";

        while (true) {
            f = sc.nextLine();

            c = getGameContent(f);
            if (c != null) {
                return c;
            }
            System.out.println("Invalid file. Try again.");
        }
    }


    public static ArrayList<String> getGameContent(String fileName) {
        try {
            String r = new String(Files.readAllBytes(Paths.get(fileName)));
            ArrayList<String> c = new ArrayList<>(Arrays.asList(r.split(" ")));

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


    public static void main(String[] args) {
		
        //System.out.print("Welcome to Blackjack. Select file input (f) or console input (c): ");

        //Right now i'm not implementing the options, just checking to see if it will read file input.
        //Assume f is chosen.

        System.out.print("Enter the name of a .txt file in your current folder: ");

        //System.out.print("Enter your cards and (optional) commands to stand/hit: ");


        input = getCards();
		



    }



}
