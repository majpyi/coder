package 手撕.sort;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 10:02
 * @Description:
 **/
public class QuickSort {
//	public static void quickSort(int[] arr) {
//		qsort(arr, 0, arr.length - 1);
//	}
//
//	private static void qsort(int[] arr, int low, int high) {
//		if (low < high) {
//			int pivot = partition(arr, low, high);        //将数组分为两部分
//			qsort(arr, low, pivot - 1);                   //递归排序左子数组
//			qsort(arr, pivot + 1, high);                  //递归排序右子数组
//		}
//	}
//
//	private static int partition(int[] arr, int low, int high) {
//		int pivot = arr[low];     //枢轴记录
//		while (low < high) {
//			while (low < high && arr[high] >= pivot) --high;
//			arr[low] = arr[high];             //交换比枢轴小的记录到左端
//			while (low < high && arr[low] <= pivot) ++low;
//			arr[high] = arr[low];           //交换比枢轴大的记录到右端
//		}
//		//扫描完成，枢轴到位
//		arr[low] = pivot;
//		//返回的是枢轴的位置
//		return low;
//	}


	public static void main(String[] args) {
		int[] t = new int[]{4, 5, 3, 2, 1};
		quickSort(t);
		System.out.println(Arrays.toString(t));
	}

	//	private static void quickSort(int[] t) {
//		qsort(t, 0, t.length - 1);
//	}
//
//	private static void qsort(int[] t, int l, int r) {
//		if (l < r) {
//			int pivot = partition(t, l, r);
//			qsort(t, l, pivot - 1);
//			qsort(t, pivot + 1, r);
//		}
//	}
//
//	private static int partition(int[] t, int l, int r) {
//		int pivot = t[l];
//		while (l < r) {
//			while (t[r] >= pivot && l < r) {
//				r--;
//			}
//			t[l] = t[r];
//			while (t[l] <= pivot && l < r) {
//				l++;
//			}
//			t[r] = t[l];
//		}
//		t[l] = pivot;
//		return l;
//	}
	static void quickSort(int[] t) {
		qsort(t, 0, t.length - 1);
	}

	static void qsort(int[] t, int l, int r) {
		if (l < r) {
			int pivot = partition(t, l, r);
			qsort(t, pivot + 1, r);
			qsort(t, l, pivot - 1);
		}
	}

	static int partition(int[] t, int l, int r) {
		int pivot = t[l];
		while (l < r) {
			while (t[r] >= pivot && l < r) {
				r--;
			}
			t[l] = t[r];
			while (t[l] <= pivot && l < r) {
				l++;
			}
			t[r] = t[l];
		}
		t[l] = pivot;
		return l;
	}

}
