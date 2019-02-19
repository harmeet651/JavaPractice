package practice;


abstract class Car
{
	abstract void color();
	
	public void milage()
	{
		System.out.println("20 KMPL");
	}
}

class Maruti extends Car /* First available concrete class */
{
	public void color()
	{
		System.out.println("Black");
	}
}

class BMW extends Car
{
	public void color()
	{
		System.out.println("Yellow");
	}
}


class Abstraction {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Maruti();
		c1.color();
		c1.milage();
		Car c2 = new BMW();
		c2.color();
		c2.milage();
	}

}