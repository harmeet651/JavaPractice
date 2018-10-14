package codingNinjas;

public class StringToIntRecursion {

	public static void main(String[] args) {
		String a = "1234";
		int ans = stringToInt(a);
		System.out.println(ans);
	}
	public static int stringToInt(String a)
	{
		int l = a.length();
		if(l==0)
		{
			return 0;
		}
		int c=0;
		int x=0;
		c=stringToInt(a.substring(1));
		x=Integer.parseInt(a.substring(0,1));
		int y=x*(int)Math.pow(10, a.length()-1); 
		return y+c;
	}
}
