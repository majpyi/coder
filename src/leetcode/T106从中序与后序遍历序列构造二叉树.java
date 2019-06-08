package leetcode;

import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-08 17:51
 * @Description:
 **/
public class T106从中序与后序遍历序列构造二叉树 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		TreeNode root = reConstructBinaryTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
		return root;
	}

	private TreeNode reConstructBinaryTree(int[] inorder, int startIn, int endIn, int[] postorder, int startPost,
	                                       int endPost) {

		if (startPost > endPost || startIn > endIn) {
			return null;
		}
		TreeNode root = new TreeNode(postorder[endPost]);

		// i - startIn  才是需要前进的距离
		for (int i = startIn; i <= endIn; i++) {
			if (inorder[i] == postorder[endPost]) {
				root.left = reConstructBinaryTree(inorder, startIn, i - 1, postorder, startPost,
					startPost + (i - startIn) - 1);
				root.right = reConstructBinaryTree(inorder, i + 1, endIn, postorder, startPost + (i - startIn),
					endPost - 1);
				break;
			}
		}

		return root;
	}
}
