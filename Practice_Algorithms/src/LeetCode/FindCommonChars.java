package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonChars {

	public static void main(String[] args) {
		String[] in= {"abc", "bc", "db"};
		List<String> ans = commonChars(in);
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(ans.get(i));
		}
	}
	public static List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        int arr[] = new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        for(String a: A)
        {
            int cnt[] = new int[26];
            for(int i=0;i<a.length();i++)
            {
                ++cnt[a.charAt(i)-'a'];
            }
            for(int i=0;i<26;i++)
            {
                arr[i] = Math.min(cnt[i], arr[i]);
            }
        }
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<arr[i];j++)
            {
                list.add(String.valueOf((char)(i+'a')));
            }
        }
        return list;
    }
}
