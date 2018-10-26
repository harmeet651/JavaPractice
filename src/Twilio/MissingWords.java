package Twilio;

import java.util.ArrayList;

public class MissingWords {

	public static void main(String[] args) {
		String one = "hi I am harmeet singh";
		String two = "hi I harmeet";
		ArrayList<String> res = funcMW(one, two);
		for(int i=0;i<res.size();i++)
		{
			System.out.println(res.get(i));
		}
	}
	public static ArrayList<String> funcMW(String s, String t)
	{
		String arr[]= s.split(" ");
		String arr2[] = t.split(" ");
		ArrayList<String> ans = new ArrayList<String>();
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			String one = arr[i];
			String two = arr2[j];
			if(!one.equals(two))
			{
				ans.add(one);
			}
			else
			{	
				if(j==arr2.length-1)
				{
					for (int temp = i+1; temp < arr.length; temp++) {
						ans.add(arr[temp]);
					}
					break;
				}
				j+=1;
			}			
		}
		return ans;
	}
}
//String[] sw = s.split(" ");
//String[] tw = t.split(" ");
//
//List<String> mw = new ArrayList<>();
//
//int t_i = 0;
//
//for (int s_i = 0; s_i < sw.length; s_i++) {
//	String s_word = sw[s_i];
//	String t_word = tw[t_i];
//
//	if (!s_word.equals(t_word)) {
//		mw.add(s_word);
//	} else {
//
//		t_i += 1;
//
//		if (t_i == tw.length) {
//			for (int temp = s_i + 1; temp < sw.length; temp++) {
//				mw.add(sw[temp]);
//			}
//			break;
//		}
//	}
//}
//return mw;
