package Workouts;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Day05_RemoveDuplicate 
{
	public static void main(String[] args)
	{
		//Method 1
		List<String> str = new ArrayList<String>(); 
		str.add("A");
		str.add("B");
		str.add("C");
		str.add("D");
		str.add("A");
		str.add("D");
		str.add("E");
		str.add("F");
		Set<String> strSet = new LinkedHashSet<String>(str); 
		System.out.println("After Removing duplicate " + strSet);
		System.out.println("***************************************");
		
		//Method 2
		List<String> strDup = new ArrayList<String>(str);
		for (int i=0; i < str.size(); i++)
		{
			String eachStr = str.get(i);
			int count = 0;
			for (int j=0; j < strDup.size(); j++)
			{
				if (strDup.get(j) == eachStr)
				{
					count++;
				}
			}
			if (count > 1) 
			{
				strDup.remove(eachStr);
			}
		}
		System.out.println("After removal " + strDup);

	}

}
