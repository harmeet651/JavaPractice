package Mathworks;

public class MergeStrings {

	public static void main(String[] args) {
		String one = "acefjhghjwghwbhmcbwd";
		String two = "bdf";
		String ans = merge(one, two);
		System.out.println(ans);
	}

	private static String merge(String one, String two) {
		String ans = "";
		int i=0, j=0;
		while(i<one.length() && j<two.length())
		{
			ans +=one.charAt(i)+""+two.charAt(j);
			i++;
			j++;
		}
		if(i<one.length())
		{
			ans += one.substring(i,one.length());
		}
		if(j<two.length())
		{
			ans += two.substring(j,two.length());
		}
		return ans;
	}

}
