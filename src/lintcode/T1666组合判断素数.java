package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 20:15
 * @Description:
 **/
public class T1666组合判断素数 {
	public int getWays(int[] a, int k) {
		// Write your code here
		int num = 0;
		List<List<Integer>> re = combinationSum(a, k);
		System.out.println(re);
		for (List<Integer> list : re) {
			int sum = 0;
			for (Integer x : list) {
				sum += x;
			}
			if (isPrime(sum)) {
				num++;
			}
		}
		return num;
	}

	public static boolean isPrime(int a) {
		boolean flag = true;
		if (a < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}


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
				backtrack(nums, i + 1, list, tempList, target);
				tempList.remove(tempList.size() - 1);
			}
		}
	}


	public static void main(String[] args) {
		T1666组合判断素数 a = new T1666组合判断素数();
		a.getWays(new int[]{3, 7, 12, 19}, 3);
	}
}
