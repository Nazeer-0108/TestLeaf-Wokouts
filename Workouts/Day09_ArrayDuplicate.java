package Workouts;
public class Day09_ArrayDuplicate 
{
	public static void main(String[] args) 
	{
		//Method 1 - For iteration
		int[] array = {5,9,34,34,22,22,5}; 
		for (int i =0; i < array.length-1; i++)
		{
			for(int j=i+1; j< array.length; j++)
			{
				if ((array[i] == array[j]) && (i != j))
				{
					System.out.println("Duplicate values are: " + array[j]);
				}
			}
		}
		System.out.println("**********************************************");
	}
}
		
		