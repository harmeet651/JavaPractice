package LeetCode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String str = "";
		System.out.println(longestPalindrome(str));
	}
	 public static String longestPalindrome(String s) {
		    int l = s.length();
		    if(l==0)
		    	return "";
		    
	        boolean storage[][] = new boolean[l+1][l+1];
	        int maxL = 0;
	        String result = null;
	        int start=0;
	        for(int i=0;i<l;i++)
	        {
	        	storage[i][i] = true;
	        	result = s.substring(0, 1);
	        }
	        for(int i=0;i<l-1;i++)
	        {
	        	if(s.charAt(i)==s.charAt(i+1))
	        	{
	        		storage[i][i+1] = true;
	        		start = i;
	        		maxL = 2;
	        		result = s.substring(i,i+2);
	        	}
	        }
	        for(int k=3;k<=l;k++)
	        {
	        	for(int i=0;i<l-k+1;i++)
	        	{
	        		int j = i+k-1;
	        		if(storage[i+1][j-1] && s.charAt(i)==s.charAt(j))
	        		{
	        			storage[i][j] = true;
	        			if(k>maxL)
	        			{
	        				start = i;
	        				maxL = k;
	        				result = s.substring(i, i+k);
	        			}
	        		}
	        	}
	        }
	        return result;
	    }
}
