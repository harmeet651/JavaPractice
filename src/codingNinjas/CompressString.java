package codingNinjas;
import java.util.Scanner;

public class CompressString {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String inp = s.nextLine();
		String out = compressWord(inp);
		System.out.println(out);
	}
	public static String compressWord(String inputString)
	{
<<<<<<< HEAD
	    int i=0,j;
	      int l=inputString.length();
		 String s="";
	while(i<l-1)
     {	
        s=s+inputString.charAt(i);
        j=i+1;
        int x=1;
        while(j<=l-1 && inputString.charAt(j)==inputString.charAt(i))
        {
          j++;
          x++;
        }
        if(x!=1)
        {
          s=s+x;
        }
          i=j;
     }
		if(i==l-1)
			s=s+inputString.charAt(i);
	      return s;
	}
=======
		  int i=0,j;
	      int l=inputString.length();
  		 String s="";
  		while(i<l-1)
        {	
  			int x=1;
  			j=i+1;
          while(j<=l-1 && inputString.charAt(j)==inputString.charAt(i))
          {
        	  x++;
        	  j++;
        	  s=s+inputString.charAt(i);
          }
          if(j==j+1)
          {
        	  i++;
          }
          i=j;
          if(x!=1)
          {
        	  s=s+x;
          }
          return s;
        }
  		if(i==l-1)
  			s=s+inputString.charAt(i);
	      return s;
}
>>>>>>> 6b527c7965cf85e82af1b43b9c330ac69095e705
}