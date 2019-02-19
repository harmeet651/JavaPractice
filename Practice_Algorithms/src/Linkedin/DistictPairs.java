package Linkedin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * In this challenge, you will be given an array of integers and a target value.
 * Determine the number of distinct pairs of elements in the array that sum to
 * the target value.
 * 
 * Two pairs (a, b) and (c, d) are considered to be distinct if and only if the
 * values in sorted order do not match, i.e., (1, 9) and (9, 1) are indistinct
 * but (1, 9) and (9, 2) are distinct.
 * 
 *
 */
public class DistictPairs {

	public static void main(String[] args) {
		long arr[] = {1,4,5,2,7};
		long k=6;
		int distinctPairs = NoOfDistinctPairs(arr,k);
		System.out.println(distinctPairs);
	}
	public static int NoOfDistinctPairs(long arr[], long k)
	{
		Set<List<Long>> pairs = new HashSet<>();
		Set<Long> items = new HashSet<>();
		for(long i : arr)
		{
			long complement = k-i;
			if(items.contains(complement))
			{
				long n1 = Math.min(i, complement);
				long n2 = Math.max(i, complement);
				List<Long> pair = Arrays.asList(n1,n2);
				pairs.add(pair);
			}
			System.out.println(pairs);
			items.add(i);
		}
		return pairs.size();
	}
}
