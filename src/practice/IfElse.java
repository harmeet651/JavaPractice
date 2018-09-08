package practice;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = null ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();
		
		if (marks >= 40)
		{
			grade = "Pass";
		}
		else
		{
			grade = "Fail";
		}
		System.out.println("Grade = "+grade);
		sc.close();
	}

}
