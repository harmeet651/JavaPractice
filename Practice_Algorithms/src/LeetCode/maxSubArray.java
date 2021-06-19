package LeetCode;

public class maxSubArray {

	public static void main(String[] args) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int ans = findMaxSubArray(arr);
		System.out.println(ans);
	}
	public static int findMaxSubArray(int[] A)
	{
		 int max = Integer.MIN_VALUE, sum = 0;
		    for (int i = 0; i < A.length; i++) {
		        if (sum < 0) 
		            sum = A[i];
		        else 
		            sum += A[i];
		        if (sum > max)
		            max = sum;
		    }
		    return max;
	}
}
