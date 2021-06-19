package dynamicProgramming;

public class editDistance {

	public static void main(String[] args) {
		String a = "cart";
		String b = "march";
		int ans = findMinEditDist(a,b);
		System.out.println(ans);
	}
	public static int findMinEditDist(String a, String b)
	{
		int m = a.length();
		int n = b.length();
		int storage[][] = new int[m+1][n+1];
		if(m==0)
		{
			return n;
		}
		if(n==0)
		{
			return m;
		}
		
		for(int i=0;i<m+1;i++)
		{
			storage[i][0]=i;
		}
		for(int i=0;i<n+1;i++)
		{
			storage[0][i]=i;
		}
		for(int i=1;i<m+1;i++)
		{
			for(int j=1;j<n+1;j++)
			{
				if(a.charAt(i-1)==b.charAt(j-1))
				{
					storage[i][j]=storage[i-1][j-1];
				}
				else
				{
					int op1 = 1+ storage[i][j-1];
					int op2 = 1+ storage[i-1][j];
					int op3 = 1+ storage[i-1][j-1];
					storage[i][j]=Math.min(op1, Math.min(op2, op3));
				}
			}
		}
		return storage[m][n];
	}
}
