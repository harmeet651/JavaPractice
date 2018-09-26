package codingNinjas;
import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int n = s.nextInt() ;
			int arr[] = new int[n];
			System.out.println("Enter elements");
			for(int i=0;i<n;i++)
			{
				arr[i] = s.nextInt();
			}
			//int arr[]= {12,1,3,4};
			int l=arr.length;
			QuickSort ob = new QuickSort();
			ob.QuickSort2(arr, 0, l-1);		 
	        System.out.println("sorted array");
	        printArray(arr);
	}
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
	public static void QuickSort2(int[] arr, int start, int end)
	{
		if(start<end)
		{
			int pi = partition(arr, start, end);
			QuickSort2(arr, start, pi-1);
			QuickSort2(arr, pi+1, end);
		}		
	}
	public static int partition(int[] arr, int start, int end)
	{
		int pivot = arr[end];
		int low=start-1;
		int j=start;
		while(j<end)
		{
			if(arr[j]<=pivot)
			{
				low++;
				int temp=arr[j];
				arr[j]= arr[low];
				arr[low]=temp;
			}
		}
	
			int temp=arr[low+1];
			arr[low+1]=arr[end];
			arr[end]=temp;

		return low+1;

	}
}
