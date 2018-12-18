package LeetCode;

import java.util.HashSet;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		int arr[] = {2,3,1,2,4,3};
		int target = 7;
		int minLen = fingMinSubArrLength(arr, target);
		System.out.println(minLen+" answer");
	}

	private static int fingMinSubArrLength(int[] arr, int s) 
	{
		int sum =0;
		int count = 0;
		int minTemp =Integer.MAX_VALUE;
		int left = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(sum<s)
			{
				count++;
				sum += arr[i];				
			}
			
			while(sum>=s)
			{
				System.out.println(sum+" sum");
				System.out.println(count+" min abi tak");
				sum = sum -arr[left];
				left++;
				if(minTemp>count)
				{
					minTemp = count;
				}		
			}
			count = i-left+1;
		}
		return minTemp;
	}
}
