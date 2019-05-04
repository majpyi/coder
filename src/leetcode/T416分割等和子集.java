package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-22 19:59
 * @Description: https://leetcode-cn.com/problems/partition-equal-subset-sum/
 **/
public class T416分割等和子集 {
	// 递归解决，但是会超时
	public boolean canPartition_rec(int[] nums) {
		int sum = 0;
		for (int x : nums) {
			sum += x;
		}
		if ((sum & 1) == 1) {
			return false;
		}
		return dfs(0, nums, 0, sum / 2);
	}

	private boolean dfs(int index, int[] nums, int cur, int target) {
		if (index >= nums.length) {
			return false;
		}
		if (cur == target) {
			return true;
		} else if (cur > target) {
			return false;
		} else {
			return dfs(index + 1, nums, cur + nums[index], target) || dfs(index + 1, nums, cur, target);
		}
	}

	//https://leetcode.com/problems/partition-equal-subset-sum/discuss/90592/01-knapsack-detailed-explanation
	public boolean canPartition_dp(int[] nums) {
		int sum = 0;
		for (int x : nums) {
			sum += x;
		}
		if ((sum & 1) == 1) {
			return false;
		}
		int target = sum / 2;

		boolean[][] dp = new boolean[nums.length + 1][target + 1];
		dp[0][0] = true;
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - nums[i - 1] >= 0) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];   // 在数组的这里已经要注意是否越界
				}
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}
}
