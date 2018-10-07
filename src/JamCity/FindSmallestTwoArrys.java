package JamCity;

import java.util.Arrays;
import java.util.*;

public class FindSmallestTwoArrys {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 5, 6, 3 };
		int arr2[] = { 11, 12, 15, 46, 32 };
		int a = findSmallestOfTwoArray(arr1, arr2);
		System.out.println(a);
	}

	public static int findSmallestOfTwoArray(int[] arr1, int[] arr2) {
		int ans = -1;
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			s.add(arr1[i]);
		}
		for (int i = 0; i < arr2.length; i++) {
			int a2 = arr2[i];
			if (ans == -1 && s.contains(a2)) {
				ans = a2;
			} else if (ans != -1 && a2 < ans && s.contains(a2)) {
				ans = a2;
			}
		}
		return ans;
	}
}
