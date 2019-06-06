package lintcode;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import nowcoder.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-06-06 15:20
 * @Description:
 **/
public class T69二叉树的层次遍历 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		// write your code here
		List<List<Integer>> re = new ArrayList<>();
		List<Integer> r = new ArrayList<>();
		ArrayList<TreeNode> arrayList = new ArrayList<>();

		if(root==null){
			return re;
		}
		TreeNode last = root;
		TreeNode nlast = root;

		arrayList.add(root);
		while (!arrayList.isEmpty()) {
			TreeNode tmp = arrayList.remove(0);
			r.add(tmp.val);
			if (tmp.left != null) {
				arrayList.add(tmp.left);
				nlast = tmp.left;
			}
			if (tmp.right != null) {
				arrayList.add(tmp.right);
				nlast = tmp.right;
			}
			if (tmp == last) {
				re.add(new ArrayList<>(r));
				r.clear();
				last = nlast;
			}
		}

		return re;
	}
}
