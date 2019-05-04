package leetcode;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-03-27 09:17
 * @Description: https://leetcode-cn.com/problems/largest-number/
 **/
public class T179最大数 {
	public static String largestNumber(int[] nums) {

//		List<String> list = new ArrayList<>();
//
//		for (int x : nums ){
//			list.add(String.valueOf(x));
//		}
//
//		// 第一种排序方式
//		list.sort(new Comparator<String>() {
//			@Override
//			public int compare(String a, String b) {
//				return b.compareTo(a);
//			}
//		});
//		StringBuilder sb =new StringBuilder();
//		for(String s: list) {
//			sb.append(s);
//		}
//		return sb.toString();

//		PriorityQueue<String> priorityqueue = new PriorityQueue<>((a, b) -> b.compareTo(a));
		//  他是一个堆
//		PriorityQueue<String> priorityqueue = new PriorityQueue<>(nums.length,Comparator.reverseOrder());
		PriorityQueue<String> priorityqueue = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int x = 0;
				int l1 = o1.length();
				int l2 = o2.length();
				int y = 0;
				if(o1.equals(o2)){
					return 0;
				}
				while (o1.charAt(x%l1) == o2.charAt(y%l2) && x<=2*l1 && y<=2*l2) {
					x++;
					y++;
				}
				if(o2.charAt(y%l2)-o1.charAt(x%l1)==0){
					return o2.length()-o1.length();      //都一样
				}
				return o2.charAt(y%l2)-o1.charAt(x%l1);
//				if (x < o1.length() && y < o2.length())
//					return o2.charAt(y) - o1.charAt(x);
//				else
//					if(o2.length()>o1.length()){
////						return o2.charAt(x) - o1.charAt(x-1);
//						return o2.charAt(x) - o1.charAt(0);
//					}else if(o1.length()>o2.length()){
////						return o2.charAt(x-1) - o1.charAt(x);
//						return o2.charAt(0) - o1.charAt(x);
//					}else {
//						return 0;
//					}


			}
		});
//		PriorityQueue<String> priorityqueue = new PriorityQueue<>();
		for (int x : nums) {
//			priorityqueue.add(String.valueOf(x));
			priorityqueue.offer(String.valueOf(x));
		}
		StringBuilder sb = new StringBuilder();
//		for(String s: priorityqueue) {
//			sb.append(s);
//		}
		while (!priorityqueue.isEmpty()) {
			sb.append(priorityqueue.poll());
		}
		int i = 0;
//		while (sb.charAt(i)==0 && i<sb.length()-1){     //这里忘记转化为字符之后再进行比较
		while (sb.charAt(i) == '0' && i < sb.length() - 1) {
			i++;
		}
		return sb.substring(i);
	}

	public static void main(String[] args) {
//		System.out.println(largestNumber(new int[]{3, 30, 34, 5, 9}));
		System.out.println(largestNumber(new int[]{824, 8247}));
	}
}
