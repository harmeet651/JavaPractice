package HackerRank;

public class StepsValley {

	public static void main(String[] args) {
		String arr="DDUUDDUU";
		int n=8;
		int valley = Valley(n, arr);
		System.out.println(valley);
	}
	
	public static int Valley(int n, String s)
	{
		//n is not used
		int level=0, count =0;
        for(int i=0;i<s.length();i++)
        {
            char currentStep = s.charAt(i);
            if(level==0 && currentStep=='D')
            {
                ++count;
            }
            if(currentStep=='D')
            {
                level=level-1;
            }
            if(currentStep=='U')
            {
                level=level+1;
            }
        }
        return count;
	}
}
