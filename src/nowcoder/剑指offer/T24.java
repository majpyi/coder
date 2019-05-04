package nowcoder.剑指offer;

import 手撕.树的前中后遍历;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 10:41
 * @Description: 二叉树中和为某一值的路径
 **/
public class T24 {
	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> re = new ArrayList<>();
		ArrayList<Integer> r = new ArrayList<>();
		accumulate(root, target, re, r);
		re = new ArrayList<>(new HashSet<>(re));
		Collections.sort(re, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				return o2.size()-o1.size();
			}
		});
		return re;
	}

	private static void accumulate(TreeNode root, int target, ArrayList<ArrayList<Integer>> re, ArrayList<Integer> r) {
		if (root == null && target == 0) {
			re.add(new ArrayList<>(r));
			return;
		}
		if (root != null) {
			r.add(root.val);
			target -= root.val;
			accumulate(root.left, target, re, r);
			accumulate(root.right, target, re, r);
			r.remove(r.size() - 1);
		}

//		if (root == null) {
//			return;
//		}
//		r.add(root.val);
//		target -= root.val;
//		if (root.right == null && root.left == null && target == 0) {
//			re.add(new ArrayList<>(r));
//		} else {
//			accumulate(root.left, target, re, r);
//			accumulate(root.right, target, re, r);
//		}
//		r.remove(r.size() - 1);

	}


	public static void main(String[] args) {
		树的前中后遍历 a = new 树的前中后遍历();
		Integer[] b = new Integer[]{10,5,12,4,7};
		TreeNode t = a.buildTree(b);
		System.out.println(FindPath(t, 22));
	}
}
