package practice;
import java.util.Scanner;

public class Matrixtester
{
   public static void main(String [] args)
  {
      Scanner in = new Scanner(System.in);
      System.out.println("This program wants the user to enter square matrices having the same             order for both matrices");
      System.out.println("Enter the number of rows of first matrix");
      int rows = in.nextInt();
      System.out.println("Enter the number of columns of first matrix");
      int cols = in.nextInt();
      System.out.println("Enter the number of rows of second matrix");
      int rows1 = in.nextInt();
      System.out.println("Enter the number of columns of second matrix");
      int cols1 = in.nextInt();
     
      int [][]A = new int [20][20];
      int [][]B= new int [20][20];
      int [][]C= new int [20][20];
      Matrix mat = new Matrix(rows,cols);
      Matrix mat1 = new Matrix(rows1,cols1);
      mat.input (A);
      mat1.input(B);
      mat.add(A,B,C);
      mat.sub(A,B,C);
      mat.transpose(A);
      mat1.transpose(B);
      mat.multiplication(A,B,C);
   }
}

