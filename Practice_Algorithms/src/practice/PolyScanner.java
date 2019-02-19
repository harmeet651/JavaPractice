package practice;
import java.util.Scanner ;

class Multi
{
	public void multiply(int a , int b)
	{
		int c = a*b ;
		System.out.println("After multiplication ans is : "+(c));
	}
	public void multiply(double a , double b)
	{
		double c = a*b ;
		System.out.println("After multiplication ans is : "+(c));
	}
}

public class PolyScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Multi m = new Multi ();
		int h ;
		do
		{
			System.out.println("Enter your choice : ");
			System.out.println("1. Int Multiplication : ");
			System.out.println("2. Double Multiplication : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :System.out.println("Enter the values of the integers a and b resp :");
					int a = sc.nextInt();
					int b = sc.nextInt();
					m.multiply(a,b);
					break ;
					
			case 2 : System.out.println("Enter the values of the Floating point numbers d and e resp :");
					 double d = sc.nextDouble();
					 double e = sc.nextDouble();
					 m.multiply(d,e);
					 break ;
					 
			default : System.out.println("You have entered a wrong choice try again !!");
			}
			System.out.println("Enter 0 for exit and any other number to continue");
			 h = sc.nextInt();
		}
		while (h != 0);
		sc.close();
	}
	

}
