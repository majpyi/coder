package lintcode;

/**
 * @program: coder
 * @description:
 * @author: Majpyi
 * @create: 2019-06-15 11:33
 **/

public class T125背包问题II {
    public int backPackII(int m, int[] A, int[] V) {
        int[][] dp = new int[A.length + 1][m + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (j >= A[i-1]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - A[i - 1]] + V[i - 1]);
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
