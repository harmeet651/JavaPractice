package practice;

interface Interface {
	
	public void name();
}

class Test2 implements Interface
{
		public void name()
		{
			System.out.println("Arsheep");
		}
}
class Test1 implements Interface
{
		public void name()
		{
			
			System.out.println("Bikram");
		}
		public static void main(String args[])
		{
			Interface i = new Test2();
			i.name();
			
			Interface i1 = new Test1();
			i1.name();
		}
}

// Two or more unrelated classes become related by implementing same interface without evoking class relationship
//drawback :- cannot write non abstrct method in dis ... can not define any thing ..can only declare 
// classes are taken like contract which implements the methods declare in interface
 