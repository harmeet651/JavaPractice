package codingNinjas;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int i, j, coef = 0;

		System.out.println("1");

		for (i = 0; i < n - 1; i++) {

			for (j = 0; j <= i; j++) {
				if (j == 0)
					coef = 1;
				else
					coef = 2;

				System.out.print(coef);
			}
			System.out.println("1");
		}

	}

}
