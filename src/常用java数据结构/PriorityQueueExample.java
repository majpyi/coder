package 常用java数据结构;

/**
 * @Author: Mr.M
 * @Date: 2019-02-24 17:21
 * @Description: http://www.importnew.com/6932.html
 **/

import java.util.*;

class Customer implements Comparable {

	private int id;
	private String name;

	public Customer(int i, String n) {
		this.id = i;
		this.name = n;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}

public class PriorityQueueExample {

	public static void main(String[] args) {

		//优先队列自然排序示例
		Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
//	      PriorityQueue<Integer> queue = new PriorityQueue<>(k, (a, b) -> b - a);

		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			integerPriorityQueue.add(rand.nextInt(100));
		}
		for (int i = 0; i < 7; i++) {
			Integer in = integerPriorityQueue.poll();
//            integerPriorityQueue.
			System.out.println("Processing Integer:" + in);
		}

		//优先队列使用示例
		Queue<Customer> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
		addDataToQueue(customerPriorityQueue);
		pollDataFromQueue(customerPriorityQueue);

	}

	//匿名Comparator实现
	public static Comparator<Customer> idComparator = new Comparator<Customer>() {

		@Override
		public int compare(Customer c1, Customer c2) {
			return (int) (c1.getId() - c2.getId());
		}
	};

	//用于往队列增加数据的通用方法
	private static void addDataToQueue(Queue<Customer> customerPriorityQueue) {
		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			int id = rand.nextInt(100);
			customerPriorityQueue.add(new Customer(id, "Pankaj " + id));
		}
	}

	//用于从队列取数据的通用方法
	private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
		while (true) {
			Customer cust = customerPriorityQueue.poll();
			if (cust == null) break;
			System.out.println("Processing Customer with ID=" + cust.getId());
		}
	}

}

class PriorityQueueExample1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> a - b);
		PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>(Comparator.comparingInt(a -> a));
		PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
//				return o1-o2;
				if (o1 > o2) {
					return -1;
//					return 1;
				}
				if (o2 > o1) {
					return 1;
//					return -1;
				}
				return 0;
			}
		});


		priorityQueue2.add(1);
		priorityQueue2.add(2);
		priorityQueue2.add(3);
		//迭代器提供的iterator()方法不保证遍历优先级队列的元素根据任何特别的顺序。如果你需要有序的遍历，考虑使用Arrays.sort(pq.toArray())
		// PriorityQueue对元素采用的是堆排序，头是按指定排序方式的最小元素。堆排序只能保证根是最大（最小），整个堆并不是有序的。
		// 方法iterator()中提供的迭代器可能只是对整个数组的依次遍历。也就只能保证数组的第一个元素是最小的。
		System.out.println(priorityQueue2);
		System.out.println(priorityQueue2.poll());
		System.out.println(priorityQueue2.poll());
		System.out.println(priorityQueue2.poll());
		Object[] a = priorityQueue2.toArray();
		Arrays.sort(a);
		System.out.println(a);
	}
}