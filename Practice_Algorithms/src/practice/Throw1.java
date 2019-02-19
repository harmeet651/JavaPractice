package practice;

public class Throw1 {
	
	public void prog()//can use static keyword here
	{
		int i = 10 , j = i/0 ;
		System.out.println(j);
		throw new ArithmeticException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Throw1 t = new Throw1();// if using static here no need to make an object 
			t.prog();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error");
		}
	}

}
