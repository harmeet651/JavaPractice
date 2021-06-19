package LeetCode;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int arr[] = {1,3,5,42};
		int ele =2;
		int res = funBinarySearch(arr,ele);
		System.out.println(res);
	}
	public static int funBinarySearch(int arr[],int ele)
	{
		int last = arr.length-1;
		int start=0;
		while(start<=last)
		{
			int mid = (start+last)/2;
			if(ele == arr[mid])
			{
				return mid;
			}
			else if(ele> arr[mid])
			{
				start=mid+1;
			}
			else if(ele< arr[mid])
			{
				last=mid-1;
			}
		}
		return start;
	}
}