package ellisglennie.blackjack;


import junit.framework.TestCase;
import java.util.*;


public class AcceptsConsoleInputTest extends TestCase {


    public void testIfConsoleAcceptsInput() { //tests whether the the console allows the user to enter commands
        Menu.sc = new Scanner("SK HQ SQ C5 S DJ");
        Menu.input = Menu.getCards(false);

        assertTrue(Menu.input != null);
    }

    public void testConsoleReading() { //tests whether console input is read
        Menu.sc = new Scanner("SK HQ SQ C5 S DJ");
        Menu.input = Menu.getCards(false);

        assertTrue(Menu.input != null);
    }

    public void testInputEmpty() { //tests whether input is empty or not
        Menu.sc = new Scanner("SK HQ SQ C5 S DJ");
        Menu.input = Menu.getCards(false);

        assertTrue(Menu.input != null);
    }



}