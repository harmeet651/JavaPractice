package LeetCode;

public class RotatedSortedArray {

	public static void main(String[] args) {
		int arr[] = {7,8,9,1,2,3,4,5,6};
		System.out.println(findMin(arr));
	}
	public static int findMin(int[] num) {
        int start = 0;
        int end = num.length-1;
        while(start < end)
        {
        	int mid = (start + end) / 2;
            if (mid > 0 && num[mid] < num[mid - 1]) 
            {
                return num[mid];
            }
            if (num[start] <= num[mid] && num[mid] > num[end]) 
            {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return num[start];
    }
}
