package leetcode;

import nowcoder.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-05-29 09:08
 * @Description:
 **/
public class T144二叉树的前序遍历 {
	public List<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> re = new ArrayList<>();
		if(root==null){
			return re;
		}
		dfs(re, root);
		return re;
	}

	private void dfs(ArrayList<Integer> arrayList, TreeNode root) {
		arrayList.add(root.val);
		if (root.left != null) {
			dfs(arrayList, root.left);
		}
		if (root.right != null) {
			dfs(arrayList, root.right);
		}
	}

	public List<Integer> preorderTraversal1(TreeNode root) {
		LinkedList<Integer> re = new LinkedList<>();
		LinkedList<TreeNode> stack = new LinkedList<>();
		if(root==null){
			return re;
		}
		stack.push(root);
		while (!stack.isEmpty()){
			TreeNode cur = stack.pop();
			re.add(cur.val);
			if(cur.right!=null){
				stack.push(cur.right);
			}
			if(cur.left!=null){
				stack.push(cur.left);
			}
		}
		return re;
	}


}
