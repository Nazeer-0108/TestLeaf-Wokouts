package Workouts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Day04_Collections
{
	public static void main(String[] args) 
	{
		String ip = "When life gives you lemons, make lemonade";
		
		//Method 1
		Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
        char[] charArray = ip.toCharArray();  
        for (Character ch : charArray) 
        {  
            if (baseMap.containsKey(ch)) 
            {  
                baseMap.put(ch, baseMap.get(ch) + 1);  
            }
            else 
            {  
                baseMap.put(ch, 1);  
            }  
        }  
        Set<Character> keys = baseMap.keySet();  
        for (Character ch : keys) 
        {  
            if (baseMap.get(ch) > 1) 
            {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        }
        System.out.println("************************************************************************");
        //Method 2
        Set<Character> set = new LinkedHashSet<Character>();
    	//String str = "When life gives you lemons, make lemonade";
    	for (int i = 0; i < ip.length(); i++) {
    		if(!set.add(ip.charAt(i))) {
    			System.out.println(ip.charAt(i)+",");
    		}
    	}
    	
    	System.out.println("************************************************************************");
        //Method 2
        List<Character> lst = new ArrayList<Character>();
    	//String str = "When life gives you lemons, make lemonade";
    	for (int j = 0; j < ip.length(); j++) {
    		if(!lst.contains(ip.charAt(j))) {
    			lst.add(ip.charAt(j));
    		}
    		else {
    			System.out.println(ip);
    		}
    	}
	}
}

