package jamCity;

import java.util.ArrayList;
import java.util.List;

/**
 * An array A consisting of N integers is given. A pair of integers (P, Q), such
 * that O <= P <= Q < N, is called a slice of array A. A slice is described as
 * switching if all values in even positions are equal and all values in odd
 * positions are equal.
 * 
 * Note that a single-element slice is also switching.
 * 
 * Write a function that, given an array A consisting of N integers, returns the
 * size of the largest switching slice in A. If there is no such slice, the
 * function should return 0.
 * 
 * N is an integer within the range [0..100,000] and each element of array A is
 * an integer within the range.
 * 
 * 
 */
public class LargestSwitchingSlice {

	/**
	 * Return a List containing indices to denote groups of equal elements, such
	 * that the group is denoted by (i+1)th group is denoted by [i, i+1) - where i
	 * is a zero-based index.
	 * 
	 * For example, {1, 1, 2, 2, 2, 3, 3} returns [0, 2, 5], since the possible
	 * groups are [0, 2), [2, 5) and [5, 7).
	 */
	private static List<Integer> partition2(int[] arr, boolean even) {
		List<Integer> partitions = new ArrayList<>();

		int n = arr.length;

		int i = 0;
		if (!even)
			i = 1;

		if (n > 0) {
			int groupOf = arr[i];

			for (; i < n; i += 2) {
				int current = arr[i];

				if (current != groupOf) {
					partitions.add(i);
					groupOf = current;
				}
			}

		}

		return partitions;
	}

	private static int largestSwitchingSliceSize(int[] A) {

		int n = A.length;
		if (n <= 2) {
			return n;
		}

		int lss = 2;
		int[] odd = new int[n / 2];
		int[] even = new int[n - n / 2];

		for (int a_i = 0; a_i < n; a_i++) {
			int index = a_i / 2;
			if (a_i % 2 == 0) {
				even[index] = A[a_i];
			} else {
				odd[index] = A[a_i];
			}
		}

		// now, let us list all those positions at which the number isn't repeated
		List<Integer> evenPartitions = partition2(even, true), oddPartitions = partition2(odd, false);
		System.out.println("even partitions = " + evenPartitions);
		System.out.println("odd partitions = " + oddPartitions);

		// combine these partitions
		List<Integer> partitions = new ArrayList<>();

		// Add them in sorted order
		int e_i = 0, o_i = 0;
		while (e_i < evenPartitions.size() && o_i < oddPartitions.size()) {
			int e = evenPartitions.get(e_i);
			int o = oddPartitions.get(o_i);

			if (e < o) {

				if (o - e == 1) {
					partitions.add(o);
					o_i++;
					e_i++;
				} else {
					partitions.add(e);
					e_i++;
				}

			} else {
				if (e - o == 1) {
					partitions.add(e);
					o_i++;
					e_i++;
				} else {

					partitions.add(o);
					o_i++;
				}
			}

			// They should ideally never be equal
		}

		while (e_i < evenPartitions.size()) {
			int e = evenPartitions.get(e_i);
			partitions.add(e);
			e_i++;
		}

		while (o_i < oddPartitions.size()) {
			int o = oddPartitions.get(o_i);
			partitions.add(o);
			o_i++;
		}

		partitions.add(0, 0);
		partitions.add(n - 1);

		System.out.println("combined partitions (switching slices) = " + partitions);

		for (int i = 0; i < partitions.size() - 1; i++) {
			int lengthOfSlice = partitions.get(i + 1) - partitions.get(i);
			if (lengthOfSlice > lss) {
				lss = lengthOfSlice;
			}
		}

		return lss;
	}

	public static void main(String[] args) {
		System.out.println(largestSwitchingSliceSize(new int[] { 5, 4, -3, 4, -3, 5, -3, 5 })); // Expected: 4
	}
}