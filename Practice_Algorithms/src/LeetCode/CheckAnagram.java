package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

	public static void main(String[] args) {
		char[] s = {'a','b','c'};
		char[] t = {'b','c','c'};
		boolean a = anagram(s,t);
		System.out.println(a);
	}

	private static boolean anagram(char[] s, char[] t) {
		int n = s.length;
		int m = t.length;
		
		if(n!=m)
			return false;
		
		Arrays.sort(s);
		Arrays.sort(t);
		
		for(int i=0;i<n;i++)
		{
			if(s[i]!=t[i])
				return false;
		}
		return true;
	}

}
