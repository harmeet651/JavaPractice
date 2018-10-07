package JamCity;
import java.util.Arrays;
public class ReturnSmallestNotInarray {

	public static void main(String[] args) {
		int arr[]= {1, 3, 6, 4, 1, 2};
		Arrays.sort(arr);
		int a = findSmall(arr);
		System.out.println(a);
	}
	public static int findSmall(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i+1] > arr[i]+1)
			{
				return arr[i]+1;
			}
		}
		return 0;
	}
}
