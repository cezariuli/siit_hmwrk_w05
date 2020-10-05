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

        nokia1.addContact("1", "0740100100", "Cezar", "Florea");
        nokia1.addContact("2", "0740200200", "Ion", "Popescu");

        nokia1.listContacts();

        assertTrue( true );
    }
}
