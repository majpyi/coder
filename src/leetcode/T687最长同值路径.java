package leetcode;

import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-22 21:12
 * @Description: https://leetcode.com/problems/longest-univalue-path/solution/
 **/
public class T687最长同值路径 {
	int ans;

	public int longestUnivaluePath(TreeNode root) {
		ans = 0;
		arrowLength(root);
		return ans;
	}

	public int arrowLength(TreeNode node) {
		if (node == null) return 0;
		int left = arrowLength(node.left);
		int right = arrowLength(node.right);
		int arrowLeft = 0, arrowRight = 0;
		if (node.left != null && node.left.val == node.val) {
			arrowLeft += left + 1;
		}
		if (node.right != null && node.right.val == node.val) {
			arrowRight += right + 1;
		}
		ans = Math.max(ans, arrowLeft + arrowRight);
		return Math.max(arrowLeft, arrowRight);
	}
}
