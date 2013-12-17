
/**
 * This class counts its instances.
 * 
 * @author Barbara Kleinen 
 * @version 16.12.2013
 */
public class InstanceCounter
{
    private static int instanceCounter = 0;
    private int instanceNumber = 0;
    public InstanceCounter()
    {
        instanceCounter++;
        instanceNumber = instanceCounter;
    }
    public static int getInstanceCounter(){
        return instanceCounter;
    }
    protected static void resetInstanceCounter(){
        instanceCounter = 0;
    }
    public int getInstanceNumber(){
        return instanceNumber;
    }
    
}
