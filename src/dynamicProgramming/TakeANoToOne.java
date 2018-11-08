package dynamicProgramming;

public class TakeANoToOne {

	public static void main(String[] args) {
		int n= 1000;	
		System.out.println(toOneMemo(n));
		System.out.println(toOneDp(n));
		System.out.println(toOneRec(n));	
	}

	private static int toOneRec(int n) {
		if(n==1)
		{
			return 0;
		}
		int opt = toOneRec(n-1);
		int minSteps = opt;
		if(n % 3 == 0)
		{
			int opt2 = toOneRec(n/3);
			if(minSteps>opt2)
			{
				minSteps = opt2;
			}		
		}
		if(n % 2 == 0)
		{
			int opt3 = toOneRec(n/2);
			if(minSteps>opt3)
			{
				minSteps = opt3;
			}		
		}
		return 1+ minSteps;
	}
	
	private static int toOneMemo(int n) {
		int storage[] = new int[n+1];
		return toOneMemo(n,storage);
	}

	private static int toOneMemo(int n, int[] storage) {
		if(n==1)
		{
			storage[n] = 0;
			return storage[n];
		}
		if(storage[n]!=0)
		{
			return storage[n];
		}
		int opt = toOneMemo(n-1, storage);
		int minSteps = opt;
		if(n % 3 == 0)  
		{
			int opt2 = toOneMemo(n/3, storage);
			if(minSteps>opt2)
			{
				minSteps = opt2;
			}		
		}
		if(n % 2 == 0)
		{
			int opt3 = toOneMemo(n/2, storage);
			if(minSteps>opt3)
			{
				minSteps = opt3;
			}		
		}
		storage[n] = 1 + minSteps;
		return storage[n];
	}

	private static int toOneDp(int n) {
		int storage[] = new int[n+1];
		storage[0] = 0;
		for(int i=2;i<=n;i++)
		{
			int min = storage[i-1];
			if(i%3==0)
			{
				int opt2 = storage[i/3];
				if(min>opt2)
				{
					min = opt2;
				}
			}
			if(i%2==0)
			{
				int opt3 = storage[i/2];
				if(min>opt3)
				{
					min = opt3;
				}
			}
			storage[i] = 1+min;
		}
		
		return storage[n];
	}
}
