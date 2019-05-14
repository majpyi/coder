package 笔试.三六零;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-24 18:55
 * @Description:
 **/
public class T2 {
	static int fun(int a, int b) {
		if (b == 0) return a;
		return a % b == 0 ? b : fun(b, a % b);
	}

	static int main(int num, int[] nums) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (Integer k : nums) {
			if (hashMap.containsKey(k)) {
				hashMap.put(k, hashMap.get(k) + 1);
			} else {
				hashMap.put(k, 1);
			}
		}
		int g = 0;
		int c = 0;
//		System.out.println(hashMap);
		for (Integer b : hashMap.keySet()) {
			g = hashMap.get(b);
			c = b;
			break;
		}
		hashMap.remove(c);
//		System.out.println(hashMap.values());
//		System.out.println(g);
		int tag = 0;
		for (Integer x : hashMap.values()) {
//			System.out.println(x);
//			System.out.println(g);
			int temp = g;
			g = fun(x, g);
			if(tag>0){
				g = Math.max(g, temp);
			}
			tag++;
		}
//		System.out.println(g);
		if (g == 1) {
			return 0;
		} else {
			return num / g;
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] nums = new int[num];
		for(int i=0;i<num;i++){
			nums[i] = in.nextInt();
		}
		int res;
		res = main(num, nums);
		System.out.println(String.valueOf(res));
	}
}
