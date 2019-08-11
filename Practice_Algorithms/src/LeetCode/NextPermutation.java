package LeetCode;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		int nums[] = {5,1,1};
		nextPermutation(nums);
		for(int i = 0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
	}
	public static int[] nextPermutation(int[] nums) {
		if(nums.length==0 ||nums.length == 1)
		{
			return nums;
		}
        int length = nums.length-1;
        int check = 0;
        while(length>0)
        {
            if(nums[length-1]<nums[length])
            {
                length--;
                check =1;
                //System.out.println("found dec at "+length);
                break;
            }
            length--;
        }
        if(length == 0 && check ==0)
        {
        	//System.out.println("no need");
            Arrays.sort(nums);
            return nums;
        }
        int i;
        int min = Integer.MAX_VALUE;
        int smallIndex = 0;
        for(i = length+1;i<nums.length;i++)
        {
//        	System.out.println("nums length pr h "+nums[length]);
//        	System.out.println("min is "+min);
            if(min>nums[i] && nums[i]> nums[length])
            {
                smallIndex = i;
                min = nums[i];
            }
            System.out.println("final min"+min);
        }
        swap(nums,length,smallIndex);
//        System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
//        System.out.println("reverse from"+length+1);
        reverse(nums,length+1);
        return nums;
    }
    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
