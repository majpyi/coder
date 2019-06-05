package leetcode;

import 集合.TreeNode;

import java.util.ArrayList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 19:29
 * @Description: https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 **/
public class T236二叉树的最近公共祖先 {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// LCA 问题，查阅相关资料
		if (root == null) {
			return root;
		}
		if (root.val == p.val || root.val == q.val) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null) {
			return root;
		} else if (left != null) {
			return left;
		} else if (right != null) {
			return right;
		}
		return null;
	}


	public static void main(String[] args) {
//		Integer[] a = {0, 2, 4, 1, null, 3, -1, 5, 1, null, null, null, 6, null, 8};
		Integer[] a = {3,5,1,6,2,0,8,null,null,7,4};
//		Integer[] a = {3,5,1};
		TreeNode b = buildTree(a);
		TreeNode a1 = new TreeNode(7);
		TreeNode a2 = new TreeNode(4);
		System.out.println(b.left.val);
		System.out.println(b.right.val);
		System.out.println(lowestCommonAncestor(b,a1,a2).val);
	}

	private static 集合.TreeNode buildTree(Integer[] a) {
		ArrayList<集合.TreeNode> ar = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				ar.add(new 集合.TreeNode(a[i]));
			} else {
				ar.add(null);
			}
		}
		for (int i = 0; i < a.length / 2; i++) {
			if (ar.get(i) != null) {
				ar.get(i).left = ar.get(i * 2 + 1);
				ar.get(i).right = ar.get(i * 2 + 2);
			}
		}
		return ar.get(0);
	}

}
