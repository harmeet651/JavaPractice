package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class K_Distinct_Substrings {

	public static void main(String[] args) {
		String ques = "abacdd";
		int k = 3;
		List<String> ans = find_K_Distinct_Substrings_Brute(ques, k);
		System.out.println();
		System.out.println();
		
		for(String i : ans)
			{System.out.println(i);}
		
		System.out.println();
		System.out.println();
		
		List<String> ans2 = find_K_Distinct_Substrings(ques, k);
		for(String i : ans2)
			{System.out.println(i);}
	}
	
private static List<String> find_K_Distinct_Substrings(String ques, int k) {
	ArrayList<String> list = new ArrayList<>();
	HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i<ques.length()-k+1;i++)
		{
			for(int j=i;j<i+k;j++)
			{
				set.add(ques.charAt(j));
			}
			if(set.size()==k)
			{
				list.add(ques.substring(i, i+k));
			}
			set.clear();
		}
		return list;
	}

private static List<String> find_K_Distinct_Substrings_Brute(String ques, int k) {
	List<String> ans = new ArrayList<String>();
		for(int i=0;i<ques.length();++i)
		{
			for (int j=i;j<=ques.length();++j)
			{
				int len = getDistinctLength(ques.substring(i,j), k);
				if(len == k)
				{
					ans.add(ques.substring(i,j));
				}
			}
		}
		return ans;
	}

	private static int getDistinctLength(String s, int k) {
		HashSet<Character> a = new HashSet<>();
		if(s.length()==k)
		{
			for(int i=0; i<s.length();i++)
			{
				a.add(s.charAt(i));
			}
		}
	return a.size();
}
}
