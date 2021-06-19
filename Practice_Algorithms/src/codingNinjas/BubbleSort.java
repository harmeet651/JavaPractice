package codingNinjas;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
			int n = s.nextInt() ;
			int arr[] = new int[n];
			System.out.println("Enter elements");
			for(int i=0;i<n;i++)
			{
				arr[i] = s.nextInt();
			}
			for(int i=0;i<n;i++)
			{
				BubbleSortFunc(arr);
			}
			PrintArray(arr);
	}
	public static void BubbleSortFunc(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void PrintArray(int[] arr)
	{
		System.out.println("Sorted array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
