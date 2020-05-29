package Workouts;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Day07_CountCharWithMap 
{
	public static void main(String[] args) 
	{
		//Method 1
		//Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();
		String inputString = "Karma is powerful than God";
		inputString = inputString.replace(" ", "");
        //Converting given string to char array
        char[] strArray = inputString.toCharArray();
        //checking each char of strArray
        for (char c : strArray)
        {
        	if(countMap.containsKey(c))
            {
        		//If char 'c' is present in charCountMap, incrementing it's count by 1
        		countMap.put(c, countMap.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap, putting 'c' into charCountMap with 1 as it's value
                countMap.put(c, 1);
            }
        }
        //Printing inputString and charCountMap 
        System.out.println("Method-1 => HashMap: " + inputString+" : "+countMap);
	}
}