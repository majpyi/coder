package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-04-05 11:56
 * @Description: https://leetcode-cn.com/problems/longest-increasing-subsequence/
 **/
public class T300最长上升子序列 {

	public int lengthOfLIS(int[] nums) {
		int[] maxlength = new int[nums.length];
		maxlength[0] = 1;
		int max = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				maxlength[i] = Math.max(maxlength[i - 1], ++max);
			} else {
				maxlength[i] = maxlength[i - 1];
				max = 1;
			}
		}
		return maxlength[nums.length - 1];
	}

	public int lengthOfLIS1(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 0;
		for (int num : nums) {
			int i = Arrays.binarySearch(dp, 0, len, num);
			if (i < 0) {
				i = -(i + 1);
			}
			dp[i] = num;
			if (i == len) {
				len++;
			}
		}
		return len;
	}
}
