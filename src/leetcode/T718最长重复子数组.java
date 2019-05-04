package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-21 20:00
 * @Description: https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
 **/
public class T718最长重复子数组 {

	public static int findLength(int[] A, int[] B) {
		int[][] re = new int[A.length + 1][B.length + 1];
//		System.out.println(A.length);
//		System.out.println(B.length);
//		for (int i = 1; i < re.length; i++) {
//			for (int j = 1; j < re[0].length; j++) {
//				System.out.print(re[i][j]+" ");
////				System.out.println(j);
//			}
//			System.out.println();
//		}

		int max = 0;
		boolean flag;
		for (int i = 0; i < re.length; i++) {
			re[i][0] = 0;
		}
		for (int i = 0; i < re[0].length; i++) {
			re[0][i] = 0;
		}
		for (int i = 1; i < re.length; i++) {
			flag = false;
			for (int j = 1; j < re[0].length; j++) {
				if (A[i-1] == B[j-1]) {
					flag = true;
					re[i][j] = Math.max(re[i - 1][j], re[i][j - 1]) + 1;
					if (re[i][j] > max) {
						max = re[i][j];
					}
				} else {
					re[i][j] = Math.max(re[i - 1][j], re[i][j - 1]);
//					re[i][j] = 0;
				}
			}
			if (!flag) {
				for (int j = 1; j < re[0].length - 1; j++) {
					re[i][j] = 0;
				}
			}
		}

		for (int i = 1; i < re.length; i++) {
			for (int j = 1; j < re[0].length; j++) {
				System.out.print(re[i][j]+" ");
			}
			System.out.println();
		}


		return max;
	}


	public static void main(String[] args) {
		int[] a = {1, 2, 3, 2, 1, 7, 2};
//		int[] b = {3, 2, 1, 4, 7, 1, 1, 2};
		int[] b = {3, 2, 1, 4, 7};
		findLength(a, b);
//		System.out.println("mjy".charAt());
	}

}
