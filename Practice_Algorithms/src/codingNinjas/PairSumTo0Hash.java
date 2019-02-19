package codingNinjas;

import java.util.HashMap;
import java.util.Map;

public class PairSumTo0Hash {

	public static void main(String[] args) {
		int arr[]= {2,-3,3};
		PairSumZero(arr);
	}

	private static void PairSumZero(int[] arr) {
		Map<Integer,Integer> pair = new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			int key = new Integer(arr[i]);
			if(pair.containsKey(key))
			{
				int value = pair.get(key);
				pair.put(key, value+1);
			}
			else
			{
				pair.put(key, 1);
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			int key = arr[i];
			if(pair.containsKey(key) && pair.containsKey(-key))
			{
				int noOfTimes = pair.get(key)*pair.get(-key);
				while(noOfTimes>0)
				{
					int min = Math.min(key, -key);
					System.out.println((min)+" "+(-min));
					noOfTimes--;
				}
				pair.put(key, 0);
				pair.put(key, 0);
			}
		}
	}
}
