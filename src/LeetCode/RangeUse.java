package LeetCode;

public class RangeUse {

	public static void main(String[] args) {
		int nums[] = {-1,2,2,2,2,1,2,3,4};
		RangeSumQuery obj = new RangeSumQuery(nums);
		 int param_1 = obj.sumRange(1,3);
		 System.out.println(param_1);
	}
}
