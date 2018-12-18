package dynamicProgramming;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] arr = {1,3,5,4,7};
		System.out.println(findLIS(arr));
	}

	private static int findLIS(int[] arr) {
		int[] storage = new int[arr.length];
		for(int i=0;i<storage.length;i++)
		{
			storage[i] = 1;
		}
		for(int i=1;i<storage.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(arr[j]<arr[i] && storage[i]<storage[j]+1)
				{
					storage[i] = storage[j] +1;
				}
			}
		}
		int max = Integer.MIN_VALUE;
		for(int i=0;i<storage.length;i++)
		{
			if(max<storage[i])
			{
				max = storage[i];
			}
		}
		return max;
	}

}
