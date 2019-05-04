package nowcoder.剑指offer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 18:57
 * @Description: 连续子数组的最大和
 *
 * 不要忘记考虑极限的情况,那就是所有的数都是负数
 **/
public class T30 {
	public static int FindGreatestSumOfSubArray(int[] array) {
//		int[] list = new int[array.length];
//		list[0] = array[0];

		for (int x : array) {
			if (x >= 0) {
				for (int i = 1; i < array.length; i++) {
					if (array[i - 1] < 0) {
						array[i - 1] = 0;
					} else {
						array[i] += array[i - 1];
					}
				}
				return Arrays.stream(array).max().getAsInt();
			}
		}
		return Arrays.stream(array).max().getAsInt();
	}


	public static void main(String[] args) {
		System.out.println(FindGreatestSumOfSubArray(new int[]{6, -3, -2, 7, -15, 1, 2, 2}));
		System.out.println(FindGreatestSumOfSubArray(new int[]{-2,-8,-1,-5,-9}));
	}
}
