package 笔试.蘑菇街19实习;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-09 18:33
 * @Description:
 **/
public class T1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] string = scanner.nextLine().split(",");
		int[] x = new int[string.length];
		for (int i = 0; i < x.length; i++) {
			x[i] = Integer.valueOf(string[i]);
		}
		int[] t = x.clone();
		Arrays.sort(t);
//		System.out.println(Arrays.toString(x));
//		System.out.println(Arrays.toString(t));
		int tag = t[0];
		int[] fen = new int[x.length];
		for (int k = 0; k < x.length; k++) {
			if (x[k] == tag) {
				fen[k] = 1;
			}
		}

		for (int i = 1; i < t.length; i++) {
			while (t[i] == tag) {
				i++;
			}
			tag = t[i];
			for (int j = 0; j < x.length; j++) {
				if (x[j] == tag) {
					int a1 = 0;
					int a2 = 0;
					if (j - 1 >= 0) {
						a1 = fen[j - 1];
					} else a1 = 0;
					if (j + 1 < x.length) {
						a2 = fen[j + 1];
					} else a2 = 0;
					fen[j] = Math.max(a1, a2) + 1;
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < t.length; i++) {
			sum += fen[i];
		}
//		System.out.println(Arrays.toString(fen));
		System.out.println(sum);
	}
}
