package googleChallenge;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/**
 * You are given two arrays representing integer locations of stores and houses
 * (each location in this problem is one-dimensional). For each house, find the
 * store closest to it.
 * 
 * Write a function that, given two arrays: 'stores' of length M representing
 * integer locations of the stores; and 'houses' of N representing integer
 * locations of the houses; returns an integer array of size N.
 * 
 * The i-th element of the returned array should denote the location of the
 * store closest to the i-th house. If many stores are equidistant from a
 * particular house, choose the store with the smallest numerical location.
 * 
 * Note that there may be multiple stores and houses at the same location.
 * 
 * Write an efficient algorithm for the following assumptions:
 * 
 * - M and N are integers within the range [1..1,000];
 * 
 * - each element Of arrays stores, houses is an integer within the range
 * [0..1,000,000]
 */
 
public class QuesTwo {

	public static void main(String[] args) {
		int stores[] = {1,5,20,11,16};
		int houses[] = {5,10,17};
		int arr[] = solution(stores, houses);
		if (arr.length > 0) {
			System.out.print("[");
			for (int i = 0; i < arr.length - 1; i++) {
				System.out.print(arr[i] + ", ");
			}
			System.out.print(arr[arr.length - 1]);
			System.out.println("]");
		} else {
			System.out.println("[]");
		}
		
	}
	public static int[] solution(int[] stores, int[] houses) {
	
		int arrayHouseCopy[] = houses.clone();
		int HL=houses.length;
		int SL=stores.length;
		 Arrays.sort(stores);
		 Arrays.sort(houses);
		 Map<Integer,Integer> houseArrayToreturn = new HashMap<>();
		int currentHouse=0, diff=Integer.MAX_VALUE, secondLast=Integer.MAX_VALUE;
		int currentStore=0;
		diff=Math.abs(houses[currentHouse]-stores[currentStore]);
		currentStore++;
		while(currentHouse<HL)
		{
	        secondLast= diff;
	        if(currentStore<SL)
	        {
	        	secondLast = diff;
	        	diff=Math.abs(houses[currentHouse]-stores[currentStore]);
	        	if(secondLast<diff)
				{
	        		houseArrayToreturn.put(houses[currentHouse], stores[currentStore-1]);
					currentHouse++;
					currentStore--;
				}
	        	else 
				{
					currentHouse++;
				}	
	        }
	        else
	        {
	        	houseArrayToreturn.put(houses[currentHouse], stores[currentStore]);
	        	currentHouse++;
	        }
		}
        for(int i=0;i<HL;i++)
        {
        	int h=arrayHouseCopy[i];
        	int s=houseArrayToreturn.get(h);
        	arrayHouseCopy[i]=s;
        }
        return arrayHouseCopy;
    }
}
