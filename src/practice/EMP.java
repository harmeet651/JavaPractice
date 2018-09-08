package practice;


public class EMP
{
	int id;
	String name;
	EMP(int i, String n)
	{
		id = i;
		name = n;
	
	}
	void display()
	{
		System.out.println(id+""+name);
	}
	public static void main(String args [])
	{
		EMP e1 = new EMP(1," Shekhar");
		EMP e2 = new EMP(1," Bikram");
		e1.display();
		e2.display();
	}

}
