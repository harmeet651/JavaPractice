
public class StringAddition {

	public static void main(String[] args) {
		String a = "123";
		String b = "123";
		String ans = add(a,b);
		System.out.println(ans);
	}
	public static String add(String a, String b)
	{
		int l1 = a.length();
		int l2 = b.length();
		if(l1==0) return b;
		if(l2==0) return a;
		int c=0;
		String total = "";
		int len1 = l1-1;
		int len2 = l2-1;
		while(len1>=0 || len2>=0)
		{
			char f = len1>=0 ? a.charAt(len1):0;
			char s = len2>=0 ? b.charAt(len2):0;
			int first, second;
			if(f==0)
			{
				first = 0;
			}
			else first = f-'0';
			if(s==0)
			{
				second = 0;
			}
			else  second = s-'0';
			int sum = c+first+second;
			if(sum>9)
			{
				c=1;
			}
			else
			{
				c=0;
			}
			total = sum%10+total;
			len1--;
			len2--;
		}
		//System.out.println(total);

		return total;
	}
}
