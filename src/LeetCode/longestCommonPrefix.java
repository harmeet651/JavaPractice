package LeetCode;

import java.util.Arrays;

public class longestCommonPrefix {

	public static void main(String[] args) {
		String array[] = {"abwe", "abc", "abd", "abcs"};
		String ans = findLongestCommonPrefix(array);
		System.out.println(ans);
	}
	public static String findLongestCommonPrefix(String[] array)
	{
		StringBuilder result = new StringBuilder();
		if(array!=null && array.length>0)
		{
			Arrays.sort(array);
			char firstWord[] = array[0].toCharArray();
			char secondWord[] = array[array.length-1].toCharArray();
			for(int i=0;i<firstWord.length;i++)
			{
				if(secondWord.length>i && firstWord[i]==secondWord[i])
				{
					result.append(secondWord[i]);
				}
				else
				{
					break;
				}
			}
		}
		return result.toString();
	}
}
