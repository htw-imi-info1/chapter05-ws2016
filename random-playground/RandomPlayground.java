import java.util.*;
/**
 * Just to play with Random
 * 
 * @author Barne Kleinen 
 */
public class RandomPlayground
{
    Random randomGenerator;
    public RandomPlayground()
    {
        randomGenerator = new Random();
    }

    public int rollDice(){
        return randomGenerator.nextInt(6)+1;
    }

    public String generateResponse(){
        String[] responses = {"ja","nein", "vielleicht"};
        return responses[randomGenerator.nextInt(responses.length)];
    }

    List<String> responses = new ArrayList<>();

    public String generateResponse2(){
        return responses.get(randomGenerator.nextInt(responses.size()));
    }
}   
