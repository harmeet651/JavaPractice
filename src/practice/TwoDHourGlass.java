package practice;

public class TwoDHourGlass {
//returns max sum of all the hour glasses in a 2D array
//	-9 -9 -9  1 1 1 
//	 0 -9  0  4 3 2
//	-9 -9 -9  1 2 3
//	 0  0  8  6 6 0
//	 0  0  0 -2 0 0
//	 0  0  1  2 4 0
//			returns max of
//	0 4 3
//	  1
//  8 6 6 	which is 28
	
    static int hourglassSum(int[][] arr) {
    	int sum=Integer.MIN_VALUE;
    	int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++)
        {
        	for(int j=0;j<arr[i].length-2;j++)
        	{
        		sum = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        		if(max<sum)
        		{
        			max = sum;
        		}
        	}
        }
        return max;
    }

    public static void main(String[] args)
    {
 
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 6; j++) {
                int arrItem = 2;
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
