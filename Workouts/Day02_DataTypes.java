package Workouts;
public class Day02_DataTypes 
{
	public static void main(String[] args) 
	{
		String inputString = "1. It* is Work from Home Not Work for Home";
		//Using character class
		int digit =0, ucase =0, lcase =0, spaces =0;
		char[] c = inputString.toCharArray();
		for (char ch : c)
		{
			if(Character.isDigit(ch))
			{
				digit ++;
			}
			else if (Character.isUpperCase(ch)) 
			{
				ucase ++;
			}
			else if (Character.isLowerCase(ch)) 
			{
				lcase ++;
			}
			else if (Character.isWhitespace(ch)) 
			{
				spaces ++;
			}
		}
		System.out.println("Total Numbers : "+ digit);
		System.out.println("Total Uppercase : "+ ucase);
		System.out.println("Total Lowercase : "+ lcase);
		System.out.println("Total Space : "+ spaces);
		System.out.println("****************************************");
		
		//Method 2 - RegEx
		System.out.println("Total Numbers : "+ inputString.replaceAll("[^0-9]", "").length());
		System.out.println("Total Uppercase : "+ inputString.replaceAll("[^A-Z]", "").length());
		System.out.println("Total Lowercase : "+ inputString.replaceAll("[^a-z]", "").length());
		System.out.println("Total Space : "+ inputString.replaceAll("\\S", "").length());
		System.out.println("****************************************");
		
	}
}
