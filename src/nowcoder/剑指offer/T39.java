package nowcoder.剑指offer;

import 手撕.树的前中后遍历;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 15:23
 * @Description: 平衡二叉树
 **/
public class T39 {
	public static boolean IsBalanced_Solution(TreeNode root) {
		if (root == null)
			return true;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		int diff = left - right;
		System.out.println(left);
		System.out.println(right);
		if (diff >= -1 && diff <= 1) {
			return true;
		}
		return false;
	}

	public static int getDepth(TreeNode root) {
		if (root == null)
			return 0;
		int depth = 0;
		int leftNode = getDepth(root.left);
		int rightNode = getDepth(root.right);
		depth = leftNode > rightNode ? leftNode : rightNode;
		return depth + 1;
	}

	public static void main(String[] args) {
		树的前中后遍历 a = new 树的前中后遍历();
		Integer[] b = new Integer[]{1, 2, 3, 4, null, null, 7, 8, 9};
		TreeNode t = a.buildTree(b);
		System.out.println(IsBalanced_Solution(t.left));
		System.out.println(IsBalanced_Solution(t.right));
		System.out.println(IsBalanced_Solution(t));
	}

}
