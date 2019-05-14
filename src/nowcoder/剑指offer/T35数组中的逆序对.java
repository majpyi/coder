package nowcoder.剑指offer;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 15:01
 * @Description: 数组中的逆序对
 **/
public class T35数组中的逆序对 {
	static Long num;

	public static int InversePairs(int[] array) {
		num = 0L;
		mergeSort(array, 0, array.length - 1);
		return (int)(num%1000000007);
	}

	public static void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[high - low + 1];
		int i = low;// 左指针
		int j = mid + 1;// 右指针
		int k = 0;
		// 把较小的数先移到新数组中
		while (i <= mid && j <= high) {
			if (a[i] < a[j]) {
				temp[k++] = a[i++];
			} else {
				//当前j与i到前半部的数字是逆序的
				num += (mid + 1 - i);
				temp[k++] = a[j++];
			}
		}
		// 把左边剩余的数移入数组
		while (i <= mid) {
			temp[k++] = a[i++];
		}
		// 把右边边剩余的数移入数组
		while (j <= high) {
			temp[k++] = a[j++];
		}
		// 把新数组中的数覆盖nums数组
		for (int k2 = 0; k2 < temp.length; k2++) {
			a[k2 + low] = temp[k2];
		}
	}

	public static void mergeSort(int[] a, int low, int high) {
//		int mid = (low + high) / 2;
		int mid = (low + high) / 2;
		if (low < high) {
			// 左边
			mergeSort(a, low, mid);
			// 右边
			mergeSort(a, mid + 1, high);
			// 左右归并
			merge(a, low, mid, high);
//			System.out.println(Arrays.toString(a));
		}
	}


	public static void main(String[] args) {

		System.out.println(InversePairs(new int[]{4,4,2}));
	}
}
