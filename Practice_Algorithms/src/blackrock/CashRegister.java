package blackrock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;

public class CashRegister {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		double diff;
		String line;
		String error = "ERROR";
		String zero = "ZERO";

		HashMap<Double, String> currencyChange;
		currencyChange = new HashMap<Double, String>();
		currencyChange.put(0.01, new String("PENNY"));
		currencyChange.put(0.05, new String("NICKEL"));
		currencyChange.put(0.10, new String("DIME"));
		currencyChange.put(0.25, new String("QUARTER"));
		currencyChange.put(0.50, new String("HALF DOLLAR"));
		currencyChange.put(1.0, new String("ONE"));
		currencyChange.put(2.0, new String("TWO"));
		currencyChange.put(5.0, new String("FIVE"));
		currencyChange.put(20.0, new String("TWENTY"));
		currencyChange.put(50.0, new String("FIFTY"));
		currencyChange.put(100.0, new String("ONE HUNDRED"));

		double coins[] = { 0.01, 0.05, 0.10, 0.25, 0.50, 1.0, 2.0, 5.0, 20.0, 50.0, 100.0 };
		int m = coins.length;
		while ((line = in.readLine()) != null) {
			String[] inputNumber = line.split(";");
			// System.out.println(inputNumber[0]);
			// System.out.println(inputNumber[1]);
			double[] array = new double[inputNumber.length];

			for (int i = 0; i < inputNumber.length; i++) {
				array[i] = Double.parseDouble(inputNumber[i]);
				if (i == 0) {
					continue;
				}
				diff = array[1] - array[0];
				if (diff < 0) {
					System.out.println(error);
				}
				if (diff == 0) {
					System.out.println(zero);
				} else {
					ArrayList<Double> a = minCoins(coins, m, diff);
					// System.out.println(a);
					for (int u = 0; u < a.size(); u++) {

						if (u > 0) {
							System.out.print(",");
						}
						System.out.print(currencyChange.get(a.get(u)));
					}
				}
			}
		}
	}

	static ArrayList<Double> minCoins(double coins[], int m, double V) {
		ArrayList<Double> list1 = new ArrayList<Double>();
		for (int i = m - 1; i >= 0; i--) {
			while (coins[i] <= V) {
				V = V - coins[i];
				list1.add(coins[i]);
			}
		}
		return list1;
	}
}