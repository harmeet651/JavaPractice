package codingNinjas;
import java.util.Scanner;

public class TwoDArrayMAXRowCol {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int array[][] = new int [r][c];
		for(int k=0;k<array.length;k++)
	      {
	    	  for(int l=0;l<array[k].length;l++)
	    	  {
	    		  array[k][l]=s.nextInt();
	    	  }
	      }
		MaxRowCol(array);
	}
	public static void MaxRowCol(int[][] input)
	{
		int i,j;
		int maxr=Integer.MIN_VALUE,indexr=0,indexc=0,maxc=Integer.MIN_VALUE;
		int sum,sum2;
	      for(i=0;i<input.length;i++)
	      {	   	  
	    	  sum=0;
	        for(j=0;j<input[0].length;j++)
	        {	
	           sum += input[i][j];
	        }
	        if(sum>maxr)
	        {  
	      	   maxr=sum;
	      	   indexr=i;         
	        }
	      }
      for(i=0;i<input[0].length;i++)
      {	   	  
    	  sum=0;
        for(j=0;j<input.length;j++)
        {	
           sum += input[j][i];
        }
        if(sum>maxc)
        {
           maxc=sum;
           indexc=i;         
        }
      }
	if(maxr>=maxc)
	{
		System.out.println("row"+" "+indexr+" "+maxr);	
	}
	else
	{
		System.out.println("column"+" "+indexc+" "+maxc);
	}
	}
}
