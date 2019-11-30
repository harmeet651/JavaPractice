package Roblox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFreqInString {

	public static void main(String[] args) {
		String in = "Hello mr what u do, Hello hello";
		List<String> ans = find(in);
		System.out.println(ans);
	}

	private static List<String> find(String in) {
		String[] arr = in.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(String a:arr)
		{
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		List<String> ans = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		for(String a:map.keySet())
		{
			if(map.get(a)>max)
			{
				max=map.get(a);
			}
		}
		for(String a:map.keySet())
		{
			if(map.get(a)==max)
			{
				ans.add(a);
			}
		}
		return ans;
	}

}
