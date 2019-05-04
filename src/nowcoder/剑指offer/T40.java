package nowcoder.剑指offer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 15:24
 * @Description: 数组中只出现一次的数字
 * //num1,num2分别为长度为1的数组。传出参数
 * //将num1[0],num2[0]设置为返回结果
 **/
public class T40 {
	public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int x : array) {
			if (hashMap.containsKey(x)) {
				hashMap.put(x, hashMap.get(x) + 1);
			} else {
				hashMap.put(x, 1);
			}
		}
		for (Integer x : hashMap.keySet()) {
			if (hashMap.get(x) == 1) {
				num1[0] = x;
			}
//			hashMap.remove(x);   //  java.util.ConcurrentModificationException
		}
		hashMap.remove(num1[0]);
		for (Integer x : hashMap.keySet()) {
			if (hashMap.get(x) == 1) {
				num2[0] = x;
			}
		}
	}

	public static void FindNumsAppearOnce1(int[] array, int num1[], int num2[]) {
		int t = array[0];
		for (int i = 1; i < array.length; i++) {
			t = array[i] ^ t;
		}
		ArrayList<Integer> a =new ArrayList<>();
		ArrayList<Integer> b =new ArrayList<>();
		for (int x : array) {
			if (((t & -t) & x) == 0) {
				a.add(x);
			}else {
				b.add(x);
			}
		}
		t = a.get(0);
		for (int i = 1; i < a.size(); i++) {
			t = a.get(i) ^ t;
		}
		num1[0] = t;
		t = b.get(0);
		for (int i = 1; i < b.size(); i++) {
			t = b.get(i) ^ t;
		}
		num2[0] = t;
	}


	public static void main(String[] args) {
		int[] a = new int[1];
		int[] b = new int[1];
		FindNumsAppearOnce(new int[]{1, 1, 2, 3}, a, b);
		System.out.println(a[0]);
		System.out.println(b[0]);
		FindNumsAppearOnce1(new int[]{1, 1, 2, 3}, a, b);
		System.out.println(a[0]);
		System.out.println(b[0]);

	}
}
