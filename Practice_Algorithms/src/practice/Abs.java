package practice;

abstract class Parent
{
	abstract void abc();
}

class BoyChild extends Parent
{
	public void abc()
	{
		System.out.println("Boy child");
	}
}
class GirlChild extends Parent
{
	public void abc()
	{
		System.out.println("Girl Child");
	}
}
public class Abs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new BoyChild();
		p.abc();
		GirlChild g = new GirlChild();
		g.abc();
		
	}

}
