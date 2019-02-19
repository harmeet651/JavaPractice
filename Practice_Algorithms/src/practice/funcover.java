package practice;
import java.util.Scanner;
class same
{
   void air()
   {
    System.out.println("hello");
   }
   int air(int a, int b)
   {
	   a=a+b;
	   return a;
   }
   float air(float a ,int b)
   {
	   a=a-b;
	   return a;
   }
}
class funcover
{
	public static void main(String args[])
	{
	Scanner in = new Scanner(System.in);
	System.out.println("enter two integers");
	int i= in.nextInt();
	int j =in.nextInt();
	same s = new same();
	System.out.println(s.air(i,j));
	System.out.println("Enter a float");
	float f=in.nextFloat();
	System.out.println(s.air(f,j));	
	s.air();
}
}