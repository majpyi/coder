package 手撕;

import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-05-22 16:19
 * @Description: https://www.cnblogs.com/kaituorensheng/p/3555151.html
 **/
public class 二叉树内两个节点的最长距离 {
	private static class Result {
		int maxDistance;
		int maxDepth;

		public Result() {
		}

		public Result(int maxDistance, int maxDepth) {
			this.maxDistance = maxDistance;
			this.maxDepth = maxDepth;
		}
	}

	int getMaxDistance(TreeNode root) {
		return getMaxDistanceResult(root).maxDistance;
	}

	Result getMaxDistanceResult(TreeNode root) {
		if (root == null) {
			Result empty = new Result(0, -1);
			return empty;
		}
		Result lmd = getMaxDistanceResult(root.left);
		Result rmd = getMaxDistanceResult(root.right);
		Result result = new Result();
		result.maxDepth = Math.max(lmd.maxDepth, rmd.maxDepth) + 1;
		result.maxDistance = Math.max(lmd.maxDepth + rmd.maxDepth, Math.max(lmd.maxDistance, rmd.maxDistance));
		return result;
	}
}
