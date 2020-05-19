package Workouts;
public class Day02_ReverseWords 
{
	public static void main(String[] args) 
	{
		String inputString = "When the world realise its own mistake, corona will dissolve automatically";
		System.out.println(inputString);
		String[] arr = inputString.split(" ");
		for (int i = 0; i < arr.length; i++) 
		{
			if (i%2!=0) 
			{
				StringBuffer stb = new StringBuffer(arr[i]);
				stb.reverse();
				System.out.print(stb + " ");
			}
			else
			{
				System.out.print(arr[i] + " ");
			}
		}
				
		for (int j = 0; j < arr.length; j++)
			if (j%2 == 0) 
			{
				StringBuffer stb = new StringBuffer(arr[j]);
				stb.reverse();
				System.out.print(stb + " ");
			}
			else
			{
				System.out.print(arr[j] + " ");
			}
	}
}
