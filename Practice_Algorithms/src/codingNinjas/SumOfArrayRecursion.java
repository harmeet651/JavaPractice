package codingNinjas;
import java.util.Scanner;

public class SumOfArrayRecursion {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int sumArr=sum(a);
		System.out.println(sumArr);
	}
	public static int sum(int input[]) {
		int l=input.length;
		if (input.length==0)
          return 0;
       
	 if(input.length==1)
	 {
		 return input[l-1];
	 }		
	 
	 int[] smallArr= new int[input.length-1];
	 for(int i=1;i<input.length;i++)
	 {
		 smallArr[i-1]=input[i];	
	 }
	 int a=input[0];
	 a=a+sum(smallArr);
	 return a;
	}
}
