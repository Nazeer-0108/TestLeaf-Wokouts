package Workouts;
public class Day08_ArrayCommonNumber 
{
	public static void main(String[] args) 
	{
		//Method 1 - For iteration
		int[] array1 = {5,9,34,79,22,11,45}; 
		int[] array2 = {8,9,32,79,21,11,42};
		for (int i =0; i < array1.length; i++)
		{
			for(int j=0; j< array2.length; j++)
			{
				if (array1[i] == array2[j])
				{
					System.out.println("Common numbers are: " + array1[i]);
				}
			}
		}
		System.out.println("**********************************************");
		for (int array1num : array1)
		{
			for (int array2num : array2)
			{
				if (array1num == array2num)
				{
					System.out.println("Common numbers are: " + array1num);
				}
			}
		}
		
		
	}
}
		
		