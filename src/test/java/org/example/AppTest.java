package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Phone nokia1 = new Nokia3310();
        Phone iPhone1 = new iPhoneX();

        nokia1.addContact("1", "0740100100", "Cezar", "Florea");
        nokia1.addContact("2", "0740200200", "Ion", "Popescu");

        iPhone1.addContact("1", "0740110110", "John", "Doe");
        iPhone1.addContact("2", "0740210210", "Jenna", "Jameson");
        iPhone1.addContact("3", "0740310310", "Berta", "Johnson");

        nokia1.listContacts();

        nokia1.sendMessage("0740100100", "Salut! Ce faci?");
        nokia1.sendMessage("0740100100", "Iesi la o bere?");

        iPhone1.sendMessage("0740210210", "Hi, Jenna!");
        iPhone1.sendMessage("0740210210", "How are you?");
        iPhone1.sendMessage("0740210210", "Did you attend the lecture last time?");

        iPhone1.call("0740110110");
        iPhone1.call("0740310310");

        nokia1.listMessages("0740100100");
        iPhone1.listMessages("0740210210");

        nokia1.call("0740200200");
        nokia1.call("0740100100");

        nokia1.viewHistory();
        iPhone1.viewHistory();

        assertTrue( true );
    }
}
