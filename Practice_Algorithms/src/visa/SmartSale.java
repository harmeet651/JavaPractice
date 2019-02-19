package visa;
import java.util.Map.Entry;
import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
/*
Input 1
4
1
1
1
1
2
Output 1
1
Input 2
6
1
1
1
2
2
3
2
Output 2
2
Input 3
6
1
1
1
2
2
3
3
Output 3
1
 */

/**
 * A sales executive needs to simplify an assigned sales task The task is to
 * sell the items given to her in a bag, where each item has an ID number.
 * 
 * It is easier to sell items with the same ID numbers. The sales executive also
 * decides to remove some items from the bag. The largest number of items that
 * she can remove is also known to her.
 * 
 * Find the minimum number of different IDs the final bag can contain after
 * removing the allowed number of items.
 * 
 * For example, she starts with a bag that contains the following n = 4 items:
 * ids = [7, 1, and she can remove m = 2 items.
 * 
 * If she removes 2 of item 1, she will still have items of all three types.
 * 
 * She could remove 2 of item 2, and have ids = {7, 1, 7,31 with 2 discrete item
 * types or remove 7 each of types 2 and 3 leaving ids = [7, Either way, there
 * are 2 item types left.
 * 
 * Function Description:
 * 
 * Complete the function deleteProducts in the editor below. The function must
 * return an integer that denotes the minimum number of different IDs the final
 * bag can contain.
 * 
 * deleteProducts has the following parameters:
 * 
 * ids: an array of n integers that denotes the ID numbers of all items
 * 
 * m: integer that denotes the maximum number of items that can be deleted from
 * the bag.
 */
public class SmartSale {

	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<>();
		items.add(1);
		items.add(1);
		items.add(1);
		items.add(1);
		items.add(2);
		items.add(2);
		items.add(3);
		items.add(3);
		items.add(4);
		items.add(5);
		items.add(6);
		int q=2;
		int minItems = findMinItems(items, q);
		System.out.println(minItems+" min items");
	}

	private static int findMinItems(ArrayList<Integer> items, int toRemove) 
	{
		//get frequency
		Map<Integer, Integer> bag = new HashMap<>();
		int value = 0, key= 0, unique =0;
		for(int i=0;i<items.size();i++)
		{
			key = items.get(i);
			if(bag.containsKey(key))
			{
				value = bag.get(key);
				bag.put(key, value+1);
			}
			else
			{
				bag.put(key, 1);
				unique++;
			}
		}
		System.out.println(unique+" unique");
		// Sort this list by value
		ArrayList<Entry<Integer, Integer>> list = new ArrayList<>(bag.entrySet());
		
		//display list
		for(Entry<Integer,Integer> e :list)
		{
			System.err.println(e.getKey()+" "+e.getValue());
		}
		//sort
		list.sort(new Comparator<Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> arg0, Entry<Integer, Integer> arg1) {
				return arg0.getValue().compareTo(arg1.getValue());
			}
		});
		
		//after sorting
		for(Entry<Integer, Integer> e :list)
		{
			System.err.println(e.getKey()+" "+e.getValue()+" sorted");
		}
		
		//remove elements
		int i=0;
		while(toRemove>0)
		{
			int remove = list.get(i).getValue();
			if(toRemove>=remove)
			{
				unique--;
			}
			toRemove -= remove;
			i++;
		}
		return unique;
	}

}
