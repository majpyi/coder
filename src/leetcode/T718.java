package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-05-23 09:01
 * @Description: https://leetcode-cn.com/problems/maximum-length-of-repeated-subarray/
 **/
public class T718 {
	public static int findLength(int[] A, int[] B) {
		int[][] re = new int[A.length+1][B.length+1];
		for (int i = 1; i <= A.length; i++) {
			for (int j = 1; j <= B.length; j++) {
				if (A[i-1] == B[j-1]) {
					re[i][j] = re[i - 1][j - 1] + 1;
				} else {
					re[i][j] = 0;
				}
			}
		}
		int max = 0;
		for(int i=0;i<=A.length;i++){
			System.out.println(Arrays.toString(re[i]));
			if(max<Arrays.stream(re[i]).max().getAsInt()){
				max = Arrays.stream(re[i]).max().getAsInt();
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println(findLength(new int[]{0,1,1,1,1},new int[]{1,0,1,0,1}));
	}
}
