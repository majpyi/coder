package leetcode;

import javax.lang.model.util.ElementScanner6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: Mr.M
 * @Date: 2019-03-01 16:20
 * @Description: https://leetcode-cn.com/problems/longest-increasing-subsequence/
 **/
public class 最长上升子序列300 {

//	public int lengthOfLIS(int[] nums) {
//		if(nums==null || nums.length==0){
//			return 0;
//		}
//		int[] dp = new int[nums.length + 1];
//		for (int i = 0; i < nums.length; i++) {
//			dp[i] = 1;
//			for (int j = 0; j < i; j++) {
//				if (nums[i] > nums[j]) {
//					dp[i] = Math.max(dp[j] + 1, dp[i]);
//				}
//			}
//		}
//		return Arrays.stream(dp).max().getAsInt();
//	}

	public static int lengthOfLIS(int[] nums) {
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
		System.out.println(lengthOfLIS(new int[]{4, 10, 4, 3, 8, 9}));
	}
}
