package codingNinjas;

import java.util.Scanner;

public class UpperLowerAlphabet {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		char m = a.next().charAt(0);
		if (m >= 97 && m <= 123) {
			System.out.println("0");
		} else if (m >= 65 && m <= 96) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}
	}

}
