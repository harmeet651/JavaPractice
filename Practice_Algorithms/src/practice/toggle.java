package practice;
import java.util.Scanner;

public class toggle
{
 public static void main(String []args)
 {
  int n;
  Scanner in = new Scanner(System.in);
  System.out.println(" Enter an integer : " );
  n =in.nextInt();
  System.out.println("Enter the bit (1-8) to be toggled :-");
  int bit = in.nextInt();
  int b = 1 << (bit-1) ;
  int xor = n^b;
  System.out.println("After Toggle the value is : " +xor);
 }
}