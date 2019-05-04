package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 13:01
 * @Description: https://leetcode-cn.com/problems/combination-sum/
 **/
public class T39组合总和 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(candidates, 0, list, new ArrayList<>(), target);
		return list;
	}

	private void backtrack(int[] nums, int start, List<List<Integer>> list, List<Integer> tempList, int target) {
		if (target == 0) {
			list.add(new ArrayList<>(tempList));
		} else if (target < 0) {
			return;
		} else {
			for (int i = start; i < nums.length; i++) {
				tempList.add(nums[i]);
				backtrack(nums, i, list, tempList, target - nums[i]);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	public static void main(String[] args) {
		T39组合总和 a = new T39组合总和();
//		System.out.println(a.combinationSum(new int[]{2, 3, 6, 7}, 7));
		System.out.println(a.combinationSum(new int[]{2, 3, 5}, 8));
	}
}
