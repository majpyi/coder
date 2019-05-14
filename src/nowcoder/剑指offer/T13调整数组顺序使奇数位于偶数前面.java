package nowcoder.剑指offer;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 09:01
 * @Description: 调整数组顺序使奇数位于偶数前面
 **/
public class T13调整数组顺序使奇数位于偶数前面 {
	//  不能,相对位置会变,改变的只是引用
//	public static void reOrderArray(int[] array) {
//		int[] newarr = new int[array.length];
//		int r = array.length - 1;
//		int l = 0;
//		for (int i = 0; i < array.length; i++) {
//			if ((array[i] & 1) == 1) {
//				newarr[l] = array[i];
//				l++;
//			}
//		}
//		for (int i = array.length - 1; i >= 0; i--) {
//			if ((array[i] & 1) == 0) {
//				newarr[r] = array[i];
//				r--;
//			}
//		}
//		array = newarr;
//	}

	public static void reOrderArray1(int[] array) {
		int[] newarr = new int[array.length];
		int r = array.length - 1;
		int l = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 1) {
				newarr[l] = array[i];
				l++;
			}
		}
		for (int i = array.length - 1; i >= 0; i--) {
			if ((array[i] & 1) == 0) {
				newarr[r] = array[i];
				r--;
			}
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = newarr[i];
		}

	}

	// 找到第一个偶数的位置看后面还有没有奇数
	// 把因为交换了奇偶的位置
	// 把后面的奇数放到偶数的位置,这样奇数的位置的相对位置是不变的
	// 但是偶数的相对位置改变了,需要把当前偶数一次交换到,当前范围内的第一个偶数的位置
	public static void reOrderArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 0) {  // 如果是偶数
				for (int j = i + 1; j < array.length; j++) {
					if ((array[j] & 1) == 1) {   // 在偶数后面寻找一个奇数
						swap(array, i, j);        // 把奇数放到偶数的位置
						for (int k = j - 1; k > i; k--) {  // 把奇数放到偶数的位置
							if ((array[k] & 1) == 0) {
								swap(array, k, j);
								j = k;
							}
						}
						break;
					}
				}
			}
		}
	}

	private static void swap(int[] array, int k, int j) {
		int temp;
		temp = array[j];
		array[j] = array[k];
		array[k] = temp;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5, 6, 7};
		reOrderArray(a);
		System.out.println(Arrays.toString(a));
	}

}
