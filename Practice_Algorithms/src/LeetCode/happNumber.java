package LeetCode;

import java.util.HashSet;

/*Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in 
a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers. */

public class happNumber {

	public static void main(String[] args) {
		int n =19;
		boolean res = happyNo(n);
		System.out.println(res);
	}

	private static boolean happyNo(int n) 
	{
		HashSet<Integer> set = new HashSet<>();
		int sum=0;
		while(set.add(n))
		{
			while(n>0)
	            {
	                int lastDigit = n%10;
	                int square = lastDigit * lastDigit;
	                sum += square;
	                n = n/10;
	            }
	            if(sum == 1)
	            {
	                return true;
	            }
	            else
	            {
	            	n = sum;
	            	sum =0;
	            }
		}
		return false;
		
	}

}
