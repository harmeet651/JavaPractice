package blackrock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PortfolioBenchmark {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null) {
			String[] inputHalf = line.split(":");
			String portfolio = inputHalf[0];
			;

			Company1 portfolioObj = new Company1(portfolio);

			String benchmark = inputHalf[1];

			Company1 benchmarkObj = new Company1(benchmark);

			for (int f = 0; f < portfolioObj.assetName.size(); f++) {
				double asset1 = portfolioObj.assetShares.get(f);
				double asset2 = benchmarkObj.assetShares.get(f);
				String name1 = portfolioObj.assetName.get(f);
				String name2 = benchmarkObj.assetName.get(f);
				if (asset1 < asset2) {
					double a = asset2 - asset1;
					System.out.println("BUY" + "," + name1 + "," + (int) a);
				} else if (asset1 > asset2) {
					double b = asset1 - asset2;
					System.out.println("SELL" + "," + name2 + "," + (int) b);
				}
			}
		}
	}

	static class Company1 {
		ArrayList<String> assetName;
		ArrayList<Double> assetShares;

		public Company1(String inputFirstHalf) {
			String[] assets = inputFirstHalf.split("\\|");
			assetName = new ArrayList<>();
			assetShares = new ArrayList<>();

			for (int i = 0; i < assets.length; i++) {
				String[] parts = assets[i].split(",");

				String name = parts[0];
				String type = parts[1];
				double shares = Double.parseDouble(parts[2]);
				double prices = Double.parseDouble(parts[3]);
				double accruedInterest = Double.parseDouble(parts[4]);

				assetName.add(name);
				assetShares.add(shares);
			}
			
			for (int i = 0; i < assetName.size() - 1; i++) {
				for (int j = 0; j < assetName.size() - i - 1; j++) {
					String x = assetName.get(j);
					String y = assetName.get(j + 1);
					if (x.compareTo(y) > 0) {
						String temp;
						temp = assetName.get(j);
						assetName.set(j, assetName.get(j + 1));
						assetName.set(j + 1, temp);

						double tempShare = assetShares.get(j);
						assetShares.set(j, assetShares.get(j + 1));
						assetShares.set(j + 1, tempShare);
					}
				}
			}
		}
	}

}