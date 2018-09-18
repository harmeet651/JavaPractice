package codingNinjas;

import java.util.Scanner;

public class Spriral2DArray {
	 public static void main(String args[])
	 {
	 	Scanner s=new Scanner(System.in);
	 			int i,j;
	 	      int r=s.nextInt();
	 	      int c=s.nextInt();
	 	      int a[][]=new int[r][c];
	 	      for(int k=0;k<a.length;k++)
	 	      {
	 	    	  for(int l=0;l<a[k].length;l++)
	 	    	  {
	 	    		  a[k][l]=s.nextInt();
	 	    	  }
	 	      }
	   spiral(a);
	 }
	 public static void spiral(int[][] matrix)
	 {
		 int row=matrix.length;
	      int col=matrix[0].length;
	      int i,rowstart=0,colstart=0;
	      int noele=row*col,count=0;
	      while(count<noele)
	      {
	        for(i=colstart;count<noele&&i<col;++i)
	        {
	          System.out.print(matrix[rowstart][i]+" ");
	          count++;
	        }
	        rowstart++;
	        for(i=rowstart;count<noele&&i<row;++i)
	        {
	        	System.out.print(matrix[i][col-1]+" ");
	 	          count++;;
	        }
	        col--;
	        for(i=col-1;count<noele&&i>=colstart;--i)
	        {
	        System.out.print(matrix[row-1][i]+" ");
	          count++;
	        }
	        row--;
	       for(i=row-1;count<noele&&i>=rowstart;--i)
	        {
	        	System.out.print(matrix[i][colstart]+" ");
	 	          count++;
	        }
	       colstart++;
	      }
	 }
}
