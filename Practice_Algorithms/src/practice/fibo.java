package practice;
import java.util.Scanner;
class fibo
{
public static void main(String args[])
 {
int a=0,b=1,s=0,n;
Scanner f1 = new Scanner(System.in);
    System.out.println("enter the lenght of the fibonacci series");
	n=f1.nextInt();
	System.out.println(a);
	System.out.println(b);
	while(n>0)
	{
	s=a+b;
	System.out.println(s);
	a=b;
	b=s;
	n--;
	}
 }
}