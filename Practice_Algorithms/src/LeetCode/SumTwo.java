package LeetCode;
import java.util.Arrays;
import java.util.HashMap; 

public class SumTwo {

	public static void main(String[] args) {
		int nums[] = {3,1,2,4};
		int target = 6;
		int indices[]=new int[2];
		indices=twoSum(nums,target);
		System.out.println(indices[0]+" "+indices[1]);
	}
	public static int[] twoSum(int[] nums, int target)
	{
		if(nums==null || nums.length<2)
	        return new int[]{0,0};
	 
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i=0; i<nums.length; i++){
	        if(map.containsKey(nums[i])){
	            return new int[]{map.get(nums[i]), i};
	        }else{
	            map.put(target-nums[i], i);
	        }
	    }
	 
	    return new int[]{0,0};
	}
}
