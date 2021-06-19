package codingNinjas;

import java.util.Scanner;

public class NumOfPrimes {

	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		trailingzero(n);
	}

	static void trailingzero(int no) {
		int a = 0, i;
		for (i = 5; no / i >= 1; i = i * 5) {
			a = a + no / i;
		}
		System.out.println(a);
	}

}
