package nowcoder.剑指offer;

import 手撕.树的前中后遍历;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 15:23
 * @Description: 二叉树的深度
 **/
public class T38 {
	public static int TreeDepth(TreeNode root) {
//		int th =0;
//		return findDepth(root,th);
		if (root==null){
			return 0;
		}
		return 1+Math.max(TreeDepth(root.left),TreeDepth(root.right));

	}

//	private int findDepth(TreeNode root, int th) {
//		if(root!=null){
//			Math.max(findDepth(root.left,th+1),findDepth(root.right,th+1)) ;
//		}
//		return th;
//	}

	public static void main(String[] args) {
		树的前中后遍历 a = new 树的前中后遍历();
		Integer[] b = new Integer[]{1, 2, 3, 4, 5, 6,7};
		TreeNode t = a.buildTree(b);
		System.out.println(TreeDepth(t));
	}
}
