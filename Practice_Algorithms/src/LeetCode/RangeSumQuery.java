package LeetCode;

import javax.print.attribute.HashAttributeSet;

import javafx.util.converter.NumberStringConverter;

public class RangeSumQuery {
	
	int nums[];
	public RangeSumQuery(int[] nums) 
	{
		if(nums.length==0)
        {
            return;
        }
		this.nums = nums; 
        int sum=0;
        for(int i=1;i<nums.length;i++)
        {
            sum = sum +nums[i];
            nums[i] = sum;
        }
    }
    
    public int sumRange(int i, int j) 
    {
    	if(i==0)
    	{
    		return nums[j];
    	}
    	int sum = nums[j] - nums[i-1];
        return sum;   
    }
}

