package lintcode;

import nowcoder.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 20:12
 * @Description:
 **/
public class T67二叉树的中序遍历 {
	public List<Integer> inorderTraversal(TreeNode root) {
		// write your code here
		ArrayList<Integer> arrayList = new ArrayList<>();
		dfs(root,arrayList);
		return arrayList;
	}

	private void dfs(TreeNode root, ArrayList<Integer> arrayList) {
		if(root!=null){
			dfs(root.left,arrayList);
			arrayList.add(root.val);
			dfs(root.right,arrayList);
		}
	}
}
