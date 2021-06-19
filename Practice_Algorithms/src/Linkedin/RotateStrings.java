package Linkedin;

public class RotateStrings {

	public static void main(String[] args) {
		String s= "abcd";
		int l=2, r=1;
		String res = funcRotateString(s,l,r);
		System.out.println(res+" answer");
	}
	public static String funcRotateString(String s, int l, int r)
	{
		int length=s.length();
		if(r>l)
		{
			r =r-l;
			String firstPart = "";
			String secondPart = "";

				firstPart = s.substring(0,r);
				secondPart = s.substring(r);
				secondPart=secondPart.concat(firstPart);
				//System.out.println(secondPart);

			return secondPart;
		}
		else
		{
			l=l-r;
			String BackPart = "";
			String InitialPart = "";

				BackPart = s.substring(length-l,length);
				InitialPart = s.substring(0,length-l);
				BackPart=BackPart.concat(InitialPart);
				//System.out.println(BackPart);
			
				return BackPart;
		}

	}
}
