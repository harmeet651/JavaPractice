package dynamicProgramming;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		String s = "asdaassadame";
		String ansDp = findLPS_DP(s);
		System.out.println(ansDp);
		String ans = findLPS(s);
		System.out.println(ans +" final");
	}

	private static String findLPS(String s) {
		int l = s.length();
		int i, j;
		int max = Integer.MIN_VALUE;
		String result = null;
		for(i=0;i<l;i++)
		{
			for(j=i;j<l;j++)
			{
				String sub = s.substring(i,j+1);
				if(isPalindrome(sub) && s.length()>max)
				{
					if(s.substring(i, j+1).length()>max)
					{
						result= sub;
						max = sub.length();
					}
				}
			}
		}
		return result;
	}

	public static boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}
	public static String findLPS_DP(String s)
	{
		int n = s.length();
		boolean storage[][] = new boolean [s.length()+1][s.length()+1];
		int maxLength = 1; 
		String result = null;
		//1 length
        for (int i = 0; i < n; ++i) 
        {
            storage[i][i] = true; 
            result = s.substring(0, 1);
        }
  
        // check for sub-string of length 2. 
        int start = 0; 
        for (int i = 0; i < n - 1; ++i) 
        { 
            if (s.charAt(i) == s.charAt(i + 1)) 
            { 
                storage[i][i + 1] = true; 
                start = i; 
                maxLength = 2; 
                result = s.substring(i, i+2);
            } 
        } 
          
        // Check for lengths greater than 2. k is length 
        // of substring 
        for (int k = 3; k <= n; ++k) 
        {       
                  // Fix the starting index 
            for (int i = 0; i < n - k + 1; ++i)  
            { 
                // Get the ending index of substring from 
                // starting index i and length k 
                int j = i + k - 1; 
  
                // checking for sub-string from ith index to 
                // jth index iff str.charAt(i+1) to  
                // str.charAt(j-1) is a palindrome 
                if (storage[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) 
                { 
                    storage[i][j] = true; 
  
                    if (k > maxLength) 
                    { 
                        start = i; 
                        maxLength = k; 
                        result = s.substring(i, i+k);
                    } 
                } 
            } 
        } 
        return result; // return length of LPS 
	}
}
