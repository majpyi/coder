package leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 16:57
 * @Description: https://leetcode.com/problems/permutations-ii/
 **/
public class T47PermutationsII {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
		return list;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, boolean[] used) {
		if (tempList.size() == nums.length) {
			list.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
//				if (used[i]) continue;
				used[i] = true;
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, used);
				used[i] = false;
				tempList.remove(tempList.size() - 1);
			}
		}
	}



	//   第二种
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> list =  new ArrayList<>();
		permutation(nums,0,nums.length-1,list);
		return list;
	}
	private static void permutation(int[] s, int from, int to, List<List<Integer>> list) {
		if (from == to) {
//			list.add(new ArrayList<Integer>(Arrays.asList(s)));
//			list.add(new ArrayList<Integer>(s));
//			ArrayList<Integer> arrayList = new ArrayList<>();
//			Collections.addAll(arrayList,s);
			list.add(Arrays.stream( s).boxed().collect(Collectors.toList()));
		} else {
			for (int i = from; i <= to; i++) {
				swap(s, i, from); //交换前缀，使其产生下一个前缀
				permutation(s, from + 1, to, list);
				swap(s, i, from); //将前缀换回，继续做上一个前缀的排列
			}
		}
	}

	private static void swap(int[] s, int i, int j) {
		int tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}

	private static ArrayList<String> arrayList = new ArrayList<>();

	public static void main(String[] args) {
		T47PermutationsII x = new T47PermutationsII();
//		System.out.println(x.permuteUnique(new int[]{1,2,2}));
		System.out.println(permute(new int[]{1,2,3}));
	}
}
