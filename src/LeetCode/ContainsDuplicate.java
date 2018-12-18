package LeetCode;

import java.util.HashSet;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int arr[] = {2,1,1};
		boolean ans = findDup(arr);
		System.out.println(ans);
	}
	 public static boolean findDup(int[] nums) {

	       HashSet<Integer> set = new HashSet<>(nums.length);
	        if(nums.length==0 || nums.length==1)
	        {
	            return false;
	        }
	        for(int i=0;i<nums.length;i++)
	        {
	            if(set.contains(nums[i]))
	            {
	                return true;
	            }
	            set.add(nums[i]);            
	        }
	        return false;
	    }
}
