package leetcode;

import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 16:47
 * @Description:
 **/
public class T104二叉树的最大深度 {
	public int maxDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
		int right = maxDepth(root.right);
		int left = maxDepth(root.left);
		return Math.max(right,left)+1;
	}
}
