package PocketGems;

import java.util.ArrayList;

public class WholeMinDil {

	public static void main(String[] args) {
		ArrayList<Integer> arrli = new ArrayList<Integer>(); 
		arrli.add(10);
		arrli.add(30);
		arrli.add(50);
		arrli.add(90);
		int ans = findPairs(arrli);
		System.out.println(ans);
	}
	public static int findPairs(ArrayList<Integer> songs)
	{
		int count=0;
		for(int i=0;i<songs.size();i++)
		{
			for(int j=i+1;j<songs.size();j++)
			{
				if((songs.get(i)+songs.get(j))%60==0)
				{
					count ++;
				}
			}
		}
		return count;
	}
}
