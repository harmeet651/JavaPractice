package practice;
import java.util.Scanner ;

public class ArithmeticInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		int i = sc.nextInt();
		System.out.println("Enter second value");
		int j = sc.nextInt();
		System.out.println("Arithmetic Operator\n\n");
		System.out.println("Addition = "+(i+j));
		System.out.println("Subtraction = "+(i-j));
		System.out.println("Multiplication = "+(i*j));
		System.out.println("Division = "+(i/j));
		System.out.println("Modulus = "+(i%j));
		System.out.println("Pre increment = "+(++i));
		sc.close();
	}

}
 