package Clutter;

import java.util.*;

public class FindCommonAndJoin {

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<>();
		input.add("Harry is a boy");
		input.add("boy who likes sports");
//		input.add("USC is a school");
//		input.add("school in LA US");
		ArrayList<String> res = new ArrayList<>();
		res = findCommon(input);
		for(int i=0;i<res.size();i++)
		{
			System.out.println(res.get(i));
		}
	}

	private static ArrayList<String> findCommon(ArrayList<String> input) {
		HashMap<String, ArrayList<String>> start = new HashMap<>();
		HashMap<String, ArrayList<String>> end = new HashMap<>();
		ArrayList<String[]> parts = new ArrayList<>();
		for(int i=0;i<input.size();i++)
		{
			ArrayList<String[]> curr = new ArrayList<>();
			curr.add(input.get(i).split(" "));
			parts.add(curr.get(0));
		}

		for(int i=0;i<parts.size();i++)
		{
			for(int j=0;j<parts.get(i).length;j++)
			{
				ArrayList<String> list = new ArrayList<>();
				if(start.containsKey(parts.get(i)[j]))
				{
					String toAppend = "";
					for(int k=0;k<=j;k++)
					{
						toAppend+=parts.get(i)[k]+" ";
					}
					list.add(toAppend);
					start.put(parts.get(i)[j], list);
				}
				else
				{
					list.add("");
					start.put(parts.get(i)[j], list);
				}
			}
		}
		for(int i=0;i<parts.size();i++)
		{
			for(int j=0;j<parts.get(i).length;j++)
			{
				ArrayList<String> list = new ArrayList<>();
				if(end.containsKey(parts.get(i)[j]))
				{
					String toAppend = "";
					for(int k=j;k<=parts.get(i).length-1;k++)
					{
						toAppend+=parts.get(i)[k]+" ";
					}
					list.add(toAppend);
					end.put(parts.get(i)[j], list);
				}
				else
				{
					list.add("");
					end.put(parts.get(i)[j], list);
				}
			}
		}
		ArrayList<String> res = new ArrayList<>();
		for(Map.Entry<String,ArrayList<String>> entry : start.entrySet())
		{
			//if(start.equals(end))
			{
				System.out.println(entry);
			}
		}
		
		System.out.println();
		for(String s : start.keySet()) {
			 
		}
		for(Map.Entry<String,ArrayList<String>> entry : end.entrySet())
		{
			//if(start.equals(end))
			{
				System.out.println(entry);
			}
		}
		return res;
	}
}
