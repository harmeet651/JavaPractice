package practice;


class Add
{
	public void sum(int a , int b)
	{
		System.out.println("Sum is : "+(a+b));
	}
	public void sum(double a , double b )
	{
		System.out.println("Sum is : "+(a+b));
	}
}
public class Poly {

	
	public static void main(String args[])
	
	{
		
		Add a = new Add();
		a.sum(10,20);
		a.sum(50.2,30.2);
	}
	

}
