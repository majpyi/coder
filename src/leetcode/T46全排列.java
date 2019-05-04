package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 13:04
 * @Description: https://leetcode-cn.com/problems/permutations/
 **/
public class T46全排列 {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new LinkedList<>();
		traceback(nums, new ArrayList<>(), 0, result);
		return result;
	}

	public List<List<Integer>> traceback(int[] nums, ArrayList<Integer> list, int start, List<List<Integer>> result) {
		if (list.size() == nums.length) {
			result.add(new ArrayList<>(list));
		}
		for (int i = start; i < nums.length; i++) {
			if (list.contains(nums[i])) continue;
			list.add(nums[i]);
			traceback(nums, list, 0, result);
			list.remove(list.size() - 1);
		}
		return result;
	}


	public static void main(String[] args) {
		T46全排列 x = new T46全排列();
		System.out.println(x.permute(new int[]{1, 2, 3}));
	}
}
