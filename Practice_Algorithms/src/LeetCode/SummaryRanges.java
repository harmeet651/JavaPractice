package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public static void main(String[] args) {
		int[] arr = {1,2,3,5,6,7,9};
		List<String> a1 = findRanges(arr);
		for(int i=0;i<a1.size();i++)
		{
			System.out.print(a1.get(i));
		}
	}

	private static List<String> findRanges(int[] arr) {
		List<String> a = new ArrayList<String>();
		if(arr.length==1)
		{
			a.add(arr[0]+"");
			return a;
		}
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i];
			while(i+1<arr.length && (arr[i+1]-arr[i]==1))
			{
				i++;
			}
			if(temp!=arr[i])
			{
				a.add(temp+"->"+arr[i]);
			}
			else
			{
				a.add(""+arr[i]);
			}
		}
		return a;
	}

}
