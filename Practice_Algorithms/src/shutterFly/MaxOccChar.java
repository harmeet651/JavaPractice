package shutterFly;

import java.util.HashMap;
import java.util.Map;

public class MaxOccChar {

	public static void main(String[] args) {
		String s = "bbaa";
		char ans = findMaxOccChar(s);
		System.out.println(ans);

	}

	private static char findMaxOccChar(String items) 
	{
		int finalSize = 256;
		int[] count = new int[finalSize];
		int l = items.length();
		for(int i=0;i<l;i++)
		{
			count[items.charAt(i)]++;
		}
		int max = -1; 
        char result = ' ';  

        for(int i=0;i<l;i++)
        {
        	if(max<count[items.charAt(i)])
        	{
        		 max = count[items.charAt(i)]; 
                 result = items.charAt(i);
        	}
        }
        return result;
	}

}
