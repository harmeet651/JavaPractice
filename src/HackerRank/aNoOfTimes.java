package HackerRank;
//count how many times a repeats in string which is reapting for some value n
// example for string "aba" and n= 10, a comes 7 times, abaabaabaa
public class aNoOfTimes{

	public static void main(String[] args) {
		int n=10;
		String s ="aba";
		int func = aNo(n,s);
		System.out.println(func);
	}
	public static int aNo(int n, String s)
	{
		 int withinNchar = n/s.length();
		 int remaining = n%s.length();
		 int aInS=0;
		 int c=0;
		 for(int i=0;i<s.length();i++)
		 {
			 int a = s.charAt(i);
			 if(a=='a')
			 {
				 aInS++;
			 }
		 }
		 for(int i=0;i<remaining;i++)
		 {
			 int a = s.charAt(i);
			 if(a=='a')
			 {
				 c++;
			 }
		 }
		 int totalWithoutRem= aInS*withinNchar+c;
		 return totalWithoutRem;
	}
}
