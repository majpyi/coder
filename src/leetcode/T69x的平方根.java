package leetcode;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * @Author: Mr.M
 * @Date: 2019-02-26 20:34
 * @Description: https://leetcode-cn.com/problems/sqrtx/solution/
 **/
public class T69x的平方根 {
//	public static int mySqrt(int x) {
//		if (x == 0 || x == 1) {
//			return x;
//		}
//		int l = 1, r = x, res = 0;
//		while (l <= r) {
//			int m = (l + r) / 2;
//			if (m == x / m) {
//				return m;
//			} else if (m > x / m) {
//				r = m - 1;
//			} else {
//				l = m + 1;
//				res = m;
//			}
//		}
//		return res;
//	}

	public static double mySqrt(double x) {
		if (x == 0 || x == 1) {
			return x;
		}
		double l = 0, r = x, res = 0;
		while (r - l > 0.0000001) {
//		while (r - l > 0.00000000000000001) {
			double m = (l + r) / 2;
			if (m == x / m) {
				return m;
			} else if (m > x / m) {
//				r = m - 1;
				r = m;
			} else {
//				l = m + 1;
				l = m;
//				res = m;
			}
		}
		return (r+l)/2;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.000000");
		System.out.println(df.format(mySqrt(8)));
		System.out.println(df.format(Math.sqrt(8)) );

	}
}
