package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class three_Sum {
	public static void main(String args[])
	{
		int arr[] = {-1,0,2,1,5,-2};
		List<List<Integer>> list = threeSum(arr);
		for(List<Integer> a:list)
		{
			System.out.println(a);
		}
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        Set<List<Integer>> sett = new HashSet<List<Integer>>();
        int target = 0;
        for(int i=0;i<nums.length-2;i++)
        {
            int s = i+1, end = nums.length-1;
            while(s<end)
            {
                int current = nums[i]+nums[s]+nums[end];
                if(current == target)
                {
                    sett.add(Arrays.asList(nums[i],nums[s++],nums[end--]));
                }
                else if(current<target) {s++;}
                else {end--;}            
            }
        }
        return new ArrayList<>(sett);
    }
}
