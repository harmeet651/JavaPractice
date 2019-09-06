package codingNinjas;

public class SubsOfString {

	public static void main(String[] args) {
		String[] ans = bringSubsq("abc");
		for(String a : ans)
		{
			System.out.println(a);
		}
		System.out.println();
		printSubsq("xyz");
		System.out.println();
		String[] perm = permutationOfString("abc");
		for(String a : perm)
		{
			System.out.println(a);
		}
		System.out.println();
		printPerm("abc");
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
	public static void printSubsq(String s)
	{
		printSubsq(s, "");
	}
	
	private static void printSubsq(String s, String output) {
		if(s.length()==0)
		{
			System.out.println(output);
			return;
		}
		//we don't choose letter
		printSubsq(s.substring(1), output);
		//we choose it
		printSubsq(s.substring(1), output+s.charAt(0));
		
	}
	
	public static String[] permutationOfString(String input)
    {
		if(input.length()==0)
		    {
				String ans[]={""};
				return ans;
		    }
			String small[]=permutationOfString(input.substring(1));
			String ans[]=new String[small.length*input.length()];
		int k = 0;
        for(int i=0;i<small.length;i++)
        {
            String current = small[i];
            for(int j=0;j<=current.length();j++)
            {
                ans[k] = current.substring(0,j)+input.charAt(0)+current.substring(j);
                k++;
            }
        }        
        return ans;
    }	
	
	public static void printPermutations(String s, String output)
	{
		if(s.length()==0)
		{
			System.out.println(output);
			return;
		}
		for(int i=0;i<s.length();i++)
		{
			printPermutations(s.substring(0,i)+s.substring(i+1), output+s.charAt(i));
		}
	}
	
	public static void printPerm(String s)
	{
		printPermutations(s, "");
	}

}
