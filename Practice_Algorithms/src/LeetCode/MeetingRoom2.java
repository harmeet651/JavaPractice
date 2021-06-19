package LeetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoom2{
		int start;
		int end;
		MeetingRoom2()
		{
			start=0; end=0;
		}
		MeetingRoom2(int s, int e)
		{
			start=s;
			end=e;
		}

	public static void main(String[] args) {
		MeetingRoom2 e1 = new MeetingRoom2();
		MeetingRoom2 e2 = new MeetingRoom2();
		MeetingRoom2 e3 = new MeetingRoom2();
		e1.start=0;
		e1.end=30;
		e2.start=5;
		e2.end=10;
		e3.start=15;
		e3.end=20;
		MeetingRoom2 intervals[] = {e1,e2,e3};
		int ans = minMeetingRooms(intervals);
		System.out.println(ans);
	}
	private static int minMeetingRooms(MeetingRoom2[] intervals) {
		if(intervals==null || intervals.length==0) return 0;		
		Arrays.sort(intervals, (a,b)->a.start-b.start);
		PriorityQueue<MeetingRoom2> minHeap = new PriorityQueue<>((a,b) -> a.end - b.end);
		minHeap.add(intervals[0]);
		for(int i=1;i<intervals.length;i++)
		{
			MeetingRoom2 current = intervals[i];
			MeetingRoom2 earliest = minHeap.remove();
			if(current.start>=earliest.end)
			{
				earliest.end=current.end;
			}
			else
			{
				minHeap.add(current);
			}
			minHeap.add(earliest);
		}

		return minHeap.size();
	}

}
