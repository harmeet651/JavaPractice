package practice;


import java.util.Scanner ;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Enter your Roll number") ;
	int rollno = sc.nextInt() ;
	System.out.println("Enter your name") ;
	String name = sc.next();
	System.out.println("Enter your fee") ;
	double fee = sc.nextDouble();
	System.out.println("Roll number = "+rollno+", Name is : "+name+", Fee = "+fee);
	sc.close();
	}

}
