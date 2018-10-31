package codingNinjas;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapLongestConsSubseq {

	public static void main(String[] args) {
		int arr[] = {1,12,43,23,2,3,4,5,1,2,3};
		ArrayList<Integer> res = longSubseqHash(arr);
		for(int i=0;i<res.size();i++)
		{
			System.out.println(res.get(i));
		}
	}
	public static ArrayList<Integer> longSubseqHash(int[] arr)
	{
		 Map<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		 ArrayList<Integer> a = new ArrayList<>();
			for(int num: arr)
	        {
	          if(!map.containsKey(num))
	        	  map.put(num,true);
	        }
			
			int max =1;
			int val =arr[0];
			for(int num: arr)
			{
				int count =0;
				int temp = num;
				while(map.containsKey(temp))
				{
					count++;
					temp++;
					if(count>max)
					{
						max = count;
						val = num;
					}
				}
			}
			a.add(val);
			max--;
			for(int i=0;i<max;i++)
			{
				val++;
				a.add(val);
			}
			
		return a;
	}
}
