package LeetCode;

import java.util.HashMap;
import java.util.TreeSet;
//Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference 
//between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
public class ContainsDuplicate3 {
	public static void main(String[] args) {
		int arr[] = {2,1};
		int k=1, t=1;
		boolean ans = findDup(arr, k, t);
		System.out.println(ans);
	}

	private static boolean findDup(int[] nums, int k, int t) {
//		 if (k < 1 || t < 0) return false;
//	        HashMap<Long, Long> map = new HashMap<>();
//	        for (int i = 0; i < nums.length; i++) {
//	            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
//	            long bucket = remappedNum / ((long) t + 1);
//	            System.out.println(remappedNum+" remap");
//	            System.out.println(bucket+" bucket");
//	            if (map.containsKey(bucket)
//	                    || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= t)
//	                        || (map.containsKey(bucket + 1) && map.get(bucket + 1) - remappedNum <= t))
//	                            return true;
//	            if (map.entrySet().size() >= k) {
//	                long lastBucket = ((long) nums[i - k] - Integer.MIN_VALUE) / ((long) t + 1);
//	                map.remove(lastBucket);
//	            }
//	            map.put(bucket, remappedNum);
//	        }
//	        return false;
		if(k < 1 || t < 0)
			return false;
		
		TreeSet<Long> values = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {
			long num = nums[i];
			Long floor = values.floor(num + t); 
			Long ceil = values.ceiling(num - t);
			if((floor != null && floor >= num)
					|| (ceil != null && ceil <= num))
				return true;
			
			values.add(num);
			if(i >= k)
				values.remove((long)(nums[i - k]));
		}
		return false;
	}
}
