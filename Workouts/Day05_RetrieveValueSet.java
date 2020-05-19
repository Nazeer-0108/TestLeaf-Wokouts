package Workouts;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class Day05_RetrieveValueSet 
{
	public static void main(String[] args) 
	{
		//Method 1
		Set<Integer> set = new LinkedHashSet<Integer>(); 
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		set.add(7);
		set.add(8);
		set.add(9);
		List<Integer> list = new ArrayList<Integer>(set); 
		System.out.println("Retrived value " + list.get(6));
		System.out.println("***************************************");

		//Method 2
		for (Integer eachNum : set)
		{
			if (eachNum == 7)
			{
				System.out.println("Retrived value: " + eachNum);
			}
		}
		System.out.println("***************************************");
		
		}

}
