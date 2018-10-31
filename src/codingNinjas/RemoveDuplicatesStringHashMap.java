package codingNinjas;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesStringHashMap {

	public static void main(String[] args) {
		String inp = "abcdabc";
		String res = removeDupUsingHash(inp);
		System.out.println(res);
	}
	public static String removeDupUsingHash(String inp)
	{
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		String res ="";
		for(int i=0;i<inp.length();i++)
		{
			char key = inp.charAt(i);
			if(!map.containsKey(key))
			{
				map.put(key, 1);
				res+=key;
			}
		}
		return res;
	}
}
