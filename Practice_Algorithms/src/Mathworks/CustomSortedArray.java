package Mathworks;

public class CustomSortedArray {

	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		int c = calc(arr);
		System.out.println(c);
	}

	private static int calc(int[] arr) {
		int i=0;
		int j = arr.length-1;
		int c=0;
		while(i<=j)
		{
			if(arr[i]%2!=0 && arr[j]%2==0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				c++;
			}
			if(arr[i]%2==0)
			{
				i++;
			}
			if(arr[j]%2!=0)
			{
				j--;
			}
		}
		return c;
	}

}
