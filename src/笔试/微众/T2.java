package 笔试.微众;

import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 18:27
 * @Description:
 **/
public class T2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int m = scanner.nextInt();
		if (m < n) {
			int time = ((n * k - 1) / m + 1);
			System.out.println(time);
		} else {
//			int time = ((n - 1) / m + 1) * k;
			System.out.println(k);
		}
	}
}
