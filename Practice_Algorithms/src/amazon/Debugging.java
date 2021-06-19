package amazon;

public class Debugging {

	public static void main(String[] args) {
		//int num = countDigits(6);
		//System.out.println(num);
		
		//printPattern(3);
		
		//int arr[] = {1,2,3,1,3,4,1,1,1}; 	
		//int ans = countOcurences(arr,1);
		//System.out.println(ans);
		
		//printEvenOdd(5);
		
		//char a = checkGrade(90);
		//System.out.println(a);
		
//		int arr[] = {10,20,30};
//		int[] ans = reverseArray(arr);
//		for(int a: ans)
//		{
//			System.out.println(a);
//		}
		
//		int arr2[] = {0,1,0,0,1,1,1,0};
//		int[] ans = manchester(arr2);
//		for(int a: ans)
//		{
//			System.out.print(a);
//		}
		
		int arr[] = {10,120,30};
		int[] ans = sortArray(arr);
		for(int a: ans)
		{
			System.out.println(a);
		}
	}

	private static int[] sortArray(int[] arr) {
		int len = arr.length;
		int i, j, temp;
		for(i=0;i<=len-1;i++)
		{
			for(j=i;j<len;j++)
			{
				temp = 0;
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	private static int[] manchester(int[] arr2) {
		int len = arr2.length;
		int res[] = new int[len];
		boolean result;
		res[0] = arr2[0];
		for(int i=1;i<len;i++)
		{
			result = (arr2[i] == arr2[i-1]);
			res[i] = (result ? 0:1);
		}
		return res;
	}

	private static int[] reverseArray(int[] arr) {
		int i, temp, originalLen = arr.length;
		int len = originalLen;
		for(i=0;i<originalLen/2;i++)
		{
			temp = arr[len-1];
			arr[len-1] = arr[i];
			arr[i] = temp;
			len -= 1;
		}
		return arr;
	}

	private static char checkGrade(int marks) {
		if(marks<=60)
			return 'D';
		else
			if((61<=marks) && (marks<=75))
				return 'C';
			else
				if((76<=marks) && (marks<=90))
				 return 'B';
				else
					return 'A';
				
	}

	private static void printEvenOdd(int num) {
		int i, print = 0;
		if(num % 2 == 0)
		{
			print = 0;
			for(i=0;i<num;i++)
			{
				System.out.println(print + " ");
				print+=2;
			}
		}
		else
		{
			print = 1;
			for(i=0;i<num;i++)
			{
				System.out.println(print + " ");
				print+=2;
			}

		}
		
	}

	private static int countOcurences(int[] arr, int value) {
		int i=0, count = 0, len = arr.length;
		while(i<len)
		{
			if(arr[i]==value)
				count+=1;
			i++;
		}
		return count;
	}

	private static void printPattern(int n) {
		int i, j , print = 1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=2*i;j++)
			{
				System.out.print((print));
			}
			System.out.println();
		}
		
	}

	private static int countDigits(int num) {
		int count = 0;
		int num1 = num;
		while(num != 0)
		{
			num = num/10;
			count+=1;
		}
		return num1 % count;
	}

}
