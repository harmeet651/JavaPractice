package LeetCode;

public class maxArea {

	public static void main(String[] args) {
		int arr[]= {1,1};
		int ans = findMaxArea(arr);
		System.out.println(ans);
	}

	private static int findMaxArea(int[] arr) {
		int left=0;
		int right=arr.length-1;
		int max=0;
		int area=Integer.MIN_VALUE;
		while(left<right)
		{
			int a =Math.min(arr[left], arr[right]);
			System.out.println(a);
			area= Math.min(arr[left], arr[right])*(right-left);
			if(area>max)
			{
				max=area;
			}
			if(arr[left]>arr[right])
			{
				right--;
			}
			else
			{
				left++;
			}
		}
		return max;
	}

}
