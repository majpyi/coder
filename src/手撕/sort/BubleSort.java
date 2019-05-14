package 手撕.sort;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-05-05 20:40
 * @Description:
 **/
public class BubleSort {
	public static int[] sort(int[] arr) {
		int tag = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			tag = 1;
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					tag = 0;
				}
			}
			if (tag == 1) {
				return arr;
			}
		}
		return arr;
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}


	public static void main(String[] args) {
		System.out.println(Arrays.toString(sort(new int[]{6, 5, 4, 3, 2, 1})));
		System.out.println(Arrays.toString(sort(new int[]{1, 2, 3})));
	}
}
