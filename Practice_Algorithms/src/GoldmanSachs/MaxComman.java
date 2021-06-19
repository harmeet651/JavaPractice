package GoldmanSachs;

public class MaxComman {

	public static void main(String[] args) {
		int ans = lao("zzzxxxzzz");
		System.out.println(ans);
	}

	private static int lao(String s) {
		int[] left = new int[26];
		int[] right = new int[26];
		int maxCom = 0;
		
		for(int j=0;j<s.length();j++)
		{
			int index = s.charAt(j)-'a';
			right[index]+=1;
		}
		for(int i=0;i<s.length();i++)
		{
			int index = s.charAt(i)-'a';
			left[index]+=1;
			right[index]-=1;
			maxCom = Math.max(compare(left, right), maxCom);
		}
		return maxCom;
	}

	private static int compare(int[] left, int[] right) {
		int com = 0;
		for(int i=0;i<left.length;i++)
		{
			com+=Math.min(left[i], right[i]);
		}
		return com;
	}

}
