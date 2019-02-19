package practice;


public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true ;
		boolean b = false ;
		boolean c = true ;
		boolean d = false ;
		
		System.out.println("a | b = "+(a|b));
		System.out.println("a & b = "+(a&b));
		System.out.println("!a = "+(!a));
		System.out.println("a ^ b = "+(a^b));
		System.out.println("(a | b) & a = "+((a | b) & a));
		System.out.println("a ^ c = "+(a ^ c));
		System.out.println("b ^ d = "+(b ^ d));
	}

}
