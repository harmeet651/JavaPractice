package practice;


public class ThisKeyword {

	int id;
	String name;
	ThisKeyword (int id, String name)
	{
		this.id = id;
		this.name = name;
	
	}
	void display()
	{
		System.out.println(id+""+name);
	}
	public static void main(String args [])
	{
		ThisKeyword e1 = new ThisKeyword(1," Shekhar");
		ThisKeyword e2 = new ThisKeyword(1," Bikram");
		e1.display();
		e2.display();
	}
}
