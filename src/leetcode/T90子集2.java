package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 14:10
 * @Description: https://leetcode-cn.com/problems/subsets-ii/
 **/
public class T90子集2 {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
//		List<List<Integer>> lists = new ArrayList<>();
		Arrays.sort(nums);

		List<List<Integer>> lists = new ArrayList<>();
		traceback(nums, lists, new ArrayList<Integer>(), 0);
//		HashSet<List<Integer>> hashSet =new HashSet<>(lists);
//		return new ArrayList<>(hashSet);
		return lists;
	}

	private void traceback(int[] nums, List<List<Integer>> lists, ArrayList<Integer> arrayList, int start) {
		lists.add(new ArrayList<>(arrayList));
		for (int i = start; i < nums.length; i++) {
				if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
			arrayList.add(nums[i]);
			traceback(nums, lists, arrayList, i + 1);
			arrayList.remove(arrayList.size() - 1);
		}
	}

	public static void main(String[] args) {
		T90子集2 a = new T90子集2();
		System.out.println(a.subsetsWithDup(new int[]{1, 2, 2,2}));
	}

}
