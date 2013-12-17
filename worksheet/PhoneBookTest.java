

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PhoneBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PhoneBookTest
{
    private PhoneBook phoneBook;

    /**
     * Default constructor for test class PhoneBookTest
     */
    public PhoneBookTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        phoneBook = new PhoneBook();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testIt()
    {
        phoneBook.enterNumber("Trick", "123");
        phoneBook.enterNumber("Track", "456");
        assertEquals("123", phoneBook.lookupNumber("Trick"));
    }
}

