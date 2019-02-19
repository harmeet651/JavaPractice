package practice;
class str
{
	public static void main(String args[])
	{
	String r1="harmeet";
	String r2="gurneet";
	String r3=r2;
	System.out.println("length of string1 is"+r1.length());
    System.out.println("char at index2 in string2 is"+r2.charAt(2));
	if(r2.equals(r3))
	System.out.println("strings are equal");
    else
	System.out.println("not equal");
	}  	
}