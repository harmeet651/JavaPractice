package codingNinjas;

public class TowerOfHanoiRecursion {

	public static void main(String[] args) {
		int n=4;
		char s='a',d='c',h='b';
		Tower(n,s,d,h);
	}
	public static void Tower(int a, char s, char d, char h)
	{
		if(a==0)
		{
			return;
		}
		Tower(a-1, s,h,d);
		System.out.println("Source "+s+" "+"Dest "+d);
		Tower(a-1, h,d,s);
	}
}
