package practice;
import java.util.Scanner;

class abc
{  int a;
float b;
   abc()
   {
   System.out.println("in default");
   }
   abc(int x,float y)
   {
	   a=x;
	   b=y;
   }
   void display()
   {
	   System.out.println("first value=" +a );
	   System.out.println("second value=" +b);
   }
}
class cons
{
	public static void main(String args[])
	{
	Scanner in =new Scanner(System.in);
	System.out.println("enter an integer and a float value");
	int i=in.nextInt();
	float f= in.nextFloat();
	abc s = new abc(i,f);
	s.display();
	abc t = new abc();
	t.display();
	}
}