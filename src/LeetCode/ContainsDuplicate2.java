package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class containsDuplicate {

	public static void main(String[] args) {
		int arr[] = {1,2,3,1};
		int k=3;
		boolean ans = findDup(arr, k);
		System.out.println(ans);
	}

	private static boolean findDup(int[] arr, int k) {
		if(arr ==null || arr.length==0 || arr.length==1)
        {
            return false;
        }
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			int dupIndex=0;
			if(map.containsKey(arr[i]))
			{
				int value = map.get(arr[i]);
				System.out.println(value+" prev ki val");
				dupIndex = i;
				System.out.println(dupIndex+" dup ka index");
				if(dupIndex-value<=k)
				{
					return true;
				}
			}
			map.put(arr[i], i);
		}
		return false;
	}

}
