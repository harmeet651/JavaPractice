package codingNinjas;

public class StairCase {

	public static void main(String[] args) {
		int n = 5;
		int dpAns = dp(n);
		System.out.println(dpAns);
		int recAns = rec(n);
		System.out.println(recAns);
	}

	private static int dp(int n) {
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		int[] ans = new int[n+1];
		ans[0] = 1;
		ans[1] = 1;
		ans[2] = 2;
		for(int i=3;i<=n;i++)
		{
			ans[i] = ans[i-1]+ans[i-2]+ans[i-3];
		}
		return ans[n];
	}

	private static int rec(int n) {
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		return rec(n-1)+rec(n-2)+rec(n-3);
	}

}
