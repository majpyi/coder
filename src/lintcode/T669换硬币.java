package lintcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-22 10:08
 * @Description:
 **/
public class T669换硬币 {
	public static int coinChange(int[] coins, int amount) {
		// write your code here
		int n = coins.length;
		//dp[i]表示：换取i元的最小硬币数量
		int[] dp = new int[amount + 1];//0-n

		//初始条件
		//	dp[0] = 0;   //初始化dp[0] = 0，因为目标值若为0时，就不需要硬币了。其他值可以初始化是amount+1，为啥呢，因为最小的硬币是1，所以amount最多需要amount个硬币，amount+1
		// 也就相当于当前的最大值了，注意这里不能用整型最大值来初始化，因为在后面的状态转移方程有加1的操作，有可能会溢出，除非你先减个1，这样还不如直接用amount+1舒服呢。


		//状态方程
		for (int i = 1; i < dp.length; i++) {
			dp[i] = amount + 1;
			for (int j = 0; j < n; j++) {
				if (i - coins[j] >= 0 &&   //对应于边界情况，不能出现dp[i-coins[j]]小于0的情况
//					dp[i - coins[j]] != amount+1 &&  //如果它之前子问题没有最优解，则也不更新当前问题
					dp[i - coins[j]] + 1 < dp[i])  //对应于状态方程中min()部分
					dp[i] = dp[i - coins[j]] + 1;
			}
		}

		System.out.println(Arrays.toString(dp));

		if (dp[amount] == amount + 1)
			return -1;
		else
			return dp[amount];


//		for (int i = 1; i < dp.length; i++) {
//			for (int j = 1; j < dp[0].length; j++) {
//				System.out.print(dp[i][j] + " ");
//			}
//			System.out.println();
//		}

	}

	public static void main(String[] args) {
		System.out.println(coinChange(new int[]{5, 2}, 12));
	}
}
