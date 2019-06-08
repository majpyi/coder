package lintcode;

import nowcoder.剑指offer.TreeNode;

import java.util.ArrayList;

/**
 * @Author: Mr.M
 * @Date: 2019-06-08 17:30
 * @Description:
 **/
public class T448二叉查找树的中序后继 {
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
		// write your code here
		ArrayList<TreeNode> arraylist = new ArrayList<>();
		dfs(root, arraylist);
		for (int i = 0; i < arraylist.size() - 1; i++) {
			if (arraylist.get(i) == p) {
				return arraylist.get(i + 1);
			}
		}
		return null;
	}

	public void dfs(TreeNode root, ArrayList<TreeNode> arraylist) {
		if (root == null) {
			return;
		}
		dfs(root.left, arraylist);
		arraylist.add(root);
		dfs(root.right, arraylist);
	}


	public TreeNode inorderSuccessor1(TreeNode root, TreeNode p) {
		TreeNode successor = null;
		while (root != null && root.val != p.val) {
			if (root.val > p.val) {
				successor = root;
				root = root.left;
			} else {
				root = root.right;
			}
		}

		if (root == null) {
			return null;
		}

		if (root.right == null) {
			return successor;
		}

		root = root.right;
		while (root.left != null) {
			root = root.left;
		}

		return root;
	}


	public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
		if (root == null || p == null) {
			return null;
		}

		if (root.val <= p.val) {
			return inorderSuccessor(root.right, p);
		} else {
			TreeNode left = inorderSuccessor(root.left, p);
			return (left != null) ? left : root;
		}
	}


}
