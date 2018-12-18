package LeetCode;

import java.util.HashSet;

public class StoneJewels {

	public static void main(String[] args) {
		String j = "aA";
		String s = "aaaBBBbbb";
		System.out.println(numJewelsInStones(j,s));
	}
	public static int numJewelsInStones(String J, String S) {
		 int count=0;
	        HashSet<Character> a = new HashSet();
	        for(int i=0;i<J.length();i++)
	        	a.add(J.charAt(i));
	        
	        for(int i=0;i<S.length();i++)
	        	if(a.contains(S.charAt(i)))
	        		count++;
	        return count;
    }
}
