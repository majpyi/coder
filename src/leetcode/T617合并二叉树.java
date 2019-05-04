package leetcode;

import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-04-02 10:25
 * @Description: https://leetcode-cn.com/problems/merge-two-binary-trees/
 **/
public class T617合并二叉树 {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		merge(t1, t2);
		return t1;
	}

	private void merge(TreeNode t1, TreeNode t2) {
//		if(t2.right==null && t2.left==null){
		if (t2 == null) {
			return;
		}
		if (t1.right == null) {
			t1.right = t2.right;
		}else if(t1.left == null) {
			t1.left = t2.left;
		} else {
			t1.val = t1.val + t2.val;
		}
		merge(t1.right, t2.right);
		merge(t1.left, t2.left);
	}

}
