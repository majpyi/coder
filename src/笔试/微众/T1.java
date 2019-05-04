package 笔试.微众;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 18:27
 * @Description:
 **/
public class T1 {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int m = scanner.nextInt();
//		LinkedList<Integer> linkedList = new LinkedList<>();
//		ArrayList<Integer> arrayList = new ArrayList<>();
//
//		int num = 0;
//		for (int i = 1; i <= n; i++) {
//			linkedList.add(i);
//		}
////		System.out.println(linkedList);
//		while (linkedList.size() > 1) {
////			arrayList.add(num + m - 1);
//			num = (num + m - 1) % linkedList.size();
////			arrayList.add(linkedList.get(num));
//			arrayList.add(linkedList.get(num));
////			System.out.println(linkedList.get(num));
//			linkedList.remove(num);
//		}
//		StringBuilder stringBuilder = new StringBuilder();
//
//		for (int i = 0; i < arrayList.size() - 1; i++) {
//			stringBuilder.append(arrayList.get(i)).append(" ");
//		}
//		if (arrayList.size() - 1 >= 0) {
//			stringBuilder.append(arrayList.get(arrayList.size() - 1));
//			System.out.println(stringBuilder.toString());
//		} else {
//			System.out.println(linkedList.get(0));
//		}
//		System.out.println(linkedList.get(0));
//	}


//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int m = scanner.nextInt();
//		LinkedList<Integer> linkedList = new LinkedList<>();
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		int num = 0;
////		if()
//		for (int i = 1; i <= n; i++) {
//			linkedList.add(i);
//		}
//		while (linkedList.size() > 1) {
//			num = (num + m - 1) % linkedList.size();
//			arrayList.add(linkedList.get(num));
//			linkedList.remove(num);
//		}
//		StringBuilder stringBuilder = new StringBuilder();
//		for (int i = 0; i < arrayList.size() - 1; i++) {
//			stringBuilder.append(arrayList.get(i)).append(" ");
//		}
//		if (arrayList.size() - 1 >= 0) {
//			stringBuilder.append(arrayList.get(arrayList.size() - 1));
//			System.out.println(stringBuilder.toString());
//		} else {
//			System.out.println(linkedList.get(0));
//		}
//		System.out.println(linkedList.get(0));
//	}

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		int m = scanner.nextInt();
////		LinkedList<Integer> linkedList = new LinkedList<>();
//		ArrayList<Integer> arrayList = new ArrayList<>();
//		int[] a = new int[n + 1];
//		int b = 0;
//		for (int i = 1, c = 0; b < n; i = i < n ? i + 1 : 1) {
//			if (a[i] == 0) {
//				c++;
//				if (c == m) {
//					c = 0;
//					a[i] = 1;
//					b++;
////					System.out.println(i);
//					arrayList.add(i);
//				}
//			}
//		}
//		StringBuilder stringBuilder = new StringBuilder();
//
//		for (int i = 0; i < arrayList.size() - 2; i++) {
//			stringBuilder.append(arrayList.get(i)).append(" ");
//		}
//		stringBuilder.append(arrayList.get(arrayList.size()-2));
//		System.out.println(stringBuilder.toString());
//
//		System.out.println(arrayList.get(arrayList.size()-1));
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Node start = new Node(1);
		Node s = start;
		for (int i = 2; i <= n; i++) {
			Node node = new Node(i);
			start.next = node;
			start = node;
		}
		start.next = s;

		while (n-- > 1) {
			for (int j = 0; j < m - 1; j++) {
				s = s.next;
			}

		}

	}
}

class Node {
	int val;
	Node next = null;

	Node(int i) {
		val = i;
	}
}