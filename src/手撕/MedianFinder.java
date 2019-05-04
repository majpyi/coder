package 手撕;

import java.util.PriorityQueue;

/**
 * @Author: Mr.M
 * @Date: 2019-04-18 20:36
 * @Description:
 **/
class MedianFinder {
//	private Queue<Long> small = new PriorityQueue(),
//		large = new PriorityQueue();    // 每次弹出最小的
//
//	public void addNum(int num) {
//		large.add((long) num);
//		small.add(-large.poll());
//		if (large.size() < small.size())
//			large.add(-small.poll());
//	}
//
//	public double findMedian() {
//		return large.size() > small.size()
//			? large.peek()
//			: (large.peek() - small.peek()) / 2.0;
//	}
	private PriorityQueue<Integer> small;
	private PriorityQueue<Integer> large;
	public MedianFinder() {
		small = new PriorityQueue<>((a, b) -> b - a);  // 每次弹出最大的
		large = new PriorityQueue<>();    // 每次弹出最小的
	}


	public void addNum(int num) {
		large.add(num);
		small.add(large.poll());
		if (large.size() < small.size())
			large.add(small.poll());
	}

	public double findMedian() {
		return large.size() > small.size() ? large.peek() : (large.peek() + small.peek()) / 2.0;
	}


	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(3);
		priorityQueue.add(1);
		priorityQueue.add(2);
		System.out.println(priorityQueue.poll());
	}

}
