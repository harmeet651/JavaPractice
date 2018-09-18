package codingNinjas;
import java.util.Scanner;

public class Wave2DArray {
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
	   wavePrint(a);
	 }
	 public static void wavePrint(int input[][])
		{
			int i,l,j;
			int k=0;
	     for(i=0;i<input[0].length;i++)
		      {	
	    	 k=0;
	    	 l=input.length-1;    	
			      while(k<input.length)
		            {
		              System.out.print(input[k][i]+" ");
		              k++;
		            }
	    	 i++;
			          while(l>=0)
			          {
			        	  System.out.print(input[l][i]+" ");
			              l--;
			          }
		      }
		}

	}