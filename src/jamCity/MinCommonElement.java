package jamCity;

	import java.util.*;

	/**
	 * Write a function that, given a non-empty array A of N non-negative integers
	 * and a non-empty array B of M non-negative integers, returns the minimal value
	 * that occurs in both arrays.
	 * 
	 * If there is no such value, the function should return -1.
	 * 
	 */
	public class MinCommonElement {

		private static int minCommonElement(int[] A, int[] B) {
			int ans = -1;

			Set<Integer> aSet = new HashSet<>();
			for (int a : A) {
				aSet.add(a);
			}

			for (int b : B) {
				if (aSet.contains(b)) {
					if (ans == -1 || (ans != -1 && b < ans)) {
						ans = b;
					}
				}
			}

			return ans;
		}

		public static void main(String[] args) {
			int[] A = { 1, 3, 2, 1 };
			int[] B = { 4, 2, 5, 3, 2 };
			System.out.println(minCommonElement(A, B)); // Expected 2

			int[] C = { 2, 1 };
			int[] D = { 3, 3 };
			System.out.println(minCommonElement(C, D)); // Expected -1
		}
	}
