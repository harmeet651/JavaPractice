package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;

public class FindMostFreq {

	public static void main(String[] args) {
		String ques = "Hi this is is is is harmeet, I am writing algorithms, algorithms, algorithms hello hello hello.";
		List<String> excludeArr = new ArrayList<>();
		excludeArr.add("is");
		excludeArr.add("the");
		List<String> ans = findMostFreq(ques, excludeArr);
		for(String i :ans)
		{
			System.out.print(i+" ");
		}
	}
	private static List<String> findMostFreq(String ques, List<String> excludeArr) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String a = ques.toLowerCase();
		String[] words = a.split("\\W+");
		int maxVal = Integer.MIN_VALUE;
		HashSet<String> set = new HashSet<>();
		for(String i : excludeArr)
		{
			set.add(i);
		}
		
		for(String i : words) {
			if(!map.containsKey(i) && !set.contains(i))
			{
				map.put(i, 1);
				if(maxVal<map.get(i))
					{
						maxVal = map.get(i);
					}
			}
			else if(!set.contains(i))
			{
				int value = map.get(i);
				map.put(i,value+1);
				if(maxVal<map.get(i))
				{
					maxVal = map.get(i);
				}
			}
		}
		ArrayList<String> res = new ArrayList<>();
		//System.out.println(map);
		int maxx = maxVal;
		for(Entry<String, Integer> loop : map.entrySet())
		{
			if(maxx<=loop.getValue())
			{
				String ans = loop.getKey();
				maxx = loop.getValue();
				res.add(ans);
			}
		}
		return res;
	}

}
