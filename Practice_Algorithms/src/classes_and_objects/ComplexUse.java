package classes_and_objects;

public class ComplexUse {

	public static void main(String[] args) {
		Complex c1 = new Complex(1,2);
		System.out.println("c1 print");
		c1.print();
		c1.setReal(2);
		c1.setImaginary(4);
		System.out.println("c1 set to 2,4");
		c1.print();
		
		Complex c2 = new Complex(1,1);
		c1.add(c2);
		System.out.println("c1 add 1,1");
		c1.print();
		System.out.println("c2 is 1,1");
		c2.print();
		
		Complex c3 = new Complex(-2,2);
		System.out.println("c1 print");
		c1.print();
		c1.multiply(c3);
		System.out.println("c3 print");
		c3.print();
		System.out.println("multiply done c1 by c3 in c1");
		c1.print();
		
		Complex c5 = c1.Conjugate();
		System.out.println("conjugate done in c5 of c1");
		c5.print();
		
		Complex c6 = Complex.add(c1, c3);
		System.out.println("add done in c6, static add");
		c6.print();
		c6.add(c2);
		System.out.println("c6 add c2");
		c6.print();
		
		Complex c7 = c6.Conjugate();
		System.out.println("conjugate done in c7 of c6");
		c7.print();	
	}
}
