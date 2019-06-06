package lintcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-06-06 16:39
 * @Description: https://www.jiuzhang.com/solution/legal-article/
 **/
public class T1650合法文章 {
	public static int count(String s) {
		// Write your code here.
		String[] re = s.split("\\.");
		System.out.println(Arrays.toString(re));
		int sum = 0;
		for (String x : re) {
			if (Character.isLowerCase(x.trim().charAt(0))) {
				sum++;
//				System.out.println(1);
			}

			String[] tmp = x.split("\\s+");
			for (String a : tmp) {
				for (int i = 1; i < a.trim().length(); i++) {
//				for (int i = 1; i < a.length(); i++) {
					if (Character.isUpperCase(a.trim().charAt(i))) {
//					if (Character.isUpperCase(a.charAt(i))) {
						sum++;
					}
				}
			}

		}
		return sum;
	}


	public int count1(String s) {
		// Write your code here.
		boolean st = true;
		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (st && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				ans++;
			}
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				st = false;
			}
			if (s.charAt(i) == '.') {
				st = true;
			}
			if (i > 0 && (s.charAt(i - 1) >= 'a' && s.charAt(i - 1) <= 'z' || s.charAt(i - 1) >= 'A' && s.charAt(i - 1) <= 'Z') && s.charAt(i) >= 'A' &&
				s.charAt(i) <= 'Z') {
				ans++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(count("This won iz correkt. It has, No Mistakes et Oll. But there are two BIG mistakes in" +
			" " +
			"this sentence. and here is one more."));
	}
}
