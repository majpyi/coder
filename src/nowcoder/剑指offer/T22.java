package nowcoder.剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 10:10
 * @Description: 从上往下打印二叉树
 **/
public class T22 {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		ArrayList<Integer> re = new ArrayList<>();
		LinkedList<TreeNode> list = new LinkedList<>();
		if (root == null) {
			return re;
		}
		list.add(root);
		while (!list.isEmpty()) {
			if (list.peek().left != null) {
				list.add(list.peek().left);
			}
			if (list.peek().right != null) {
				list.add(list.peek().right);
			}
			re.add(list.poll().val);
		}
		return re;
	}


	public static ArrayList<ArrayList<Integer>> PrintFromTopToBottom1(TreeNode root) {
		ArrayList<ArrayList<Integer>> re = new ArrayList<>();
		LinkedList<TreeNode> list = new LinkedList<>();
		if (root == null) {
			return re;
		}
		list.add(root);
		while (!list.isEmpty()) {
			int l = list.size();
			ArrayList<Integer> layer = new ArrayList();
			for (int i = 0; i < l; i++) {
				if (list.peek().left != null) {
					list.add(list.peek().left);
				}
				if (list.peek().right != null) {
					list.add(list.peek().right);
				}
				layer.add(list.poll().val);
			}
			re.add(layer);
		}
		return re;
	}


	public static void main(String[] args) {

	}
}
