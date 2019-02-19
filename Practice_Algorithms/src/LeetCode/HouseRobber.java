package LeetCode;

public class HouseRobber {

	public static void main(String[] args) {
		int arr[] = {2,7,9,3,1};
		int max = findMaxLoot(arr);
		System.out.println("answer "+max);
	}

	private static int findMaxLoot(int[] arr) {
		
		return findMaxLoot(arr, arr.length-1);
	}
	
	private static int findMaxLoot(int[] arr, int i)
	{
		int max=0;
		if(i<0)
		{
			return 0;
		}
			int currentVal = arr[i];
			max = Math.max(findMaxLoot(arr,i-2)+currentVal, findMaxLoot(arr, i-1));
			System.out.print(max+" ");
		return max;
	}

}
