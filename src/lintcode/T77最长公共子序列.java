package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-21 21:03
 * @Description: https://www.lintcode.com/problem/longest-common-subsequence/description
 **/
public class T77最长公共子序列 {
	public static int longestCommonSubsequence(String A, String B) {
		// write your code here
		int[][] re = new int[A.length() + 1][B.length() + 1];
		for (int i = 1; i < A.length() + 1; i++) {
			for (int j = 1; j < B.length() + 1; j++) {
				if (A.charAt(i - 1) == B.charAt(j - 1)) {
//					re[i][j] = Math.max(re[i-1][j],re[i][j-1])+1;
					re[i][j] = re[i - 1][j - 1] + 1;
				} else {
					re[i][j] = Math.max(re[i - 1][j], re[i][j - 1]);
				}
			}
		}
		for (int i = 1; i < re.length; i++) {
			for (int j = 1; j < re[0].length; j++) {
				System.out.print(re[i][j] + " ");
			}
			System.out.println();
		}
		return re[A.length()][B.length()];
	}

	public static void main(String[] args) {
//		int[] a = {1, 2, 3, 2, 1, 7, 2};
//		int[] b = {3, 2, 1, 4, 7, 1, 1, 2};
//		int[] b = {3, 2, 1, 4, 7};
		String a = "bedaacbade";
		String b = "dccaeedbeb";
		System.out.println(longestCommonSubsequence(a, b));
	}
}
