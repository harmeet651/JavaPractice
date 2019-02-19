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
			ob.quickSort(arr, 0, l-1);		 
	        System.out.println("sorted array");
	        printArray(arr);
	}
	static int[] quickSort(int[] input,int s,int e)
	{
		if(s>=e)
		{
			int t[]={};
			return t;
		}
		int pivotindex=getpivotelement(input,s,e);
		quickSort(input,s,pivotindex-1);
		quickSort(input,pivotindex+1,e);
		return input;
	}

static int getpivotelement(int []input,int s,int e)
{	
	int pi=s;
	int pe=input[e];
	for(int i=s;i<e;i++)
	{
		if(input[i]<=pe)
		{
			int t=0;
			t=input[i];
			input[i]=input[pi];
			input[pi]=t;
			pi++;
		}
	}
	int a=input[pi];
	input[pi]=input[e];
	input[e]=a;
	e=a;
	return pi;
}
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
