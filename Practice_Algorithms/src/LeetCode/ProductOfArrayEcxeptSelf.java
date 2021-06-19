package LeetCode;

public class ProductOfArrayEcxeptSelf {
	public static void main(String args[])
	{
		int[] nums = {1,2,3,4};
		int[] ans = new int[4];
		ans = productExceptSelf(nums);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
	public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        ans[0] = 1;
        for(int i=1;i<l;i++)
        {
            ans[i] = nums[i-1]*ans[i-1];
        }
        int r=1;
        for(int i=l-1;i>=0;i--)
        {
            ans[i] = ans[i]*r;
            r=r*nums[i];
        }
        return ans;
    }
}
