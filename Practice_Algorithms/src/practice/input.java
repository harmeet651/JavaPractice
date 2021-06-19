package practice;
import java.util.Scanner;
class input
{
public static void main(String args[])
{
int n;
float f;
Scanner S = new Scanner(System.in);
System.out.println("enter a number");
n=S.nextInt();
System.out.println("u have entered"+n);
System.out.println("enter a decimal no");
f=S.nextFloat();
System.out.println("u have entered"+f);
System.out.println("enter a string");
String str=S.next();
System.out.println("u have entered"+str);
}
}