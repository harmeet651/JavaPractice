package codingNinjas;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int no = s.nextInt();
		int sumOdd = 0, sumEven = 0;
		while (no > 0) {
			if (no % 2 == 0) {
				sumEven = sumEven + no % 10;
				no = no / 10;
			}
			if (no % 2 != 0) {
				sumOdd = sumOdd + no % 10;
				no = no / 10;
			}
		}
		System.out.println(sumEven + " " + sumOdd);
	}
}
