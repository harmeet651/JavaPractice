package codingNinjas;
import java.util.Scanner;

public class MinLengthWordString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str2 = FindMinlenWord(str);
		System.out.println(str2);
	}
	public static String FindMinlenWord(String str)
	{
		int c=0, m=str.length();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				c++;		
			}
		}
		String[] words = str.split(" ");
		String sample = words[0];
		for(int i=1;i<c+1;i++)
		{
			if(sample.length()>words[i].length())
			{
				sample = words[i];
			}
		}
		return sample;
	}
}
