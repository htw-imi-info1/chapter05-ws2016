import java.util.*;
/**
 * Worksheet Chapter 05 - 1 Random
 * 
 * @author IMI 1. Semester
 * @version 17.12.2013
 */
public class ZufallszahlenTester
{
    public static final int SEITENZAHL = 6;
    Random random = new Random();
    
    /**
     * 1 a
     */
    public int wuerfeln(){
        return random.nextInt(SEITENZAHL) +1;       
    }
    
    /**
     * 1 b
     */
    public String generateResponse(){
        List<String> answers = new ArrayList<String>();
        answers.add("ja");
        answers.add("nein");
        answers.add("vielleicht");      
        return answers.get(random.nextInt(3));
    }
    /**
     * 1 c
     */
    public String generateResponseExtended(){
        List<String> answers = new ArrayList<String>();
        answers.add("ja");
        answers.add("nein");
        answers.add("vielleicht");
        answers.add("something else");
        return answers.get(random.nextInt(answers.size()));
    } 
   
}
