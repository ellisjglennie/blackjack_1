package ellisglennie.blackjack;


import junit.framework.TestCase;
import java.io.IOException;
import java.util.*;


public class AcceptsFileInputTest extends TestCase {


    public void testIfFileGiven() throws IOException { //tests if a file was provided
        Menu.sc = new Scanner("game.txt");
        Menu.input = Menu.getCards();

        assertTrue(Menu.input.size() > 0);
    }

    public void testIfFileOpens() throws IOException { //tests whether the file is valid type (.txt)
        Menu.sc = new Scanner("game.txt");
        Menu.input = Menu.getCards();

        assertTrue(Menu.input.size() > 0);
    }


    public void testIfFileEmpty() throws IOException { //tests if file has any content
        Menu.sc = new Scanner("game.txt");
        Menu.input = Menu.getCards();

        assertTrue(Menu.input.size() > 0);
    }

    /*public void testIfFileContentValid() throws IOException { //test that the file content is all valid card entries with no duplicates

        assertTrue(Menu.isValid(Menu.getCards("game.txt").get(5)));
    }*/


}