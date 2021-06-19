package twitter;

import java.util.ArrayList;
import java.util.HashMap;

public class FindClosest {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		String s = "aaaa";
		ArrayList<Integer> index = findClosestDuplicate(s,arrList);
		for(int i=0;i<index.size();i++)
		{
			System.out.println(index.get(i)+" index");
		}
		System.out.println();
	}

	private static ArrayList<Integer> findClosestDuplicate(String s, ArrayList<Integer> queryList) 
	{
			HashMap<Character, ArrayList<Integer>> map = new HashMap<>();
			for(int i=0;i<s.length();i++)
			{
				char curr = s.charAt(i);
				ArrayList<Integer> occurrences = map.getOrDefault(curr, new ArrayList<Integer>());
				occurrences.add(i);
				map.put(curr, occurrences);
			}			
			ArrayList<Integer> closestIndices = new ArrayList<>();
			
			for(int i=0;i<queryList.size();i++)
			{
				int curr = queryList.get(i);
				char ch = s.charAt(curr);
				ArrayList<Integer> occurrences = map.get(ch);
				int listOfIndex = binarySearch(occurrences, curr);
				int cnIndex = findIndex(occurrences, listOfIndex);
				closestIndices.add(cnIndex);
			}
			return closestIndices;	
	}

	private static int findIndex(ArrayList<Integer> closestIndices, int current) {
		if (current < 0 || current > closestIndices.size() - 1 || closestIndices.size() <= 1) 
		{
			return -1;
		}
		if (current == 0)
		{
			return closestIndices.get(current + 1);
		}
		if (current == closestIndices.size() - 1) 
		{
			return closestIndices.get(current - 1);
		}
		int closerOne=0;
		if(closestIndices.get(current) - closestIndices.get(current - 1) <= closestIndices.get(current + 1) - closestIndices.get(current))
		{
			closerOne = current -1;
		}
		else
		{
			closerOne = current +1;
		}
		return closestIndices.get(closerOne);
	}

	private static int binarySearch(ArrayList<Integer> occurrences, int curr) 
	{
		int start = 0;
		int end = occurrences.size() - 1;
		while (start <= end) 
		{
			int mid = start + (end - start) / 2;

			if (occurrences.get(mid) == curr) 
			{
				return mid;
			} 
			else if (occurrences.get(mid) < curr) 
			{
				start = mid + 1;
			} 
			else 
			{
				end = mid - 1;
			}
		}
		return -1;
	}
}

