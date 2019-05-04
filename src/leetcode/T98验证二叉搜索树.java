package leetcode;

import nowcoder.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 20:40
 * @Description: 验证二叉搜索树
 **/
public class T98验证二叉搜索树 {
	//	public boolean isValidBST(TreeNode root) {
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		return valid(root.left,arrayList) && valid(root.right,arrayList);
//	}
//
//	private boolean valid(TreeNode root,ArrayList<Integer> arrayList) {
//		if(root.left.val < Collections.min(arrayList) || root.right.val > Collections.max(arrayList))	{
//
//				valid(root.left,arrayList);
//				valid(root.right,arrayList);
//		}else {
//			return false;
//		}
//
//	}

	//   如果是二叉搜索树,那么中序遍历就是有序的
	public boolean isValidBST(TreeNode root) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		preOrderTraverse1(root, arrayList);
		for(int i=1;i<arrayList.size();i++){
			if(arrayList.get(i)<=arrayList.get(i-1)){
				return false;
			}
		}
		return true;
	}

	public void preOrderTraverse1(TreeNode root, ArrayList<Integer> arrayList) {
		if (root != null) {
//			System.out.print(root.val + "  ");
			preOrderTraverse1(root.left,arrayList);
			arrayList.add(root.val);
			preOrderTraverse1(root.right,arrayList);
		}
	}


}
