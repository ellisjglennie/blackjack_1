package ellisglennie.blackjack;


import junit.framework.TestCase;
import java.io.BufferedReader;
import java.io.FileReader;


public class AcceptsFileInputTest extends TestCase {


    public void testIfFileGiven() { //tests if a file was provided
        Menu game = new Menu();

        assertTrue(Menu.gameFileName.length() > 0);
    }

    public void testIfFileOpens() { //tests whether the file is valid type (.txt)
        Menu game = new Menu();

        assertEquals(".txt", gameFileName.substring(gameFileName.length() - 4));
    }


    public void testIfFileEmpty() { //tests if file has any content
        Menu game = new Menu();

        assertTrue(Menu.gameCards.size() > 0);

    }

    public void testIfFileContentValid() { //test that the file content is all valid card entries with no duplicates
        Menu game = new Menu();

        assertTrue(Menu.gameCards.isValid());
    }


}