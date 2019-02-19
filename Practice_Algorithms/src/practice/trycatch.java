package practice;
class trycatch
{
	public static void main(String args[])
	{
		int a=0,b;
		int ar[]={1,2,3};
		try
		{
			b=42/a;
		try
			{
				ar[3]=6;
				System.out.println(ar[3]);
			}
		
		/*catch(ArithmeticException y)
			{
				System.out.println(y);
			}*/
		
		    catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("out of bound");
			}
		}
					catch(ArithmeticException y)
			{
				System.out.println(y);
			}
	}
}