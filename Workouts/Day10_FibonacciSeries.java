package Workouts;
public class Day10_FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int range =10, a=-1, b=1;
		int [] array = new int [range];
		System.out.print("Before reversing: ");
		for (int i=0; i< range; i++)
		{
			array[i] = a+b;
			a = b;
			b = array[i];
			System.out.print(array[i] + ", ");
		}
		System.out.println("");
		System.out.print("After reversing: ");
		for (int i= array.length-1; i >=0 ; i--)
		{
			System.out.print(array[i] + ", ");
		}
		
	}

}
