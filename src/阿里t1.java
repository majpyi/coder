/**
 * @Author: Mr.M
 * @Date: 2019-04-12 19:49
 * @Description:
 **/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Main1111 {

/** 请完成下面这个函数，实现题目要求的功能 **/
	/**
	 * 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^
	 **/
	static String calculate(int m, int k) {
//	static void calculate(int m, int k) {
		long[] nums = new long[m + 1];
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 4;
		nums[4] = 5;
		nums[5] = 7;
		int j = 1;
		for (int i = 6; i <= m; i++) {
			nums[i] = nums[i - 1] + nums[j++];
		}
//		System.out.println(nums[m]);
//		System.out.println(Arrays.toString(nums));

		int a = 1, b = 1;
		int sum = 2;
		int year = 2019;
		while (sum < m) {
			sum += b;
			int x = a + b;
			a = b;
			b = x;
			year++;
		}

		HashMap<Long,Long> hashMap = new HashMap<>();
		PriorityQueue<Long> queue = new PriorityQueue<Long>((p, q) -> q.intValue() - p.intValue());
		long[] raw = nums.clone();
		for (Long i = 1L; i <= m; i++) {
			nums[i.intValue()] = reverse(nums[i.intValue()]);
			hashMap.put(nums[i.intValue()],i);
			queue.add(nums[i.intValue()]);
		}
			for(int i=0;i<k-1;i++){
				queue.poll();
			}
			Long x = queue.poll();
//		Arrays.sort(nums);
//		System.out.println(nums[nums.length-k]);

//		return raw[m]+","+year+","+hashMap.get(nums[nums.length-k]);
		return raw[m]+","+year+","+hashMap.get(x);

	}

	static int reverse(Long x) {
		String string = Long.toString(x);
		string = new StringBuilder(string).reverse().toString();
		return Integer.parseInt(string);
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line = in.nextLine().split(",");
		int m = Integer.valueOf(line[0]);
		int k = Integer.valueOf(line[1]);
//		calculate(m,k);
		System.out.println(calculate(m, k));

	}
}
