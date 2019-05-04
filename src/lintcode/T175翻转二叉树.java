package lintcode;

import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-04-25 17:19
 * @Description:
 **/
public class T175翻转二叉树 {
	public void invertBinaryTree(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertBinaryTree(root.left);
		invertBinaryTree(root.right);
	}
}
