package practice;
import java.util.Scanner;
class floydtri
{
	public static void main(String args[])
{
int n,i,j,c=1;
Scanner dd = new Scanner(System.in);
System.out.println("enter the size");
n = dd.nextInt();
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" "+c);
c++;
}
System.out.println("");
}
}
}