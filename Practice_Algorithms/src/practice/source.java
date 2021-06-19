package practice;
import java.util.Scanner;
class desti
{
	private int id,nd;
	private String source,destination;
	desti()
	{
		id=1;
		nd=30;
		source="delhi";
		destination="mumbai";
	}
	public void input()
	{
	    Scanner s1= new Scanner(System.in);
	    System.out.println("enter id,no of days,source,destination");
	    id=s1.nextInt();
		nd=s1.nextInt();
	    source=s1.next();
		destination=s1.next();
	}
	public void output()
	{
		System.out.println("id is"+id);
		System.out.println("no of days are"+nd);
		System.out.println("source is"+source);
		System.out.println("destination is"+destination);  
	}
}
class source
{
	public static void main(String args[])
	{
		desti e1 = new desti();
        e1.input();
        e1.output();		
	}
}