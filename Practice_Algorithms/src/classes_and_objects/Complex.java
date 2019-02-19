package classes_and_objects;

public class Complex {
	
	private int real;
	private int imaginary;
	
	public Complex(int r, int i)
	{
		this.real = r;
		this.imaginary = i;
	}
	
	public void print()
	{
		if(imaginary>0)
			System.out.println(real+"+"+imaginary+"i");
		
		else
			System.out.println(real+""+imaginary+"i");
	}
	
	public int getReal()
	{
		return real;
	}
	
	public int getImaginary()
	{
		return imaginary;
	}
	
	public void setReal(int r)
	{
		this.real=r;
	}
	
	public void setImaginary(int i)
	{
		this.imaginary=i;
	}
	
	public void add(Complex c2)
	{
		this.real = this.real+c2.real;
		this.imaginary =this.imaginary+c2.imaginary;
	}
	
	public void multiply(Complex c2)
	{
		this.real = this.real*c2.real;
		this.imaginary =this.imaginary*c2.imaginary*(-1);
	}
	
	public Complex Conjugate()
	{
		int newReal = this.real *(-1);
		int	newImaginary = this.imaginary *(-1);
		Complex c = new Complex(newReal, newImaginary);
		return c;
	}
	
	public static Complex add(Complex c1, Complex c3)
	{
		int newReal = c1.real+c3.real;
		int newImaginary = c1.imaginary+c3.imaginary;
		Complex c = new Complex(newReal, newImaginary);
		return c;
	}
}
