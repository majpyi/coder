package 华为.Y2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-17 21:20
 * @Description:
 **/
public class T4_17_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		int sum = in.nextInt();

		String[] strm = s1.split(",");
		String[] strn = s2.split(",");
		int[] m = new int[strm.length];
		int[] n = new int[strn.length];

		for (int i = 0; i < m.length; i++) {
			m[i] = Integer.valueOf(strm[i]);
			n[i] = Integer.valueOf(strn[i]);
		}

		multiSort(m, n);
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(n));
		for (int i = 0; i < m.length; i++) {
			if (n[i] - m[i] < 0) {
				continue;
			}
			if (sum >= m[i]) {
				sum += n[i] - m[i];
			}
		}

		System.out.println(sum);
	}

	public static void multiSort(int[] m, int[] n) {
		for (int i = 1; i < m.length; i++) {
			int tmpm = m[i], tmpn = n[i];

			int index = i - 1;
			while (index >= 0) {
				if (m[index] > tmpm) {
					m[index + 1] = m[index];
					n[index + 1] = n[index];
					index--;
				} else {
					break;
				}
			}
			m[index + 1] = tmpm;
			n[index + 1] = tmpn;
		}
	}
}
