package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 18:53
 * @Description: 二叉树的镜像
 **/
public class T18二叉树的镜像 {
	public void Mirror(TreeNode root) {
		if(root==null){
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		Mirror(root.right);
		Mirror(root.left);
	}
}
