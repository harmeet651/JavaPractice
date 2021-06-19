package practice;



class ASMDM
{
	int a = 40 , b = 20 ;
	public void addition()
	{
		System.out.println("Value = "+(a+b)) ;
	}
	
	public void substraction()
	{
		System.out.println("Value = "+(a-b)) ;
	}
	
	public void multiplication()
	{
		System.out.println("Value = "+(a*b)) ;
	}
	
	public void division()
	{
		System.out.println("Value = "+(a/b)) ;
	}
	
	public void modulas()
	{	
		int a = 25 , b = 2 ;
		System.out.println("Value = "+(a%b));
	}
}

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ASMDM a1 = new ASMDM();
	
	a1.addition() ;
	a1.substraction() ;
	a1.multiplication() ;
	a1.division();
	a1.modulas() ;
	
	}

}
