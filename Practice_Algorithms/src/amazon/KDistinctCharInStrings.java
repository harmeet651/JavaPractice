package amazon;

import java.util.HashSet;

public class KDistinctCharInStrings {

	public static void main(String[] args) {
		String s = "pqpqs";
		 int k = 2;
		int ans = getKDistinctCharInStrings(s, k);
		System.out.println(ans);
	}

	private static int getKDistinctCharInStrings(String s, int k) {
		HashSet<Character> set = new HashSet<Character>();
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			set.clear();
			for(int j=i;j<s.length();j++)
			{
				set.add(s.charAt(j));
				if(set.size()==k)
				{
					count++;
				}
			}
		}
		return count;
	}

}
