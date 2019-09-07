package GoldmanSachs;

import java.util.ArrayList;
import java.util.List;

public class AverageQuestion {

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<>();
		input.add(1);
		input.add(1);
		input.add(1);
		input.add(1);
		input.add(1);
		input.add(1);
		input.add(1);
		input.add(1);
		input.add(1);
		input.add(1);
		List<String> ans = calc(input);
		for(String a: ans)
		{
			System.out.println(a);
		}
	}

	private static List<String> calc(ArrayList<Integer> input) {
		int start = 0;
		int end = 6;
		List<String> ans = new ArrayList<>();
		while(end<input.size())
		{
			int c = start;
			double sum = 0;
			while(c<=end)
			{
				sum = sum + input.get(c);
				c++;
			}
			Double a = round(sum/7,2);
			String formatDouble = String.format("%.2f", a );
			ans.add(formatDouble);
			start++;
			end++;
		}
		
		return ans;
	}

	private static Double round(double d, int i) {
		if (i < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, i);
	    d = d * factor;
	    long tmp = Math.round(d);
	    return (double) tmp / factor;
	}

}
