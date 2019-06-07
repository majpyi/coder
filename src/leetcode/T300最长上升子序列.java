package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: Mr.M
 * @Date: 2019-04-05 11:56
 * @Description: https://leetcode-cn.com/problems/longest-increasing-subsequence/
 **/
public class T300最长上升子序列 {

	public int lengthOfLIS(int[] nums) {
		int[] maxlength = new int[nums.length];
		maxlength[0] = 1;
		int max = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				maxlength[i] = Math.max(maxlength[i - 1], ++max);
			} else {
				maxlength[i] = maxlength[i - 1];
				max = 1;
			}
		}
		return maxlength[nums.length - 1];
	}

	public int lengthOfLIS1(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 0;
		for (int num : nums) {
			int i = Arrays.binarySearch(dp, 0, len, num);
			if (i < 0) {
				i = -(i + 1);
			}
			dp[i] = num;
			if (i == len) {
				len++;
			}
		}
		return len;
	}


	public static int lengthOfLIS2(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int[] dp = new int[nums.length];
		dp[0] = 1;
		for (int i = 1; i < nums.length; i++) {
			int temp = 0;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					temp = Math.max(dp[j], temp);
				}
			}
			dp[i] = temp + 1;
		}
		System.out.println(Arrays.toString(dp));
		return Arrays.stream(dp).max().getAsInt();
	}


	public static int lengthOfLIS3(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(nums[0]);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > arrayList.get(arrayList.size()-1)) {
				arrayList.add(nums[i]);
			} else {
				int index = Collections.binarySearch(arrayList, nums[i]);
				if (index < 0) {
					index = -index - 1;
				}
				arrayList.remove(index);
				arrayList.add(index, nums[i]);
			}
		}
		System.out.println(arrayList);
		return arrayList.size();
	}
	public static void main(String[] args) {
		System.out.println(lengthOfLIS2(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
		System.out.println(lengthOfLIS2(new int[]{1, 2, 4, 3, 5, 4, 7, 2}));
	}
}
