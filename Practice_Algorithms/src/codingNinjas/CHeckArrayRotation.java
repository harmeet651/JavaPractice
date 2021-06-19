package codingNinjas;

public class CHeckArrayRotation {

	public static void main(String[] args) {
		int arr[] = {5,6,1,2,3,4};
		int k = checkRotation(arr);
		System.out.println(k);
	}
	public static int checkRotation(int[] arr)
	{
		int j=0;
		int l=arr.length;
		while(j<l-1)
	      {
	        if(arr[j+1]<arr[j])
	        {
	             break;
	        }
	        j++;
	      }
	       if(j==l-1)
	       {
	          return 0;
	       }
	       return j+1;
	}
}
