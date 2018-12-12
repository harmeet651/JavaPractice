package dynamicProgramming;

public class LCS {

	public static void main(String[] args) {
		String s= "abcdefg";
		String t = "abdcefg";
		int ans = findLCSDP(s,t);
		System.out.println(ans+" dp");
		int ans2 = findLCSM(s,t);
		System.out.println(ans2+" memo");
		int ans3 = findLCS(s,t);
		System.out.println(ans3);
	}
	public static int findLCS(String s, String t)
	{
		if(s.length()==0 || t.length()==0)
		{
			return 0;
		}
		if(s.charAt(0)==t.charAt(0))
		{
			return 1+findLCS(s.substring(1), t.substring(1));
		}
		else
		{
			int op1 = findLCS(s, t.substring(1));
			int op2 = findLCS(s.substring(1), t.substring(1));
			int op3 = findLCS(s.substring(1), t);
			return Math.max(op1, Math.max(op2, op3));
		}
	}
	public static int findLCSM(String s, String t)
	{
		int [][] storage = new int[s.length()+1][t.length()+1];
		for(int i=0;i<s.length()+1;i++)
		{
			for(int j=0;j<t.length()+1;j++)
			{
				storage[i][j]= -1;
			}
		}
		return findLCSM(s,t,storage);
	}
	public static int findLCSM(String s, String t, int[][]storage)
	{
		int m = s.length();
		int n= t.length();
		
		if(storage[m][n]!=-1)
		{
			return storage[m][n];
		}
		
		if(m==0 || n==0)
		{
			storage[m][n]=0;
			return storage[m][n];
		}

		if(s.charAt(0)==t.charAt(0))
		{
			storage[m][n] = 1+findLCSM(s.substring(1), t.substring(1), storage);
		}
		else
		{
			int op1 = findLCSM(s, t.substring(1), storage);
			int op3 = findLCSM(s.substring(1), t, storage);
			storage[m][n]= Math.max(op1,op3);
		}
		return storage[m][n];
	}
	public static int findLCSDP(String s, String t)
	{
		int m = s.length();
		int n= t.length();
		
		int [][] storage = new int[m+1][n+1];

		for(int i=0;i<s.length()+1;i++)
		{
			storage[i][0]= 0;
		}
		for(int j=0;j<t.length()+1;j++)	
		{
			storage[0][j]= 0;
		}

		for(int i=1;i<s.length()+1;i++)
		{
			for(int j=1;j<t.length()+1;j++)
			{
				if(s.charAt(m-i)==t.charAt(n-j))
				{
					storage[i][j]= 1 + storage[i-1][j-1];
				}
				else
				{
					storage[i][j]= Math.max(storage[i][j-1], storage[i-1][j]);
				}
			}
		}
		return storage[m][n];
	}
}
