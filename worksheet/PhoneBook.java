import java.util.*;
/**
 * Worksheet 05 2 b
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhoneBook
{
    Map<String,String> map = new HashMap<String,String>();
    public void enterNumber(String name, String number){
        map.put(name, number);
    }

    public String lookupNumber(String name){
        return map.get(name);
    }
}
