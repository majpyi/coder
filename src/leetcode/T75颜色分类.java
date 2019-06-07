package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-05-27 18:45
 * @Description: https://leetcode-cn.com/problems/sort-colors/，荷兰国旗问题
 **/
public class T75颜色分类 {
	public static void sortColors(int[] nums) {
		int[] bucket = new int[3];
		for (int x : nums) {
			bucket[x]++;
		}
		int k = 0;
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < bucket[j]; i++) {
				nums[k++] = j;
			}
		}
	}

	public static void sortColors1(int[] nums) {
		// 对于所有 idx < i : nums[idx < i] = 0
		// j是当前考虑元素的下标
		int p0 = 0, curr = 0;
		// 对于所有 idx > k : nums[idx > k] = 2
		int p2 = nums.length - 1;

		int tmp;
		while (curr <= p2) {
			if (nums[curr] == 0) {
				// 交换第 p0个和第curr个元素
				// i++，j++
				tmp = nums[p0];
				nums[p0++] = nums[curr];
				nums[curr++] = tmp;
			} else if (nums[curr] == 2) {
				// 交换第k个和第curr个元素
				// p2--
				tmp = nums[curr];
				nums[curr] = nums[p2];
				nums[p2--] = tmp;
			} else {
				curr++;
			}
		}
	}


	public static void main(String[] args) {
		int[] arr = new int[]{2, 0, 2, 1, 1, 0};
		sortColors(arr);
		System.out.println(Arrays.toString(arr));
	}
}
