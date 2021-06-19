package twitter;

import java.util.ArrayList;

public class NoPairsAllowed {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("addddaa");
		list.add("bookbb");
		list.add("break");
		ArrayList<Integer> res = arrayCounter(list);
		for(int i=0;i<res.size();i++)
		{
			System.out.println(res.get(i)+" ");
		}
		
	}

	private static ArrayList<Integer> arrayCounter(ArrayList<String> words) 
	{
		ArrayList<Integer> arr = new ArrayList<>();

		for(int i=0;i<words.size();i++)
		{
			int count = 1;
			int l = words.get(i).length();
			if(l<2)
			{
				arr.add(0);
				continue;
			}
			int j=0;
			int operations=0;
			while(j<l-1)
			{
				if(words.get(i).charAt(j)==words.get(i).charAt(j+1))
				{
					count++;
				}
				if(words.get(i).charAt(j)!=words.get(i).charAt(j+1) || j==l-2)
				{
					operations += count/2;
					count =1;
				}
				j++;			
			}			
			arr.add(operations);
		}	
		return arr;
	}

}
