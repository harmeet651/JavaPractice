package dynamicProgramming;

public class Knapsack {

	public static void main(String[] args) {
		int[] val = {7,2,4,5,3};
		int[] weights = {3,5,4,1,2};
		int maxW = 7;
		int ans = find01Kanpsack(val, weights, maxW);
		System.out.println(ans);
	}

	private static int find01Kanpsack(int[] val, int[] weights, int maxW) 
	{
		int m = val.length;
		int storage[][] = new int[m+1][maxW+1];
		for(int i=0;i<m+1;i++)
		{
			storage[i][0] = 0;
		}
		for(int i=0;i<maxW+1;i++)
		{
			storage[0][i] = 0;
		}
		for(int i=1;i<m+1;i++)
		{
			for(int j=1;j<maxW+1;j++)
			{
				if(weights[i-1]<=j)
				{
					storage[i][j] = Math.max(val[i-1]+storage[i-1][j-weights[i-1]], storage[i-1][j]);
				}
				else
				{
					storage[i][j] = storage[i-1][j];
				}
			}
		}
 		return storage[m][maxW];
	}

}
