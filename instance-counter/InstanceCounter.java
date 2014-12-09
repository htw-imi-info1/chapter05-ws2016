
/**
 * This class counts its instances.
 * 
 * @author Barbara Kleinen 
 * @version 16.12.2013
 */
public class InstanceCounter
{
    private static int counter = 0;
    private int no = 0;
    public InstanceCounter()
    {
        no = ++counter;
    }
    
}
