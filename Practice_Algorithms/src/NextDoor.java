import java.util.*;

public class NextDoor {

	public static void main(String[] args) {
		int a[] = {1,4,10};
		int b[] = {7,8};
		int ans = getAP(a,b);
		System.out.println(ans);
	}

	private static int getAP(int[] a, int[] b) {
		int curr = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length-1;i++)
		{
			curr = a[i+1]-a[i];
			if(curr<min)
			{
				min = curr;
			}
		}
		System.out.println("Min "+ min);
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<b.length;i++)
		{
			if(map.containsKey(i))
			{
				int val = map.get(i);
				map.put(b[i], val+1);
			}
			else
			{
				map.put(b[i], 1);
			}
		}
		System.out.println(map);
		int c=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i+1]-a[i]!=min)
			{
				if(map.containsKey(a[i]+min))
				{
					c++;
					System.out.println("add 1");
				}
			}
			else if(a[i+1]-a[i]==min)
			{
				c++;
				System.out.println("add 2");
			}
		}
		int curr2=0;
		int f=0;
		for(int i=0;i<b.length;i++)
		{
			if(map.containsKey(a[a.length-1]+min) && f==0)
			{
				curr2=a[a.length-1]+min;
				System.out.println(curr2);
				c++;
				f=1;
				System.out.println("add 3");
			}
			if(map.containsKey(curr2+min))
			{
				c++;
				System.out.println("add 4");
			}
			curr2+=min;
		}
		return c==0 ? -1:c;
	}

}
