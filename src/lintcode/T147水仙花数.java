package lintcode;

import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 15:35
 * @Description:
 **/
public class T147水仙花数 {
	public static void getNarcissisticNumbers(int n) {
		// write your code here
		Integer[] a = new Integer[n];
		int sum = 0;
		Double aa = Math.pow(10,n)-1;
		Double bb = Math.pow(10,n-1);
		System.out.println(aa);
		System.out.println(bb);
	}

	public static void main(String[] args) {
		getNarcissisticNumbers(2);
	}
}
