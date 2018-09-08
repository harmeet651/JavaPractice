package practice;
class stuthis
{
	int id;
	String name;
    stuthis(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+""+name);
	}
	public static void main(String args[])
	{
		stuthis s1 = new stuthis(1,"a");
		stuthis s2 = new stuthis(2,"b");
		s1.display();
		s2.display();
	}
}