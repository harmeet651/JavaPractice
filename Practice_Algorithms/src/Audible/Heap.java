package Audible;
import java.util.*;
public class Heap {

	public static void main(String[] args) {
		int a[] = {8,18,5,15,18,11,15,9,7,5,1};
		int k = 1;
		int ans[] = kSmallestPairs(a,k);
		int a1 = 0;
		for(int i=0;i<ans.length;i++)
		{
			a1 +=ans[i];
		}
		System.out.println(a1+ " answer");
	}
	public static int[] kSmallestPairs(int[] nums1, int k) 
	{
        PriorityQueue<Integer> que = new PriorityQueue<>(((a,b)->b-a));
        List<Integer> res = new ArrayList<>();
        
        if(nums1.length==0) return new int[0];
        
        int i=0, j=nums1.length-1;
        while(i<nums1.length && i<k && j>=0 && j>k) 
        	{
        		System.out.println(nums1[i]);
        		que.offer(nums1[i]);
        		i++;
        		j--;
        	}
        while(k-- > 0 && !que.isEmpty()){
            int cur = que.poll();
            res.add(cur);

            que.offer(cur);
        }
        int ans[] = new int[res.size()];
        for(int p=0;p<res.size();p++)
        {
        	ans[p]= res.get(p);
        }
        return ans;
    }
}
