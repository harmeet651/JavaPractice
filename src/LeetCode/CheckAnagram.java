package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {

	public static void main(String[] args) {
		String s = "aacc";
		String t = "ccac";
		boolean a = anagram(s,t);
		System.out.println(a);
	}

	private static boolean anagram(String s, String t) {
		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		if(s.length()!= t.length())
		{
			return false;
		}
		int flag2 =0;
		for(int i=0;i<s.length();i++)
		{
			map1.put(s.charAt(i), i);
		}
		for(int i=0;i<t.length();i++)
		{
			if(map1.containsKey(t.charAt(i)))
			{
				flag2 =0;			
			}
			else
			{
				flag2 = 1;
			}
		}
		if(flag2 !=1)
		{return true;}
		else {return false;}
	}

}
