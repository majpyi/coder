package 手撕;

import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-05-28 21:10
 * @Description:
 **/
public class 二叉树序列化与反序列化 {
	public int index = -1;

	String Serialize(TreeNode root) {
		StringBuilder s = new StringBuilder();
		if (root == null) {
			s.append("#,");
			return s.toString();
		}
		s.append(root.val + ",");
		s.append(Serialize(root.left));
		s.append(Serialize(root.right));
		return s.toString();
	}

	TreeNode Deserialize(String str) {
		index++;
		String[] DLRseq = str.split(",");
		TreeNode leave = null;
		if (!DLRseq[index].equals("#")) {
			leave = new TreeNode(Integer.valueOf(DLRseq[index]));
			leave.left = Deserialize(str);
			leave.right = Deserialize(str);
		}
		return leave;
	}
}