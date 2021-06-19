package visa;

import java.util.ArrayList;

public class FindTheWinner {

	public static void main(String[] args) {
		ArrayList<Integer> andy = new ArrayList<>();
		ArrayList<Integer> mary = new ArrayList<>();
		andy.add(13);
		andy.add(5);
		andy.add(6);
		mary.add(4);
		mary.add(5);
		mary.add(7);
		String s = "EVEN";
		String ans = findWinner(andy, mary, s);
		System.out.println(ans);
	}

	private static String findWinner(ArrayList<Integer> andy, ArrayList<Integer> mary, String s) 
	{
		//MARY SCORE IS ADDITIVE INVERSE
		int andyCount = 0;
		int i = 0;
		int sum1 = 0;
		while(i<andy.size())
		{
			if(s=="EVEN")
			{
				if(i%2==0)
				{
					andyCount = andy.get(i);
			
					andyCount += -mary.get(i);
					
					sum1 = sum1 + andyCount;
				}
			}
			if(s=="ODD")
			{
				if(i%2==1)
				{
					andyCount = andy.get(i);
			
					andyCount += -mary.get(i);
					
					sum1 = sum1 + andyCount;
				}
			}
			i++;
		}
		if(sum1 > 0)
		{
			return "ANDY";
		}
		else if(sum1 < 0)
		{
			return "MARY";
		}
		else
		{
			return "TIE";
		}
	}

}
