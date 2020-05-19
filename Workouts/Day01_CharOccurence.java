package Workouts;
public class Day01_CharOccurence 
{
	public static void main(String[] args) 
	{
		String inputString = "You have no choice other than following me!";
		int count = 0;
		char[] strArray = inputString.toCharArray();
        //Method 1
		for (int i=0; i < strArray.length; i++)
        {
        	if(strArray[i] == 'o')
            {
        		count = count+1;
            }
        }
        System.out.println("Occurence of o is " + count);
        
        //Method 2
        int countA = 0;
        for (int i=0; i < inputString.length(); i++)
        {
        	if(inputString.charAt(i) == 'o')
            {
        		countA++;
            }
        }
        System.out.println("Occurence of o is " + countA);
        
        //Method 3
        String replacedStr = inputString.replaceAll("[^o]", "");
        System.out.println("Occurence of o is " + replacedStr.length());
        
	}
}