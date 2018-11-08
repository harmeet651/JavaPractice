package dynamicProgramming;

public class Fibonacci {

	public static void main(String[] args) {
		int n= 45;	
		System.out.println(fibMemo(n));
		System.out.println(fibDp(n));
		System.out.println(fibRec(n));				
	}

	private static int fibRec(int n) {
		if(n==0 || n==1)
		{
			return n;
		}
		return fibRec(n-1) + fibRec(n-2);
	}
	
	private static int fibMemo(int n) {
		int storage[] = new int[n+1];
		for(int i=0;i<=n;i++)
		{
			storage[i] = -1;
		}
		return fibMemo(n, storage);
	}

	private static int fibMemo(int n, int[] storage) {
		if(n==0 || n==1)
		{
			storage[n] = n;
			return storage[n];
		}
		if(storage[n]!=-1)
		{
			return storage[n];
		}
		storage[n] = fibMemo(n-1, storage)+fibMemo(n-2, storage);
		return storage[n];
	}
	
	private static int fibDp(int n) {
		int storage[] = new int[n+1];
		storage[0] = 0;
		storage[1] = 1;
		for(int i=2;i<=n;i++)
		{
			storage[i] = storage[i-1] + storage[i-2];
		}
		return storage[n];
	}

}
