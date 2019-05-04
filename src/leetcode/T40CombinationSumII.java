package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 15:25
 * @Description: https://leetcode.com/problems/combination-sum-ii/
 **/
public class T40CombinationSumII {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> lists = new ArrayList<>();
		Arrays.sort(candidates);
		traceback(lists, new ArrayList<>(), candidates, target, 0);
		return lists;
	}

	private void traceback(List<List<Integer>> lists, ArrayList<Integer> list, int[] candidates, int target, int start) {
		if (target == 0) {
			lists.add(new ArrayList<>(list));
		}else if(target<0){
			return;
		}else {
			for (int i = start; i < candidates.length; i++) {
				if(i>start && candidates[i]==candidates[i-1]) continue;
				list.add(candidates[i]);
				traceback(lists,list,candidates,target-candidates[i],i+1);
				list.remove(list.size()-1);
			}
		}
	}


	public static void main(String[] args) {
		T40CombinationSumII x =new T40CombinationSumII();
		System.out.println(x.combinationSum2(new int[]{10,1,2,7,6,1,5},8));
	}
}
