package Workouts;

import java.util.Arrays;
import java.util.Collections;

public class Day08_ArraySorting
{
	public static void main(String[] args) 
	{
		int[] array = {5,1,33,79,22,11,45}; 
		//Method-1
		Arrays.sort(array);
		System.out.println("Method-1-> Ascending Order: ");
		for (int i=0; i < array.length; i++)
		{
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		System.out.println("Method-1-> Descending Order: ");
		for (int j=(array.length)-1; j>0; j--)
		{
			System.out.print(array[j] + ", ");
		}
		System.out.println("");
		System.out.println("*******************************************");
		
		//Method 2
		Integer[] arr = {5,1,33,79,22,11,45}; 
		Arrays.sort(arr);
		System.out.println("Method-2-> Ascending Order: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("Method-2-> Descending Order: ");
		Collections.reverse(Arrays.asList(arr));
		System.out.println(Arrays.asList(arr));
		System.out.println("*******************************************");                                                                  
		
		
		
		
		
		
		
	
	}

}
