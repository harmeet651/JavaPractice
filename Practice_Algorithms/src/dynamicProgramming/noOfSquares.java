package dynamicProgramming;

public class noOfSquares {

	public static void main(String[] args) {
		int n=5;
		int ans = findNoOfSquares(n);
		System.out.println(ans);
	}
	public static int findNoOfSquares(int n)
	{
		int storage[] = new int[n+1]; 
		storage[0]=0;
		storage[1]=1;
		storage[2]=2;
		storage[3]=3;
		for(int i=4;i<=n;i++)
		{
			storage[i]=i;
			for(int x=0;x<=i;x++)
			{
				int temp = x*x;
				if(temp>i)
				{
					break;
				}
				else
				{
					storage[i]=Math.min(storage[i], storage[i-temp]+1);
				}
			}
		}
		int res=storage[n];
		return res;
	}
}
