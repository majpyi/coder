package lintcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 14:33
 * @Description:
 **/
public class T1095最大的交换 {
	public static int maximumSwap(int num) {
		char[] digits = Integer.toString(num).toCharArray();

		int[] buckets = new int[10];
		for (int i = 0; i < digits.length; i++) {
			buckets[digits[i] - '0'] = i;
			System.out.println(digits[i] - '0' + "  " + i);
		}

		// 索引代表数字大小,而数值代表所在的位数
		System.out.println(Arrays.toString(buckets));


		for (int i = 0; i < digits.length; i++) {
			// 从大数往小数排,并且这个大数要大于当前数的位置的数值,数字的大小
			for (int k = 9; k > digits[i] - '0'; k--) {
				// buckets[k]与i都表示的位数,如果if成立表示现在有当前大于i位的位数,说明大数在高位,需要进行交换,而前一步的逆序,保证了这个数是当前所有数值中最大的
				if (buckets[k] > i) {
					System.out.println(k + " " + i);
					char tmp = digits[i];
					digits[i] = digits[buckets[k]];
					digits[buckets[k]] = tmp;
					return Integer.valueOf(new String(digits));
				}
			}
		}

		return num;
	}

	public static void main(String[] args) {
		System.out.println(maximumSwap(2736));
	}
}
