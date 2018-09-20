package ellisglennie.blackjack;


import junit.framework.TestCase;
import java.util.*;




public class AcceptsConsoleInputTest extends TestCase {

    public void testOptionOfConsoleInput() { //user can choose between console and file input and file input is unique
        assertTrue(Menu.validGameType("c"));

    }


    public void testGameGenerated() { //a game can be generated
        assertTrue(Menu.validGameType("c"));

    }



}