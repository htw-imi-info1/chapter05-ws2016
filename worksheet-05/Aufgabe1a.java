import java.util.Random;
public class Aufgabe1a
{
      Random randomGenerator = new Random();
  
    public int rollDice(){
        return randomGenerator.nextInt(6) + 1;

    }

    public static void main(String[] args){
        Aufgabe1a instance = new Aufgabe1a();
        for(int i = 0;i<100;i++) 
            System.out.println(instance.rollDice());
    }
}
