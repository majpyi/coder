package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 17:15
 * @Description: 树的子结构
 **/
public class T17 {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if(root1!=null && root2!=null){
			if(root1.val==root2.val){
				result =  findTree(root1,root2);
			}
			if(!result){
				return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
			}
		}
		return result;
	}

	private boolean findTree(TreeNode root1, TreeNode root2) {
		if(root2==null){
			return true;
		}
		if(root1==null){
			return false;
		}
		if(root1.val!=root2.val){
			return false;
		}

		return findTree(root1.right,root2.right) || findTree(root1.left,root2.left);
	}
}
