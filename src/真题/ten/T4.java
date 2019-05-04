package 真题.ten;

import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-02 20:28
 * @Description: https://www.nowcoder.com/question/next?pid=10611931&qid=161633&tid=22857608
 **/
public class T4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = Integer.valueOf(scanner.nextLine());
		int a = scanner.nextInt();
		int x = scanner.nextInt();
		int b = scanner.nextInt();
		int y = scanner.nextInt();
		Long sum = 0L;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (i * a + j * b == k) {
					Long num1 = 1L;
					Long num2 = 1L;
					for (int m = 0; m < i; m++) {
						num1 *= (x - m);
					}
					for (int m = 0; m < j; m++) {
						num2 *= (y - m);
					}
					sum += num1 * num2;
				}
			}
		}
		System.out.println(sum % 1000000007);
	}
}
