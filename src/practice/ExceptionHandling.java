package practice;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int i = 10 ;
			int j = i/2 ;
			System.out.println(j) ;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero");
		}
		finally 
		{
			System.out.println("Welcome");
		}
}
}