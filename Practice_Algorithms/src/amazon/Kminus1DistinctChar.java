package amazon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Kminus1DistinctChar {
	public static void main(String[] args) {
		String ques = "abacdd";
		int k = 3;
		
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
				if(set.size()==k-1)
				{
					list.add(ques.substring(i, i+k));
				}
				set.clear();
			}
			return list;
		}
}
