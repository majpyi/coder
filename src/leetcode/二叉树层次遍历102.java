package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import 常用java数据结构.TreeNode;


/**
 * @Author: Mr.M
 * @Date: 2019-02-26 10:47
 * @Description: https://leetcode-cn.com/problems/binary-tree-level-order-traversal/submissions/
 **/
public class 二叉树层次遍历102 {
	public static List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ree = new LinkedList<>();
		LinkedList<Integer> re = new LinkedList<>();
		LinkedList<TreeNode> qu = new LinkedList<>();
		if (root == null) {
			return ree;
		}
		qu.add(root);
		qu.add(new TreeNode(Integer.MIN_VALUE));
//        qu.add(null);
		re.add(root.val);
		ree.add(new LinkedList<>(re));
		re.removeAll(re);
		while (!qu.isEmpty()) {
			if (qu.size() == 1 && qu.getFirst().val == Integer.MIN_VALUE) {
//            if (qu.size() == 1 && qu.getFirst()==null) {
				break;
			}
			TreeNode x = qu.pop();
			if (x.val == Integer.MIN_VALUE) {
				ree.add(new LinkedList<>(re));
				re.removeAll(re);
				qu.add(new TreeNode(Integer.MIN_VALUE));
//                qu.add(null);
			}
			if (x.left != null) {
				qu.add(x.left);
				re.add(x.left.val);
			}
			if (x.right != null) {
				qu.add(x.right);
				re.add(x.right.val);
			}
		}
		System.out.println(ree);
		return ree;
	}


	public static void main(String[] args) {
		Integer[] a = {0, 2, 4, 1, null, 3, -1, 5, 1, null, null, null, 6, null, 8};
		TreeNode b = buildTree(a);
		levelOrder(b);
	}

	private static TreeNode buildTree(Integer[] a) {
		ArrayList<TreeNode> ar = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				ar.add(new TreeNode(a[i]));
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
		System.out.println(1);
		return ar.get(0);
	}


}
