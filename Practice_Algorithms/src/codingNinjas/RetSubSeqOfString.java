package codingNinjas;

public class RetSubSeqOfString {

	public static void main(String[] args) {
		String a = "abc";
		String[] arr = getSubSeq(a);
	}
	public static String[] getSubSeq(String a)
	{
		int l = a.length();
		if(l==0)
		{
			String temp[] = {""};
			return temp;
		}
		String small[] = new String[l-1];
	}
}
