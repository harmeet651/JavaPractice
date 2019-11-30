package Roblox;

public class consecutiveNumbersSum {

	public static void main(String[] args) {
		int ans = consecutiveNumbersSum3(5);
		System.out.println(ans);
	}
	 public static int consecutiveNumbersSum1(int N) {
	        int ans = 0;
	        for (int start = 1; start <= N; ++start) {
	            int target = N, x = start;
	            while (target > 0)
	                target -= x++;
	            if (target == 0) ans++;
	        }
	        return ans;
	    }
	 
	 public static int consecutiveNumbersSum2(int N) {
	        // 2N = k(2x + k + 1)
	        int ans = 0;
	        for (int k = 1; k <= 2*N; ++k)
	            if (2 * N % k == 0) {
	                int y = 2 * N / k - k - 1;
	                if (y % 2 == 0 && y >= 0)
	                    ans++;
	            }
	        return ans;
	    }
	  public static int consecutiveNumbersSum3(int N) {
	        while ((N & 1) == 0) N >>= 1;
	        int ans = 1, d = 3;

	        while (d * d <= N) {
	            int e = 0;
	            while (N % d == 0) {
	                N /= d;
	                e++;
	            }
	            ans *= e + 1;
	            d += 2;
	        }

	        if (N > 1) ans <<= 1;
	        return ans;
	    }
}
