package practice;
import java.util.Scanner ;


public class RelationalInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter first number");
		int b = sc.nextInt();
		System.out.println("Enter first number");
		int c = sc.nextInt();
		System.out.println("Relational operator example"); 
		System.out.println("a > b = "+(a>b));
		System.out.println("a < b = "+(a<b));
		System.out.println("b >= a = "+(b>=a));
		System.out.println("b <= a = "+(b<=a));
		System.out.println("b == c = "+(b==c));
		System.out.println("b != c = "+(b!=c));
		sc.close();

	}

}
