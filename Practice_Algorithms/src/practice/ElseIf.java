package practice;



import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		
		if ( marks >= 90 )
		{
			grade = 'A';
		}
		else if ( marks >= 80 )
		{
			grade = 'B';
		}
		else if ( marks >= 70 )
		{
			grade = 'C';
		}
		else if ( marks >= 60 )
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		System.out.println("Grde = "+grade);
		sc.close();
	}

}
