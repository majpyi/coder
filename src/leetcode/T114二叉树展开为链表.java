package leetcode;

import nowcoder.剑指offer.TreeNode;
import 手撕.树的前中后遍历;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-04-18 19:20
 * @Description:
 **/
public class T114二叉树展开为链表 {

	private static TreeNode prev = null;

	public static void flatten(TreeNode root) {
		if (root == null)
			return;
		flatten(root.right);
		flatten(root.left);
		System.out.println(root.val);
		root.right = prev;
		root.left = null;
		prev = root;
	}


	public static void main(String[] args) {
		树的前中后遍历 a = new 树的前中后遍历();
		TreeNode x = a.buildTree(new Integer[]{1,2,5,3,4,null,6});
		flatten(x);
	}

//	public void flatten(TreeNode root) {
//		if(root==null){
//			return;
//		}
//		System.out.println(root.val);
//		flatten(root.left);
//		flatten(root.right);
//	}

//	public void flatten(TreeNode root) {
//		Stack<TreeNode> stack = new Stack<>();
//
//		while (root != null || !stack.isEmpty()) {
//			if (root != null) {
//				System.out.println(root.val);
//				stack.push(root);
//				root = root.right;
//			} else {
//				root = stack.pop().right;
//			}
//		}
//	}

}
