package codingNinjas;

public class SubsOfString {

	public static void main(String[] args) {
		String[] ans = bringSubsq("abc");
		for(String a : ans)
		{
			System.out.println(a);
		}
	}

	private static String[] bringSubsq(String s) {
		if(s.length()==0)
		{
			String[] ans = {""};
			return ans;
		}
		int k=0;
		String[] smallAns = bringSubsq(s.substring(1));
		String[] ans = new String[2*smallAns.length];
		for(int i=0;i<smallAns.length;i++)
		{
			ans[k] = smallAns[i];
			k++;
		}
		for(int i=0;i<smallAns.length;i++)
		{
			ans[k] = s.charAt(0)+smallAns[i];
			k++;
		}
		return ans;
	}

}
