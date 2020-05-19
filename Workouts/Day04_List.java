package Workouts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Day04_List
{
	public static void main(String[] args) 
	{
		// Method 1
		String str = "Bugatti Chiron";
		List<Character> lst_1 = new ArrayList<Character>();
		for(int i = 0; i < str.length();i++) 
		{
			lst_1.add(str.charAt(i));
		}
		for (int i = 0; i < lst_1.size(); i++) 
		{
			System.out.print(lst_1.get(i));
		}
		System.out.println("***************************************************************");
		//Method 2
		List<Character> lst_2 = new ArrayList<Character>();
		for(int i = 0; i < str.length();i++) 
		{
			lst_2.add(str.charAt(i));
		}
		for (Character eachChar : lst_2) 
		{
			System.out.print(eachChar);
		}
		System.out.println("***************************************************************");
		//Method 3
		List<Character> lst_3 = new ArrayList<Character>();
		for(int i = 0; i < str.length();i++) 
		{
			lst_3.add(str.charAt(i));
		}
		Iterator<Character> iterator = lst_3.iterator();
		while(iterator.hasNext()) 
		{
			System.out.print(iterator.next());
		}
		System.out.println("***************************************************************");
		//Method 4
		List<Character> lst_4 = new ArrayList<Character>();
		for(int i = 0; i < str.length();i++) 
		{
			lst_4.add(str.charAt(i));
		}
		int count = 0;
		while(count<lst_4.size()) 
		{
			System.out.print(lst_4.get(count));
			count++;
		}
	}

}
