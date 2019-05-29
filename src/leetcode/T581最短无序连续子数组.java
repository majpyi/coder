package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-05-28 08:21
 * @Description: https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray/
 **/
public class T581最短无序连续子数组 {
	public static int findUnsortedSubarray(int[] nums) {
//		if(nums.length==0){
//			return 0;
//		}
		int[] num = nums.clone();
		Arrays.sort(nums);
		int length = 0;
		int start = 0;
		int end = 0;
		for (int i = 0; i < nums.length; i++) {
			if (num[i] != nums[i]) {
//				length++;
				start = i;
				break;
			}
		}

		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] != nums[i]) {
				end = i;
				break;
			}
		}
//		System.out.println(Arrays.toString(num));
//		System.out.println(Arrays.toString(nums));
		if (start == 0 && end == 0) {
			return 0;
		}
		return end - start + 1;
	}

	public static int findUnsortedSubarray1(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int l = 0;
		int r = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= max) {
				max = nums[i];
			} else {
				l = i;
			}
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] <= min) {
				min = nums[i];
			} else {
				r = i;
			}
		}
		if (l == 0 && r == 0) {
			return 0;
		}
		return l - r + 1;
	}

	public static void main(String[] args) {
		System.out.println(findUnsortedSubarray1(new int[]{2, 6, 4, 8, 10, 9, 15}));
		System.out.println(findUnsortedSubarray1(new int[]{}));
		System.out.println(findUnsortedSubarray1(new int[]{1, 2, 3, 4}));
		System.out.println(findUnsortedSubarray1(new int[]{1, 2, 3, 3, 3}));
	}
}
