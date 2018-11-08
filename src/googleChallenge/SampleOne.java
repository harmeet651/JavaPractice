package googleChallenge;

import java.util.ArrayList;
//fix number plate according to a given value
//example 2-4A0r7-4k and value = 4 -> 24A0-R74K, for value equal to 3 -> 24-A0R-74K
public class SampleOne {

	public static void main(String[] args) {
		String a = "2-4A0r7-4k";
		int k=3;
		String ans = func(a, k);
		System.out.println(ans);
	}

	private static String func(String a, int k) {
		String temp = a.replace("-", "");
		StringBuilder ab = new StringBuilder(temp);
		//System.out.println(ab +"ab");
		int l=temp.length();


		while(l-k>0)
		{
			ab.insert(l-k,"-");
			l=l-(k);
		}
		//System.out.println(ab);
		String cap = ab.toString();
		String capBnao=cap.toUpperCase();
		//System.out.println(capBnao);
		return capBnao;
	}

}
