package leetcode;

import nowcoder.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-04-20 12:11
 * @Description:
 **/
public class T94二叉树的中序遍历 {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		inorder(root, list);
		return list;
	}

//	void inorder(TreeNode root, List<Integer> list) {
//		if (root == null) {
//			return;
//		}
//		inorder(root.left, list);
//		list.add(root.val);
//		inorder(root.right, list);
//	}

	void inorder(TreeNode root, List<Integer> list) {
		Stack<TreeNode> stack = new Stack<>();
		while (root != null || !stack.isEmpty()) {
//			stack.add(root);
			if (root != null) {
				stack.add(root);
				root = root.left;
			} else {
				root = stack.pop();
				list.add(root.val);
				root = root.right;
			}
		}
	}

}
