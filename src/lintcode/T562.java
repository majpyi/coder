package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-22 14:36
 * @Description:
 **/
public class T562 {
	public static int backpack(int[] nums, int target) {
		// state dp[m][n]: the number of combinations that first m kinds of items form the target n
		int m = nums.length, n = target;
		int dp[][] = new int[m + 1][n + 1];
		dp[0][0] = 1;
		// dp function
		for (int i = 1; i <= m; i++) {
			for (int j = 0; j <= n; j++) {

				for (int k = 0; k * nums[i - 1] <= j; k++) {
					dp[i][j] += dp[i - 1][j - k * nums[i - 1]];
				}

//				int k = 0;
//				while (k * nums[i - 1] <= j) {
//					dp[i][j] += dp[i - 1][j - k * nums[i - 1]];
//					k++;
//				}

			}
		}
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		// result
		return dp[m][n];
	}

	public static void main(String[] args) {
		System.out.println(backpack(new int[]{2, 5}, 12));
	}

}
