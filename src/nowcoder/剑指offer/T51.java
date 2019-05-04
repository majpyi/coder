package nowcoder.剑指offer;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 12:43
 * @Description: 构建乘积数组
 **/
public class T51 {
	public int[] multiply(int[] A) {
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int sum = 1;
			for (int j = 0; j < B.length; j++) {
				if (j == i) {
					continue;
				}
				sum *= A[j];
			}
			B[i] = sum;
		}
		return B;
	}

	public static int[] multiply1(int[] A) {
		int length = A.length;
		int[] B = new int[length];
		if (length != 0) {
			B[0] = 1;
//计算下三角连乘
			for (int i = 1; i < length; i++) {
				B[i] = B[i - 1] * A[i - 1];
			}
			int temp = 1;
//计算上三角连乘
			for (int j = length - 2; j >= 0; j--) {
				temp *= A[j + 1];
				B[j] *= temp;
			}
		}
		return B;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(multiply1(new int[]{2,3,4,5})));
	}

}
