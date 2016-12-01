import java.util.Random;
/**
 * This class counts its instances.
 * 
 * @author Barne Kleinen 
 */
public class InstanceCounter
{
    
    Random rand = new Random();
    public void x(){
        Random rand = new java.util.Random();
        int i = new rand.nextInt(6);
    }
    
    
    
    public static final double PI = 3.14;
    static int instanceCounter = 0;
    int instanceNumber = 0;

    public InstanceCounter()
    {
        instanceCounter++;
        instanceNumber = instanceCounter;
    }

    public int getInstanceNumber(){
        return instanceNumber;
    }

    public void test() 
    {
        int sum = 1;

        for (int i = 0; i <= 4; i++)
        {
            sum = sum + 1;
        }

        System.out.println("The result is: " + sum);
        System.out.println("Double result: " + sum+sum);
    }

}
