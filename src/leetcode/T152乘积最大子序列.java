package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-04-15 16:12
 * @Description: https://leetcode-cn.com/problems/maximum-product-subarray/
 **/
public class T152乘积最大子序列 {
	public static int maxProduct(int[] nums) {
		System.out.println(Arrays.toString(nums));
		int[] min = new int[nums.length];
		min[0] = nums[0];
		int re = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			min[i] = Math.min(nums[i] * min[i - 1], nums[i] * nums[i - 1]);
			if (nums[i] > 0) {
				nums[i] = nums[i - 1] * nums[i];
			} else {
				nums[i] = min[i - 1] * nums[i];
			}
			nums[i] = Math.max(nums[i], temp);
			min[i] = Math.min(min[i], temp);
			re = Math.max(re, nums[i]);
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(min));
		return re;
	}

	public static int[] generateRandomArray(int len, int maxValue, int minValue) {
		int[] res = new int[len];
		for (int i = 0; i != res.length; i++) {
			res[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
		}
		return res;
	}

	public static void main(String[] args) {
//		System.out.println(maxProduct(generateRandomArray(5, 10, -10)));
		System.out.println(maxProduct(new int[]{2, -5, -2, -4, 3}));
//		System.out.println(1.1%0.2);
	}

}
