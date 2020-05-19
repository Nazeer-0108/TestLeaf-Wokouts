package Workouts;
public class Day01_Palindrome
{
   public static void main(String args[])
   {
      String str = "MALAYALAM";
      
      //Method 1
      String rev = "";
      for ( int i = str.length()-1; i >= 0; i-- )
         rev = rev + str.charAt(i);
      if (str.equals(rev))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
 
      //Method 2
      StringBuffer stb = new StringBuffer(str);
      String strRev = stb.reverse().toString();
      //Ternary operator
      System.out.println(str.equals(strRev)?"Yes, Palindrome":"No, Not Palindrome");
      
      
   }
}