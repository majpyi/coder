package lintcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-06-05 14:58
 * @Description:
 **/
public class T1670回合制游戏 {
	public static long getAns(int[] atk) {
		// Write your code here
		Arrays.sort(atk);
		long sum = 0;
		for (int x : atk) {
			sum += x;
		}
		long re = 0;
		for (int i = atk.length - 2; i >= 0; i--) {
			re += (sum -= atk[i + 1]);
		}
		return re;
	}

	public static void main(String[] args) {
		System.out.println(getAns(new int[]{19, 3}));
	}
}
