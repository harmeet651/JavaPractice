package codingNinjas;

import java.util.Scanner;

public class AllPrimes2toN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int j = 2; j <= n; j++) {
			boolean prime = isPrime(j);
			if (prime == true) {
				System.out.println(j);
			}
		}
	}

	static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				flag = false;
		}
		return flag;
	}
}
