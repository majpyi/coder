package leetcode;

import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 19:20
 * @Description:
 **/
public class T235二叉搜索树的最近公共祖先 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root.val > p.val && root.val > q.val) {
			return lowestCommonAncestor(root.left, p, q);
		} else if (root.val < p.val && root.val < q.val) {
			return lowestCommonAncestor(root.right, p, q);
		}else {
			return root;
		}
	}
}
