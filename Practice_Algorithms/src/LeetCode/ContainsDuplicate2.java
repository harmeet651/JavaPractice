package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
//Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such 
//that nums[i] = nums[j] and the absolute difference between i and j is at most k.
public class ContainsDuplicate2 {

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
