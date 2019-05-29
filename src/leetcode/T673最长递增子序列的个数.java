package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-05-27 21:10
 * @Description:
 **/
public class T673最长递增子序列的个数 {
	public static int findNumberOfLIS(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		int[] type = new int[nums.length];
		dp[0] = 1;
		type[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			int temp = 0;
			int num = 0;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					temp = Math.max(dp[j], temp);
				}
			}

			dp[i] = temp + 1;
			for (int j = 0; j <= i; j++) {
				if (Math.max(1, dp[i]) == dp[j]) {
					num+=type[j];
				}
			}
			type[i] = num;

		}

		int max = Arrays.stream(dp).max().getAsInt();
//		int re = 0;
//		for (int i = 0; i < type.length; i++) {
//			if (dp[i] == max) {
//				re = +type[i];
//			}
//		}
		System.out.println(Arrays.toString(dp));
		System.out.println(Arrays.toString(type));
		return Arrays.stream(type).max().getAsInt();
	}


	public static void main(String[] args) {
//		System.out.println(findNumberOfLIS(new int[]{2, 2, 2, 2, 2}));
		System.out.println(findNumberOfLIS(new int[]{1, 2, 4, 3, 5, 4, 7, 2}));
//		System.out.println(findNumberOfLIS(new int[]{}));
	}
}
