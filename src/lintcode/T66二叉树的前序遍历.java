package lintcode;

import nowcoder.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 20:09
 * @Description:
 **/
public class T66二叉树的前序遍历 {
	public List<Integer> preorderTraversal(TreeNode root) {
		// write your code here
		ArrayList<Integer> arrayList = new ArrayList<>();
		dfs(root,arrayList);
		return arrayList;
	}

	private void dfs(TreeNode root, ArrayList<Integer> arrayList) {
		if(root!=null){
			arrayList.add(root.val);
			dfs(root.left,arrayList);
			dfs(root.right,arrayList);
		}
	}
}
