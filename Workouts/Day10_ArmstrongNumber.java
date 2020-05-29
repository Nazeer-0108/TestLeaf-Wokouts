package Workouts;
public class Day10_ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int r=0, sum=0;
		for (int i=0; i < 1000; i++)
		{
			sum = 0;
			int temp =i;
			while (temp >0)
			{
				r = temp%10;
				sum = (int) (sum + Math.pow(r, 3));
				temp = temp/10;
			}
			if (sum == i)
			{
				System.out.println("Armstrong Numbers are: " + sum);
			}
		}

	}

}
