package 手撕;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

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

		for (int i = 0; i < (list.length - 1) / 2; i++) {
			a.get(i).left = a.get(i * 2 + 1);
			a.get(i).right = a.get(i * 2 + 2);
		}
		if ((list.length & 1) == 0) {
			a.get(list.length / 2 - 1).left = a.get((list.length / 2 - 1) * 2 + 1);
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
				if (i * 2 + 2 < a.length) {
					ar.get(i).right = ar.get(i * 2 + 2);
				}
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


	// 栈中存储的是已经打印的节点，每次都是当前已打印的左节点，如果左节点为空的情况下才弹出该节点并打印右节点
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

	// 栈中存储的是下一个需要打印的节点，但是先存储右节点再存储左节点
	public void preOrderTraverse3(TreeNode root) {
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> stack = new LinkedList<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode cur = stack.poll();
			System.out.print(cur.val + "  ");
			if (cur.right != null) {
				stack.push(cur.right);
			}
			if (cur.left != null) {
				stack.push(cur.left);
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

	public void inOrderTraverse3(TreeNode root) {
		LinkedList<TreeNode> stack = new LinkedList<>();
		stack.push(root);
		root = root.left;
		while (!stack.isEmpty() || root != null) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				TreeNode temp = stack.pop();
				System.out.print(temp.val + "  ");
				root = temp.right;
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


	public void postOrderTraverse2(TreeNode root) {
		Stack<TreeNode> stack1 = new Stack();
		Stack<TreeNode> stack2 = new Stack();
		stack1.push(root);
		while (stack1.size() != 0) {
			TreeNode cur = stack1.pop();
			stack2.push(cur);
			if (cur.left != null) {
				stack1.push(cur.left);
			}
			if (cur.right != null) {
				stack1.push(cur.right);
			}
		}
		while (stack2.size() != 0) {
			System.out.print(stack2.pop().val + "  ");
		}
	}


	public void levelTraverse(TreeNode root) {
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
//		queue.add(root);
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


	public void levelTraverse1(TreeNode root) {
		TreeNode last;
		TreeNode nlast;
		if (root == null) {
			return;
		}
		LinkedList<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		last = root;
		nlast = root;
//		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.left != null) {
				queue.offer(node.left);
				nlast = node.left;
			}
			if (node.right != null) {
				queue.offer(node.right);
				nlast = node.right;
			}
			System.out.print(node.val + "  ");
			if (node == last) {
				last = nlast;
				System.out.println();
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


	static String Serialize(TreeNode root) {
		StringBuilder s = new StringBuilder();
		if (root == null) {
			s.append("#,");
			return s.toString();
		}
		s.append(Serialize(root.left));
		s.append(root.val + ",");
		s.append(Serialize(root.right));
		return s.toString();
	}

	public static int index = -1;

	static TreeNode Deserialize(String str) {
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

	public static void main(String[] args) {
		树的前中后遍历 a = new 树的前中后遍历();
//		Integer[] b = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//		Integer[] b = new Integer[]{0, 1, 2, 3, 4, 5, 6};
		Integer[] b = new Integer[]{1, 2, 3, 4, 5, 6, 7};
//		TreeNode t = a.init(b);
		TreeNode t = a.buildTree(b);
//		System.out.println(Serialize(t));
//		a.levelTraverse(t);
//		a.levelTraverse1(t);
//		System.out.println();
		a.preOrderTraverse1(t);
		System.out.println();
		a.preOrderTraverse3(t);
		System.out.println();
		a.postOrderTraverse2(t);
		System.out.println();
		a.postOrderTraverse1(t);
		System.out.println();
		a.inOrderTraverse3(t);
		System.out.println();
		a.inOrderTraverse1(t);
//		System.out.println();
//		a.depthOrderTraverse(t);
//		a.levelTraverse(t);
	}

}
