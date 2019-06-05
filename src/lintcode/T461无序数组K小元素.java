package lintcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author: Mr.M
 * @Date: 2019-06-04 10:25
 * @Description:
 **/
public class T461无序数组K小元素 {
	public static int kthSmallest(int k, int[] nums) {
		// write your code here
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		int re = Integer.MAX_VALUE;
		for (int x : nums) {
			// 这里需要记录边界为k-1,如果为k的话,最小的三个数,那么p里面存储的是三个数,因为当size==2的时候仍然会存储,这时p里面存储了3个数值,而你需要的存储前k-1的数字,这样保证,
			// 没有在里面的数字可以获取其中最小的那个,保证是最小第k个数
			if (priorityQueue.size() < k - 1) {
				priorityQueue.add(x);
			} else {
				if (x < priorityQueue.peek()) {
					int a = priorityQueue.poll();
//					System.out.println(a);
					if (a < re) {
						re = a;
					}
					priorityQueue.add(x);
				} else {
					if (x < re) {
						re = x;
					}
				}
				System.out.println(x);
			}
		}
		return re;
	}

	public static void main(String[] args) {
		System.out.println(kthSmallest(3, new int[]{3, 4, 1, 2, 5}));
	}
}
