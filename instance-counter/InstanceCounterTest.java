

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class InstanceCounterTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class InstanceCounterTest
{
    private InstanceCounter instance1;
    private InstanceCounter instance2;

    /**
     * Default constructor for test class InstanceCounterTest
     */
    public InstanceCounterTest()
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
        instance1 = new InstanceCounter();
        instance2 = new InstanceCounter();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        InstanceCounter.resetInstanceCounter();
    }

    @Test
    public void testInstanceCounter()
    {
        assertEquals(2,InstanceCounter.getInstanceCounter());
    }
    @Test
    public void testGetInstanceNumberSecondInstance()
    {
        assertEquals(2, instance2.getInstanceNumber());
    }
    @Test
    public void testGetInstanceNumber()
    {
        InstanceCounter instance3 = new InstanceCounter();
        assertEquals(3, instance3.getInstanceNumber());
    }
}


