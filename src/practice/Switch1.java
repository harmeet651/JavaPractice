package practice;


import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		String name = sc.next();
		switch( name )
		{
			case "poetry" : System.out.println("Case One ");
			break ;
			case "masti" : System.out.println("Case Two");
			break ;
			case "bhandari" : System.out.println("Case Three");
			 break ;
			default : System.out.println("Wrong choice");
			sc.close();
		}
	}

}
