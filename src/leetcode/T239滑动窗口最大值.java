package leetcode;

import java.awt.font.MultipleMaster;
import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-03-01 08:42
 * @Description: https://leetcode-cn.com/problems/sliding-window-maximum/
 **/
public class T239滑动窗口最大值 {

	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (nums.length == 0) {
			return new int[]{};
		}
		ArrayList<Integer> window = new ArrayList<>();
		int[] res = new int[nums.length - k + 1];
		for (int i = 0; i < nums.length; i++) {
			if (i >= k && window.get(0) <= i - k) {
				window.remove(0);
			}

			while (!window.isEmpty() && nums[window.get(window.size() - 1)] <= nums[i]) {
				window.remove(window.size() - 1);
			}

			window.add(i);

			if (i >= k - 1) {
				res[i - k + 1] = nums[window.get(0)];
			}
		}
		return res;
	}

	public int[] maxSlidingWindow1(int[] nums, int k) {
		if (k == 0) {
			return nums;
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>(k, (a, b) -> b - a);
		for (int i = 0; i < k; i++) {
			queue.add(nums[i]);
		}

		int[] res = new int[nums.length - k + 1];
		for (int i = 0; i < res.length; i++) {
			res[i] = queue.peek();
			queue.remove(nums[i]);
			if (i + k < nums.length) {
				queue.add(nums[i + k]);
			}
		}
		return res;
	}


	public int[] maxSlidingWindow3(int[] nums, int k) {
		int len = nums.length;
		int[] result = new int[len - k + 1];
		if(nums.length == 0) return new int[0];
		Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>(){
			@Override
			public int compare(Integer i1, Integer i2){
				return Integer.compare(i2, i1);
			}
		});

		for(int i = 0; i < k; i ++){
			queue.add(nums[i]);
		}
		result[0] = queue.peek();
		for(int i = k; i < len; i ++){
			queue.remove(nums[i - k]);
			queue.add(nums[i]);
			result[i - k + 1] = queue.peek();
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
	}


	public int[] maxSlidingWindow2(int[] nums, int k) {
		int[] re = {};
		if (nums.length == 0) {   //  判断极限条件
			return re;
		}
		ArrayList a = new ArrayList();
		re = new int[nums.length - k + 1];
		for (int i = 0; i <= nums.length - k; i++) {
			a.clear();
			for (int j = i; j < i + k; j++) {
				a.add(nums[j]);
			}
			re[i] = (int) Collections.max(a);
		}
		return re;
	}
}
