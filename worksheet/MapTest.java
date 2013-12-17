
import java.util.*;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MapTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MapTest
{
    /**
     * Default constructor for test class MapTest
     */
    public MapTest()
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
    public void zweiA(){
        java.util.Map<Object,Object> theMap = new HashMap<Object,Object>();
        theMap.put(5,"die fuenf");
        theMap.put("hallo",4711);
        assertEquals(2,theMap.size());
        // deshalb ist Object als Typ unpraktisch:
        String fuenf = (String)theMap.get(5);
    }
    @Test
    public void zweiC(){
        java.util.Map<String,String> theMap = new HashMap<String,String>();
        theMap.put("Schmidt","234");
        theMap.put("Schmidt","123");
        assertEquals("ein element ist drin", 1,theMap.size());
        assertEquals("der wert wird überschrieben","123",theMap.get("Schmidt"));
        
    }
  @Test
    public void zweiD(){
        java.util.Map<String,String> theMap = new HashMap<String,String>();
        theMap.put("Schmidt1","123");
        theMap.put("Schmidt2","123");
        assertEquals("ein element ist drin", 2,theMap.size());
        assertEquals("123",theMap.get("Schmidt1"));
        assertEquals("123",theMap.get("Schmidt2"));
        
    }
    @Test
    public void zweiE(){
        java.util.Map<String,String> theMap = new HashMap<String,String>();
        theMap.put("Trick","123");
        theMap.put("Track","123");
        assertTrue("Trick is in map",theMap.containsKey("Trick"));
        assertFalse("Tick is not in map",theMap.containsKey("Tick"));     
        assertTrue("Trick is in map",theMap.get("Trick") != null);

    }
    @Test
    public void zweiF(){
        java.util.Map<String,String> theMap = new HashMap<String,String>();
        theMap.put("Trick","123");
        theMap.put("Track","123");
        assertEquals("Tick is not in map",null,theMap.get("Tick"));     
    
    }
    @Test
    public void zweiH(){
        java.util.Map<String,String> theMap = new HashMap<String,String>();
        theMap.put("Track","123");
        theMap.put("Trick","123");
        String allKeys = "";
        for(String key : theMap.keySet()){
           allKeys += key;
        }
        assertTrue(allKeys.contains("Track"));
        assertTrue(allKeys.contains("Trick"));
          
    
    }
}
