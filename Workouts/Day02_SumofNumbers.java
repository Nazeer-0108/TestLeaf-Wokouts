package Workouts;
public class Day02_SumofNumbers 
{
	public static void main(String[] args) 
	{
		//Iteration method using Character class
		String inputString = "asdf1qwer9as8d8";
		int sum = 0;
		for (int i = 0; i < inputString.length(); i++)
		 {
			char c = inputString.charAt(i);
			if(Character.isDigit(c)) 
			{
				int dig = Character.getNumericValue(c);
				sum = dig + sum;
			}
		}
		System.out.println("Method 1 - Iteration method using Character class "+ sum);
		System.out.println("******************************************");
		
		//RegEx
		int sol = 0;
		String number_str = inputString.replaceAll("[^0-9]", "");
		int num = Integer.parseInt(number_str);
		while (num > 0)
		{
			sol += num%10;
			num /= 10;
		}
		System.out.println("Method 2 - RegEx " + sol);
		System.out.println("******************************************");
		
		//ASCII
		int asciiSum = 0;
		for (int k = 0; k < inputString.length(); k++)
		 {
			int temp = inputString.charAt(k);
			//ASCII value for 0 = 48 & 9 = 57
			if(temp >= 48 && temp <=57) 
			{
				asciiSum += Integer.parseInt(String.valueOf(inputString.charAt(k))); 
			}
		}
		System.out.println("Method 3 - ASCII "+ asciiSum);
	}
}

