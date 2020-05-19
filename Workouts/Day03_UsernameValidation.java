package Workouts;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Day03_UsernameValidation 
{
	public static void main(String[] args) 
	{
		//Method 1
		String str = "Balaji_1";
		String pattern = "[a-zA-Z0-9._@$]{8,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());
		System.out.println("*********************************************");
		//Method 2
		System.out.println(Pattern.matches("[a-zA-Z0-9._@$]{8,}", "Balaji_1"));
		System.out.println(Pattern.matches("[a-zA-Z0-9._@$]{8,}", "Testleaf$123"));
		System.out.println(Pattern.matches("[a-zA-Z0-9._@$]{8,}", "naveen e@tl.com"));
	}

}
