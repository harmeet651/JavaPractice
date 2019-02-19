package codingNinjas;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		boolean as = reverseString(input);
		System.out.println(as);
	}
	public static boolean reverseString(String input)
	{
		String a="";
		for(int i=input.length()-1;i>=0;i--)
		{
			a = a+input.charAt(i);
		}
		if(input.equals(a))
		{
			return true;
		}	
			return false;
	}
}
