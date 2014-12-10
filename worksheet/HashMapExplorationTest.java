

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * The test class HashMapExplorationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HashMapExplorationTest
{
    
    
    /**
     * Default constructor for test class HashMapExplorationTest
     */
    public HashMapExplorationTest()
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

   @Test 
   public void howManyEntries(){
       HashMap<String,Integer> map = new HashMap<>();
       map.put("Trick",815);
       map.put("Track", 4711);
       assertEquals(2,map.size());  
    }
    
    @Test
    public void Ex5_27(){
       HashMap<String,Integer> map = new HashMap<>();
       map.put("Trick",815);
       map.put("Track", 4711);
       // when
       map.put("Track", 23);
       assertEquals(815,map.get("Trick").intValue());
       assertEquals(23,map.get("Track").intValue());
       assertEquals(2,map.size());
       
    }
    @Test
    public void Ex5_28(){
       HashMap<String,Integer> map = new HashMap<>();
       // zwei einträge mit gleichem Wert
       map.put("Trick",815);
       map.put("Track", 815);
       // dann gibt es diese zwei Einträge
       assertEquals(815,map.get("Trick").intValue());
       assertEquals(815,map.get("Track").intValue());
       assertEquals(2,map.size());
       
    }
    
    
    @Test
    public void addingExistingElementToSet(){
        HashSet<Integer> lottoDrawing = new HashSet<>();
        lottoDrawing.add(1);
        assertEquals(1,lottoDrawing.size());
        lottoDrawing.add(1);
        assertEquals(1,lottoDrawing.size());
    }
    
}
