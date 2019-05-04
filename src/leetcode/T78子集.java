package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 13:58
 * @Description: https://leetcode-cn.com/problems/subsets/
 **/
public class T78子集 {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> lists = new ArrayList<>();
		traceback(nums, new ArrayList<Integer>(), lists, 0);
		return lists;
	}

	private void traceback(int[] nums, ArrayList<Integer> arrayList, List<List<Integer>> lists, int start) {
		lists.add(new ArrayList<>(arrayList));
//		if (start >= nums.length) {
//			return;
//		} else
//			{
			for (int i = start; i < nums.length; i++) {
				arrayList.add(nums[i]);
				traceback(nums, arrayList, lists, i + 1);
				arrayList.remove(arrayList.size() - 1);
			}
//		}
	}


	public static void main(String[] args) {
		T78子集 a = new T78子集();
		System.out.println(a.subsets(new int[]{1, 2, 3}));
	}
}
