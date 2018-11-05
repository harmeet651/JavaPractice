package twitter;

import java.util.ArrayList;

public class FindClosest {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(0);
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		String s = "aaaa";
		ArrayList<Integer> index = findClosestDuplicate(s,arrList);
		for(int i=0;i<index.size();i++)
		{
			System.out.println(index.get(i)+" index");
		}
		System.out.println();
	}

private static ArrayList<Integer> findClosestDuplicate(String s, ArrayList<Integer> arrList) {
		
		ArrayList<Integer> matches = new ArrayList<>();
		for(int outer=0;outer<arrList.size();outer++)
		{
			int flag =0;
			int flag2=0;
			int matchUp=Integer.MAX_VALUE;
			int matchDown=Integer.MIN_VALUE;
			int current = arrList.get(outer);
			//System.out.println(current+" this is current");
			for(int i=current+1;i<s.length();i++)
			{
				if(s.charAt(i)==s.charAt(current))
				{
					matchUp = i;
					flag =1;
					//System.out.println(matchUp+" found uppar");
					break;
				}
				else
				{
					matchUp = -1;
				}
	
			}
			for(int i=current-1;i>=0;i--)
			{
				if(s.charAt(i)==s.charAt(current))
				{
					matchDown = i;
					flag2 =1;
					//System.out.println(matchDown+" found neeche");
					break;
				}
				else
				{
					matchDown = -1;
				}
			}
			if(flag ==1 && flag2==0)
			{
				matches.add(matchUp);
			}
			else if(flag2 ==1 && flag==0)
			{
				matches.add(matchDown);
			}
			if(flag ==1 && flag2 ==1)
			{
				matches.add(matchDown);
			}
			if(matchUp==-1 && matchDown==-1)
			{
				matches.add(-1);
			}
		}
		return matches;
	}
}

