package practice;
import java.util.Scanner;
class buses
{
	int np,bus;
	int noper()
	{
		if(np>150)
	        bus=4;
		else if((np<=150)&&(np>120))
			bus=3;
		else if((np<=120)&&(np>60))
			bus=2;
		else
			bus=1;
		return bus;
	}
}
class picnic
{
public static void main(String args[])
{
int p;
buses p1 = new buses();
Scanner S = new Scanner(System.in);
System.out.println("enter the no. of persons");
p1.np=S.nextInt();
p=p1.noper();
System.out.println("no of buses="+ p);
}
}