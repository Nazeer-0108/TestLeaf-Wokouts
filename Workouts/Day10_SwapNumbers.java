package Workouts;
public class Day10_SwapNumbers 
{
	public static void main(String[] args) 
	{
		//Method-1 - Swap using 3rd variable
		int a = 5, b= 10;
		int c= 0;
		System.out.println("Before swap: a = " + a + " & b = "+ b);
		c = a;//now c = 5
		a = b;//now a = 10
		b = c; //now b = 5
		System.out.println("After swap: a = " + a + " & b = "+ b);		
		System.out.println("**************************************");
		
		//Method-2 - Swap without using 3rd variable
		int x = 25, y= 10;
		System.out.println("Before swap: x = " + x + " & y = "+ y);
		x = x + y; //now x = 35
		y = x - y; //now y = 25
		x = x - y; //now x = 10
		System.out.println("After swap: x = " + x + " & y = "+ y);		
		System.out.println("**************************************");

	}

}
