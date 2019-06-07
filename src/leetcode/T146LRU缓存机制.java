package leetcode;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-03-01 21:24
 * @Description: https://leetcode-cn.com/problems/lru-cache/
 **/

class task {
	int nums;
	int key;

	public task(int nums, int key) {
		this.nums = nums;
		this.key = key;
	}
}

//   没有考虑到多个相同频率的事物,但是调用的时间不同,也就是最近时间不同的情况如何区分.
class LRUCache {

	private PriorityQueue<task> p;
	private PriorityQueue<task> xiao;
	private HashMap<Integer, Integer> hm;
	private int ca = 0;

	public static Comparator<task> daComparator = new Comparator<task>() {

		@Override
		public int compare(task c1, task c2) {
			return (int) (c1.nums - c2.nums);
		}
	};

	public static Comparator<task> xiaoComparator = new Comparator<task>() {

		@Override
		public int compare(task c1, task c2) {
			return (int) (c2.nums - c1.nums);
		}
	};

	public LRUCache(int capacity) {
		p = new PriorityQueue<>(capacity, daComparator);
		hm = new HashMap<>(capacity);
		xiao = new PriorityQueue<>(capacity, xiaoComparator);
		ca = capacity;
	}

	public int get(int key) {
		if (p.size() > 0 && hm.containsKey(key)) {
			System.out.println(hm.get(key));
			return hm.get(key);
		} else {
			System.out.println(-1);
			return -1;
		}
	}

	public void put(int key, int value) {
		if (p.size() >= ca) {
			hm.remove(xiao.peek().key);
			p.remove(xiao.peek());
			xiao.remove();
		}
		p.add(new task(1, key));
		xiao.add(new task(1, key));
		hm.put(key, value);
	}

	public static void main(String[] args) {
		LRUCache cache = new LRUCache(2);
		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1);       // 返回  1
		cache.put(3, 3);    // 该操作会使得密钥 2 作废
		cache.get(2);       // 返回 -1 (未找到)
		cache.put(4, 4);    // 该操作会使得密钥 1 作废
		cache.get(1);       // 返回 -1 (未找到)
		cache.get(3);       // 返回  3
		cache.get(4);       // 返回  4
	}
}


class Node {
	int key;
	int value;
	Node pre;
	Node next;
	public Node(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

class LRUCache1 {
	HashMap<Integer, Node> map;
	int capicity, count;
	Node head, tail;
	public LRUCache1(int capacity) {
		this.capicity = capacity;
		map = new HashMap<>();
		head = new Node(0, 0);
		tail = new Node(0, 0);
		head.next = tail;
		tail.pre = head;
		head.pre = null;
		tail.next = null;
		count = 0;
	}

	public void deleteNode(Node node) {
		node.pre.next = node.next;
		node.next.pre = node.pre;
	}

	public void addToHead(Node node) {
		node.next = head.next;
		node.next.pre = node;
		node.pre = head;
		head.next = node;
	}

	public int get(int key) {
		if (map.get(key) != null) {
			Node node = map.get(key);
			int result = node.value;
			deleteNode(node);
			addToHead(node);
			System.out.println(result);
			return result;
		}
		System.out.println(-1);
		return -1;
	}

	public void put(int key, int value) {
		if (map.get(key) != null) {
			Node node = map.get(key);
			node.value = value;
			deleteNode(node);
			addToHead(node);
		} else {
			Node node = new Node(key, value);
			map.put(key, node);
			if (count < capicity) {
				count++;
				addToHead(node);
			} else {
				map.remove(tail.pre.key);
				deleteNode(tail.pre);
				addToHead(node);
			}
		}
	}
}

class LRUCache2 {

	HashMap<Integer, Integer> map;   //   不能这样使用,因为这样的情况下,只有map而没有链表,主要node提供pre与next的功能
	int capicity, count;
	Node head, tail;
}