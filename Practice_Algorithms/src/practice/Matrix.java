package practice;
import java.util.Scanner;
public class Matrix
{
private int r,c;
  
  public Matrix(int rows, int cols)
{
     r=rows;
     c=cols;
}
public void input(int  A[][])
{
    int i,j;
Scanner in = new Scanner(System.in);
System.out.println("Enter the elements of array");
    for(i=1;i<=r;i++)
      {
           for(j=1;j<=c;j++)
	{  
                      A[i][j]=in.nextInt();
	}
        }
System.out.print(toString(A));
}


public void add(int A[][], int B[][],int C[][])
{ 
   int i,j; 
System.out.println("The Array after addition is :-");
      for(i=1;i<=r;i++)
       { 
              for(j=1;j<=c;j++)
                {
                   C[i][j] = A[i][j] + B[i][j];
                }
        }
System.out.print(toString(C));
}

public void sub(int A[][], int B[][],int C[][])
{ 
   int i,j; 
System.out.println("The Array after subtraction is :-");
      for(i=1;i<=r;i++)
       { 
              for(j=1;j<=c;j++)
                {
                   C[i][j] = A[i][j] - B[i][j];
                }
        }
System.out.print(toString(C));
}

public void transpose(int A[][])
{ 
    int i,j;
    int [][] B = new int [20][20];
System.out.println("The Array after transpose is :-");
   for(i=1;i<=c;i++)
      {
            for(j=1;j<=r;j++)
               {
                   B[j][i] = A[i][j];
               }
           
      }
System.out.print(toString(B));
} 
 
public void multiplication(int A[][],int B[][],int C[][])
{ 
      int i,j,k;
      System.out.println("The matrix after multiplication is:-");
      for(i=1;i<=r;i++)
          { 
              for(j=1;j<=c;j++)
                 { 
                     C[i][j]=0;
                      for(k=1;k<=c;k++)
                         {
                                C[i][j] = C[i][j] + A[i][k]*B[k][j];
                         }
                }
         }
    System.out.print(toString(C));
}


public String toString( int A[][])
{   String res = "";
         for(int i=1;i<=r;i++)
           { 
                 res = res + "[";
                    for(int j=1;j<=c;j++)
                        {
                            res = res+ " " + A[i][j] + " " ;
                         }
                     res = res + "]\n";
           }
return res;
}
}