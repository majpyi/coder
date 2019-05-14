package nowcoder.剑指offer;

import 手撕.树的前中后遍历;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 15:23
 * @Description: 平衡二叉树
 **/
public class T39平衡二叉树 {
	private static boolean IsBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		int diff = left - right;
//		System.out.println(left);
//		System.out.println(right);
		return diff >= -1 && diff <= 1;
	}

	private static int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		int leftNode = getDepth(root.left);
		int rightNode = getDepth(root.right);
		int depth = leftNode > rightNode ? leftNode : rightNode;
		return depth + 1;
	}

	public static void main(String[] args) {
		树的前中后遍历 a = new 树的前中后遍历();
		Integer[] b = new Integer[]{1, 2, 3, 4, null, null, 7, 8, 9};
		TreeNode t = a.buildTree(b);
//		System.out.println(IsBalanced_Solution(t.left));
//		System.out.println(IsBalanced_Solution(t.right));
		System.out.println(IsBalanced_Solution(t));
		System.out.println(Solution1.IsBalanced_Solution(t));
		System.out.println(Solution2.IsBalanced_Solution(t));
	}

}

class Solution1 {
	static boolean IsBalanced_Solution(TreeNode root) {
		if (root == null) {
			return true;
		}
		return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 &&
			IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
	}

	private static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}
}


class Solution2 {
	static boolean IsBalanced_Solution(TreeNode root) {
		return getDepth(root) != -1;
	}

	private static int getDepth(TreeNode root) {
		if (root == null) return 0;
		int left = getDepth(root.left);
		if (left == -1) return -1;
		int right = getDepth(root.right);
		if (right == -1) return -1;
		return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
	}
}