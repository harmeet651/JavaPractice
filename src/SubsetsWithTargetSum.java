import java.util.*;
public class SubsetsWithTargetSum{

    static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String []args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int sum = 5;
        getSubSums(arr, n, new ArrayList<>(), sum);
        for(int i=0;i<ans.size();i++) {
            System.out.println(ans.get(i));
        }
    }

    public static void getSubSums(int[] arr, int n, List<Integer> curr, int sum) {
        if(sum == 0) {
            ans.add(curr);
            return;
        }

        if(n==0) return;

        getSubSums(arr, n-1, curr, sum);
        List<Integer> currNew = new ArrayList<>(curr);
        currNew.add(arr[n-1]);
        getSubSums(arr, n-1, currNew, sum-arr[n-1]);

    }


}
