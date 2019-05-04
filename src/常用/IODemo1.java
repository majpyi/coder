package 常用;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-03 09:05
 * @Description:
 **/
public class IODemo1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			String[] a = scanner.nextLine().split(" ");
			int n = Integer.valueOf(a[0]);
			int m = Integer.valueOf(a[1]);
			int[] re = new int[n];
			String[] re1;
			String[] chars;
			re1 = scanner.nextLine().split(" ");
			for (int i = 0; i < n; i++) {
				re[i] = Integer.valueOf(re1[i]);
			}
			for (int i = 0; i < m; i++) {
				chars = scanner.nextLine().split(" ");
				if (chars[0].equals("Q")) {
					int max = 0;
					int start = Math.min(Integer.valueOf(chars[1]) - 1, Integer.valueOf(chars[2]) - 1);
					int end = Math.max(Integer.valueOf(chars[1]) - 1, Integer.valueOf(chars[2]) - 1);
					for (int k = start; k <= end; k++) {
						if (re[k] > max) {
							max = re[k];
						}
					}
					System.out.println(max);
				} else {
					re[Integer.valueOf(chars[1]) - 1] = Integer.valueOf(chars[2]);
				}
			}
		}


	}





}
