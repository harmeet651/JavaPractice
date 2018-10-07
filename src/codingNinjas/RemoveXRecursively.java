package codingNinjas;

public class RemoveXRecursively {

	public static void main(String[] args) {
		String a = "axbc";
		String ans = removeX(a);
		System.out.println(ans);
	}
	public static String removeX(String a)
	{
		int l = a.length();
		String s = "";
		if(l==0)
		{
			return s;
		}
		else if(a.charAt(0)=='x')
		{
			return s+removeX(a.substring(1, l));
		}
		return a.charAt(0)+removeX(a.substring(1,l));
	}
}
