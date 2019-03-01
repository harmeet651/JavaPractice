package amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Point
{
	public int x;
	public int y;
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

public class WarehouseTruck {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list3.add(3);
		list3.add(4);
		list4.add(1);
		list4.add(-1);
		list.add(list2);
		list.add(list3);
		list.add(list4);
		ArrayList<ArrayList<Integer>> ans = findCrates(list, 2);
		for(ArrayList<Integer> i : ans)
		{
			System.out.println(i);
		}
	}
	
	public static int distance(Point a, Point b)
	{
		return (a.x-b.x)+(a.x-b.x)*(a.y+b.y)+(a.y-b.y);
	}
	private static ArrayList<ArrayList<Integer>> findCrates(ArrayList<ArrayList<Integer>> list, int k) {
		Point[] arr = new Point[list.size()];
		for(int i=0;i<list.size();i++)
		{
			arr[i] = new Point(list.get(i).get(0),list.get(i).get(1));
		}
	PriorityQueue<Point> queue = new PriorityQueue<Point>(11,new Comparator<Point>()
			{
				@Override
				public int compare(Point a, Point b)
				{
					return -Integer.compare(distance(a,new Point(0,0)), distance(b,new Point(0,0)));
				}
			});
		for(Point p : arr)
		{
			queue.offer(p);
		}
		while(queue.size()>k)
		{
			queue.poll();
		}
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for(int i=1;i<=k;i++)
		{
			Point x = queue.poll();
			int a = x.x;
			int b = x.y;
			ArrayList<Integer> list1 = new ArrayList<>();
			list1.add(a);
			list1.add(b);
			result.add(list1);
		}
		return result;
	}
}
