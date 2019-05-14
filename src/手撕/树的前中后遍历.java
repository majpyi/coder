package 手撕;

import java.util.ArrayList;
import java.util.LinkedList;
import nowcoder.剑指offer.TreeNode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 11:03
 * @Description:
 **/
public class 树的前中后遍历 {

	public TreeNode init(int[] list) {
		ArrayList<TreeNode> a = new ArrayList<>();
		for (int i = 0; i < list.length; i++) {
			a.add(new TreeNode(list[i]));
		}

		for (int i = 0; i < (list.length-1) / 2 ; i++) {
			a.get(i).left = a.get(i * 2 + 1);
			a.get(i).right = a.get(i * 2 + 2);
		}
		if((list.length&1)==0){
			a.get(list.length / 2 -1).left = a.get((list.length / 2 -1) * 2 + 1);
		}
		return a.get(0);
	}

	public TreeNode buildTree(Integer[] a) {
		ArrayList<TreeNode> ar = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null) {
				ar.add(new TreeNode(a[i]));
			} else {
				ar.add(null);
			}
		}
		for (int i = 0; i < a.length / 2; i++) {
			if (ar.get(i) != null) {
				ar.get(i).left = ar.get(i * 2 + 1);
				ar.get(i).right = ar.get(i * 2 + 2);
			}
		}
		return ar.get(0);
	}


	public void preOrderTraverse1(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + "  ");
			preOrderTraverse1(root.left);
			preOrderTraverse1(root.right);
		}
	}

	public void preOrderTraverse2(TreeNode root) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		TreeNode pNode = root;
		while (pNode != null || !stack.isEmpty()) {
			if (pNode != null) {
				System.out.print(pNode.val + "  ");
				stack.push(pNode);
				pNode = pNode.left;
			} else { //pNode == null && !stack.isEmpty()
				TreeNode node = stack.pop();
				pNode = node.right;
			}
		}
	}

	public void inOrderTraverse1(TreeNode root) {
		if (root != null) {
			inOrderTraverse1(root.left);
			System.out.print(root.val + "  ");
			inOrderTraverse1(root.right);
		}
	}


	public void inOrderTraverse2(TreeNode root) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		TreeNode pNode = root;
		while (pNode != null || !stack.isEmpty()) {
			if (pNode != null) {
				stack.push(pNode);
				pNode = pNode.left;
			} else { //pNode == null && !stack.isEmpty()
				TreeNode node = stack.pop();
				System.out.print(node.val + "  ");
				pNode = node.right;
			}
		}
	}


	public void postOrderTraverse1(TreeNode root) {
		if (root != null) {
			postOrderTraverse1(root.left);
			postOrderTraverse1(root.right);
			System.out.print(root.val + "  ");
		}
	}

	public void levelTraverse(TreeNode root) {
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.val + "  ");
			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}
		}
	}

	public void depthOrderTraverse(TreeNode root) {
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> stack = new LinkedList<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			System.out.print(node.val + "  ");
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
	}


	public static void main(String[] args) {
		树的前中后遍历 a = new 树的前中后遍历();
		Integer[] b = new Integer[]{1, 2, 3, 4, 5, 6,7};
//		TreeNode t = a.init(b);
		TreeNode t = a.buildTree(b);
		a.levelTraverse(t);
		System.out.println();
//		a.preOrderTraverse1(t);
//		a.preOrderTraverse2(t);
//		System.out.println();
		a.depthOrderTraverse(t);
//		a.levelTraverse(t);
	}

}
