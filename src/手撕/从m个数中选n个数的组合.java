package 手撕;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 20:46
 * @Description:
 **/
public class 从m个数中选n个数的组合 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> list = new ArrayList<>();
		backtrack(candidates, 0, list, new ArrayList<>(), target);
		return list;
	}

	private void backtrack(int[] nums, int start, List<List<Integer>> list, List<Integer> tempList, int target) {
		if (target == tempList.size()) {
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = start; i < nums.length; i++) {
				tempList.add(nums[i]);
				// 包含当前的像素点,同一个位置可以取多次
//				backtrack(nums, i , list, tempList, target);
				// 同一个位置只能取一次,下次取数的位置是当前位置的下一个位置
				backtrack(nums, i + 1, list, tempList, target);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
