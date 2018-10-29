package codingNinjas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry; 

//time O(n), space O(n)
public class MaxFreqHashMap {

	public static void main(String[] args) {
		int arr[] = {1,2,1,2,2,2,2,2};
		int ans = MaxfreqOfArr(arr);
		System.out.println(ans);
	}
	public static int MaxfreqOfArr(int arr[])
	{
		Map<Integer, Integer> array = new HashMap<Integer, Integer>();
		int value =0;
		for(int i=0;i<arr.length;i++)
	      {
	        int key = new Integer(arr[i]);
	       // int value;
	        if(array.containsKey(key))
	        {
	        	value = array.get(key);
	        	array.put(key, value+1);
	        }
	        else
	        {
	        	array.put(key, 1);
	        }
	        System.out.println(key+" "+value);
	      }
		
		// find max frequency. 
        int max_count = 0, res = -1; 
        
        for(Entry<Integer,Integer> val : array.entrySet())
        {
        	if(max_count < val.getValue())
        	{
        		res = val.getKey();
        		max_count = val.getValue();
        	}
        }
		return res;
	}
}
