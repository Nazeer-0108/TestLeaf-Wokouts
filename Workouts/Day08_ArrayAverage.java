package Workouts;
public class Day08_ArrayAverage 
{
	public static void main(String[] args) 
	{
		//Method 1 - For iteration
		int[] array = {5,9,34,79,22,11,45}; 
		int sum = 0;
		for (int i =0; i < array.length; i++)
		{
			sum = sum + array[i];
		}
		double avg = sum / array.length;
		System.out.println("Method 1 - For iteration");
		System.out.println("Total numbers: " + array.length);
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		System.out.println("**********************************************");
		
		//Method 2 - For Each
		int total = 0;
		for (int eachnumber : array)
		{
			total+=eachnumber;				
		}
		//double avg = sum / array.length;
		System.out.println("Method 2 - For Each");
		System.out.println("Total numbers: " + array.length);
		System.out.println("Total: " + total);
		System.out.println("Average: " + total/array.length);
		System.out.println("**********************************************");
				

	}

}
