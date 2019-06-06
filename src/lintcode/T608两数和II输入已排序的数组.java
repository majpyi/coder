package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-06 14:50
 * @Description:
 **/
public class T608两数和II输入已排序的数组 {
	public int[] twoSum(int[] nums, int target) {
		// write your code here
		int l = 0;
		int r = nums.length - 1;
		while (l <= r) {
			if (nums[l] + nums[r] == target) {
				break;
			}
			if (nums[l] + nums[r] > target) {
				r--;
			} else {
				l++;
			}
		}

		return new int[]{l + 1, r + 1};
	}
}
