package Workouts;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Day03_EmailValidation 
{
	public static void main(String[] args) 
	{
		//Method 1
		String str = "balaji.chandrasekaran@testleaf.com";
		String pattern = "[a-zA-Z0-9._]+@[a-zA-Z0-9]+.[a-zA-Z.]{2,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());
		System.out.println("*********************************************");
		//Method 2
		System.out.println(Pattern.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9]+.[a-zA-Z.]{2,}", "balaji.chandrasekaran@testleaf.com"));
		System.out.println(Pattern.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9]+.[a-zA-Z.]{2,}", "balaji.c@tunatap.co.uk"));
		System.out.println(Pattern.matches("[a-zA-Z0-9._]+@[a-zA-Z0-9]+.[a-zA-Z.]{2,}", "naveen e@tl.com"));
	}

}
