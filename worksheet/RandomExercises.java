import java.util.*;
/**
 * Solutions for Worksheet Chapter 05 
 * Part 1 Random
 * 
 * @author IMI 1. Semester WS 2013
 * @version 17.12.2013
 */
public class RandomExercises
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
