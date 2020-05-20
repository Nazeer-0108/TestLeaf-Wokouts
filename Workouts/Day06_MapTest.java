package Workouts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day06_MapTest 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> mp = new HashMap<String, Integer>(); 
		mp.put("A", 1);
		mp.put("B", 2);
		mp.put("C", 3);
		mp.put("D", 4);
		mp.put("E", 5);
				
		//Method 1 - For Loop
		for (Entry<String, Integer> eachEntry : mp.entrySet())
		{
			System.out.println("Method-1 => For Loop " + eachEntry.getKey()+"->"+eachEntry.getValue());	
		}
		System.out.println("*********************************************************************************");

		//Method 2 - ForEach & lambda
		mp.forEach((eachKey,eachValue)->System.out.println("Method-2 => ForEach with lambda " + eachKey+"->"+eachValue));
		System.out.println("*********************************************************************************");
		
		// Method 3 - Iterator
		Iterator<Entry<String, Integer>> itrKey = mp.entrySet().iterator();
		while (itrKey.hasNext()) 
		{
			Entry<String, Integer> eachEntry = itrKey.next();
			System.out.println("Method-3 => Iterator " +eachEntry.getKey()+"->"+eachEntry.getValue());
		}
		System.out.println("*********************************************************************************");
		
		// Method 4 - Iterator with ForEachRemaining
		Iterator<Entry<String, Integer>> iterator = mp.entrySet().iterator();
		iterator.forEachRemaining((eachEntry)->System.out.println("Method-4 => Iterator with ForEachRemaining " +eachEntry.getKey()+"->"+eachEntry.getValue()));
		System.out.println("*********************************************************************************");
		
		//Method 5 - Set, List
        Set<String> set = new HashSet<>(mp.keySet());
        List<String> lst = new ArrayList<>(set);
        for (int i = 0; i < lst.size(); i++) {
            System.out.println("Method-5 => Set & List with Map " + lst.get(i) + "->" + mp.get(lst.get(i)));
        }
	}
}
