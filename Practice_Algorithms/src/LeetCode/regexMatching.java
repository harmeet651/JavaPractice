package LeetCode;

public class regexMatching {

	public static void main(String[] args) {
		String s = "xaabyc";
		String p = "xa*b.c";
		System.out.println(isMatch(s,p));
	}

	private static boolean isMatch(String text, String pattern) {
		boolean T[][] = new boolean[text.length() + 1][pattern.length() + 1];

        T[0][0] = true;
        //Deals with patterns like a* or a*b* or a*b*c*
        for (int i = 1; i < T[0].length; i++) {
            if (pattern.charAt(i-1) == '*') {
                T[0][i] = T[0][i - 2];
            }
        }

        for (int i = 1; i < T.length; i++) {
            for (int j = 1; j < T[0].length; j++) {
                if (pattern.charAt(j - 1) == '.' || pattern.charAt(j-1) == text.charAt(i-1)) {
                    T[i][j] = T[i-1][j-1];
                } else if (pattern.charAt(j-1)== '*')  {
                    T[i][j] = T[i][j - 2];
                    if (pattern.charAt(j-2) == '.' || pattern.charAt(j-2) == text.charAt(i-1)) {
                        T[i][j] = T[i][j] | T[i - 1][j];
                    }
                } else {
                    T[i][j] = false;
                }
            }
        }
        return T[text.length()][pattern.length()];
	}
}
