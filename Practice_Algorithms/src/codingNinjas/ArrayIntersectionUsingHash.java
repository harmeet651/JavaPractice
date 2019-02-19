package codingNinjas;

import java.util.HashSet;

public class ArrayIntersectionUsingHash {

	public static void main(String[] args) {
		int arr[] = {1,2,1,2,3};
		int arr2[] = {2,3,4,5,2};
		IntersectionArrayHash(arr,arr2);
	}
	public static void IntersectionArrayHash(int arr[], int arr2[])
	{
		HashSet<Integer> intersect = new HashSet<Integer>(); 
	
		for(int i=0;i<arr.length;i++)
		{
			intersect.add(arr[i]);
		}
		for (int i = 0; i < arr2.length; i++)  
		{
            if (intersect.contains(arr2[i])) 
            {
            	System.out.println(arr2[i]);
            }
		} 
	}
}
