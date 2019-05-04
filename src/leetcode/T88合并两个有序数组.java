package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-25 15:23
 * @Description: https://leetcode-cn.com/problems/merge-sorted-array/
 **/
public class T88合并两个有序数组 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int k = n + m - 1;
		while (i >= 0 && j >= 0) {
			if (nums1[i] >= nums2[j]) {
				nums1[k--] = nums1[i--];
			}else{
				nums1[k--] = nums2[j--];
			}
		}
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}

	}

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 0, 0, 0};
		int[] nums2 = {2, 5, 6};
		merge(nums1, 3, nums2, 3);
		System.out.println(Arrays.toString(nums1));
	}
}
