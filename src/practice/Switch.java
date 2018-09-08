package practice;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int i = sc.nextInt();
		switch( i )
		{
			case 1 : System.out.println("Case One ");
			break ;
			case 2 : System.out.println("Case Two");
			break ;
			case 3 : System.out.println("Case Three");
			 break ;
			default : System.out.println("Wrong choice");
			sc.close();
		}
	}

}
