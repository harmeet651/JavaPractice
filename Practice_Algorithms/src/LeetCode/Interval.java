package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	public class Interval {
		      int start;
		      int end;
		      Interval() { start = 0; end = 0; }
		      Interval(int s, int e) { start = s; end = e; }
		      
	public static void main(String[] args) {
		Interval a = new Interval(1,4);
		Interval b = new Interval(3,6);
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		intervals.add(a);
		intervals.add(b);
		List<Interval> ans= merge(intervals);
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(ans.get(i).start+" "+ ans.get(i).end);
		}
	}
	public static List<Interval> merge(List<Interval> intervals) {
		
		// sort start&end
		int n = intervals.size();
		int[] starts = new int[n];
		int[] ends = new int[n];
		for (int i = 0; i < n; i++) {
			starts[i] = intervals.get(i).start;
			ends[i] = intervals.get(i).end;
		}
		Arrays.sort(starts);
		Arrays.sort(ends);
		// loop through
		List<Interval> res = new ArrayList<Interval>();
		for (int i = 0, j = 0; i < n; i++) { // j is start of interval.
			if (i == n - 1 || starts[i + 1] > ends[i]) {
				res.add(new Interval(starts[j], ends[i]));
				j = i + 1;
			}
		}
		return res;
    }
}
