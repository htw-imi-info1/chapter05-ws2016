

import static org.junit.Assert.*;

import static org.junit.Assert.assertThat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class ZufallszahlenTesterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ZufallszahlenTesterTest
{
    private ZufallszahlenTester zt;

    /**
     * Default constructor for test class ZufallszahlenTesterTest
     */
    public ZufallszahlenTesterTest()
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
        zt = new ZufallszahlenTester();
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
    public void testGenerateResponse()
    {
        Set<String> answers = new HashSet<String>();
        answers.add("ja");
        answers.add("nein");
        answers.add("vielleicht");      
    
        String actual = zt.generateResponse();
        assertTrue(answers.contains(actual));
    }

    @Test
    public void testWuerfeln()
    {
        for (int i = 0; i< 100; i++){
          int actual = zt.wuerfeln(); 
          assertTrue((1 <= actual )&&(actual <= 6));
        }
    }
}



