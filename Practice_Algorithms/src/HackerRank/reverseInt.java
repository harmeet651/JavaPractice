package HackerRank;

public class reverseInt {

	public static void main(String[] args) {
		int n =101;
		boolean a = rev(n); 
		System.out.println(a);
	}
	public static boolean rev(int x)
	{
		 //System.out.println(x);
		 boolean g=true;
		 int s=0, a =0;
		 int original =x;
		 while(x>0)
		 {
			 a = x%10;
			 if(a==0 && x!=0 && x<0)
			 {
				 g=false;
				 //System.out.println(g);
			 }
			 else
			 {
				 g= true;
				 //System.out.println(g);
			 }
	   	     s = (s*10)+a;
		     x = x/10;
		 }
		 
		 //System.out.println(s);
		if(original==s)
		{
			return g;
		}
		else
			return false;
	}

}
