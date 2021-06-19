package dynamicProgramming;

public class minCostPath {

	public static void main(String[] args) {
		int arr[][] = {{1,1,1}, {4,5,2}, {5,6,7}};
		int ans3 = findMinCostPathDP(arr);
		System.out.println(ans3+" dp");
		
		int ans2 = findMinCostPathM(arr);
		System.out.println(ans2+" memo");
		
		int ans = findMinCostPath(arr);
		System.out.println(ans);
	}
	public static int findMinCostPath(int[][] arr)
	{
		return findMinCostPath(arr, 0, 0);
	}
	private static int findMinCostPath(int[][] arr, int i, int j) 
	{
		int m = arr.length;
		int n= arr[0].length;
		if(i==m-1 && j==n-1)
		{
			return arr[i][j];
		}
		if(i>=m || j>=n)
		{
			return Integer.MAX_VALUE;
		}
		int op1 = findMinCostPath(arr,i,j+1);
		int op2 = findMinCostPath(arr,i+1,j+1);
		int op3 = findMinCostPath(arr,i+1,j);
		
		return arr[i][j]+Math.min(op1, Math.min(op2, op3));
	}
	public static int findMinCostPathM(int[][] arr)
	{
		int m = arr.length;
		int n = arr[0].length;
		int[][]  storage = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				storage[i][j]=-1;
			}
		}
		return findMinCostPathM(arr, 0, 0, storage);
	}
	private static int findMinCostPathM(int[][] arr, int i, int j, int[][] storage) 
	{
		int m = arr.length;
		int n= arr[0].length;
		
		if(i>=m || j>=n)
		{
			return Integer.MAX_VALUE;
		}
		if(i==m-1 && j==n-1)
		{
			storage[m-1][n-1]= arr[i][j];
			return storage[i][j];
		}
		if(storage[i][j]!=-1)
		{
			return storage[i][j];
		}
		int op1 = findMinCostPathM(arr,i,j+1, storage);
		int op2 = findMinCostPathM(arr,i+1,j+1, storage);
		int op3 = findMinCostPathM(arr,i+1,j, storage);
		
		storage[i][j] = arr[i][j]+Math.min(op1, Math.min(op2, op3));
		return storage[i][j];
	}
	private static int findMinCostPathDP(int[][] arr) 
	{
		int m = arr.length;
		int n = arr[0].length;
		int[][]  storage = new int[m][n];
		
		storage[m-1][n-1]= arr[m-1][n-1];
		//for last column
		for(int i=m-2;i>=0;i--)
		{
			storage[i][n-1]=storage[i+1][n-1] + arr[i][n-1];
		}
		//for last row
		for(int j=n-2;j>=0;j--)
		{
			storage[m-1][j]=storage[m-1][j+1] + arr[n-1][j];
		}
		//for all other elements fill right to left
		for(int i=m-2;i>=0;i--)
		{
			for(int j=n-2;j>=0;j--)
			{
				storage[i][j] = arr[i][j]+ Math.min(storage[i][j+1], Math.min(storage[i+1][j+1], storage[i+1][j]));
			}
		}
		return storage[0][0];
	}
}
