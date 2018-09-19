package codingNinjas;
import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		String out = reverseWords(inp);
		System.out.println(out);
	}
	public static String reverseWords(String input)
	{
		 int i,j;
	      int l=input.length();
	      String s="";
	      for(i=0;i<l;i++)
	      {	
	        if(input.charAt(i)==' ' || i==l-1)
	        {
	          if(i==l-1)
	            j=i;
	          else
	            j=i-1;
	          while(j>=0)
	          {
	            if (input.charAt(j)==' ')
	              break;
	             s=s+input.charAt(j);
	            j--;
	          }
	          s=s+' ';
	        }
	      }
			return s;

	}
}
