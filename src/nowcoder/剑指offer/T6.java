package nowcoder.剑指offer;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-05 22:00
 * @Description: 旋转数组中的最小数
 **/
public class T6 {
	public int minNumberInRotateArray(int[] array) {
		if (array.length == 0) {
			return 0;
		}
		return Arrays.stream(array).min().getAsInt();
	}

	public static int minNumberInRotateArray1(int[] array) {
		int start = 0;
		int end = array.length - 1;
		int mid = (start + end) / 2;
		while (start < end) {
			// 在前半部分
			if (array[mid] < array[start]) {
				if (mid - 1 >= 0 && array[mid - 1] <= array[mid]) {
					end = mid - 1;
				} else {
					end = mid;
				}
			}
			// 在后半部分
			else {
				if (mid + 1 <= array.length - 1 && array[mid + 1] >= array[mid]) {
					start = mid + 1;
				} else {
					start = mid;
				}
			}
			mid = (start + end) / 2;
			if(start+1==end){
				return Math.min(array[start],array[end]);
			}
		}
		return array[start];
	}

	public static void main(String[] args) {
		System.out.println(minNumberInRotateArray1(new int[]{3, 4, 5, 1, 2}));
	}
}
