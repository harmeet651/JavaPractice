package LeetCode;

public class ShortestContSubArr {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(findShortestContSubArr(arr));
	}
	public static int findShortestContSubArr(int[] nums)
	{
		int n = nums.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		 boolean flag = false;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] < nums[i - 1])
	                flag = true;
	            if (flag)
	                min = Math.min(min, nums[i]);
	        }
	        flag = false;
	        for (int i = nums.length - 2; i >= 0; i--) {
	            if (nums[i] > nums[i + 1])
	                flag = true;
	            if (flag)
	                max = Math.max(max, nums[i]);
	        }
		int i, j;
		for(i=0;i<n;i++)
		{
			if(min<nums[i])
				break;
		}
		for(j=n-1;j>=0;j--)
		{
			if(max>nums[j])
				break;
		}
		return j-i<0 ? 0 : j-i+1;
	}
}
