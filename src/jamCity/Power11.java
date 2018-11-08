package jamCity;

public class Power11 {
	public static void main(String[] args) {
		int n=3;
		int ans=solution(n);
		System.out.println(ans);
	}
	public static int solution(int N) {
		String ans = getPowerInString(N);
		System.out.println(ans);
		int len = ans.length();
		int count = 0;
		for(int i = 0; i < len; i++) {
			if(ans.charAt(i) == '1')
				count++;
		}
		return count;
	}
	
	public static String getPowerInString(int N) {
		if(N == 0)
			return "1";
		String num = "11";
		String ten = "";
		int carry = 0;
		int res = 0;
		String newnum = "";
		while(N > 1) {
			 N = N -1;
			 ten = num + "0";
			 num = "0" + num;
			 
			 newnum = "";
			 carry = 0;
			 int len = ten.length();
			 for(int i = len -1; i >= 0; i--) {
				 res = (ten.charAt(i) - 48) + (num.charAt(i) - 48) + carry;
				 carry = res / 10;
				 res = res % 10;
				 newnum = String.valueOf(res) + newnum;
			 }
			 if(carry == 1)
				 newnum = "1" + newnum;
			 
			 System.out.println(newnum);
			 num = newnum;
		}
		return num;
	}
}
