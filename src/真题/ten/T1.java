package 真题.ten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-02 19:04
 * @Description: https://www.nowcoder.com/test/question/cc0a71a1dfdb4c64a3ffe000f71ae12c?pid=10611931&tid=22857608
 **/
public class T1 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
////		ArrayList<Integer> arraylist = new ArrayList<>();
////		int n = scanner.nextLine().split(" ")
//		int n = scanner.nextInt();
////		scanner.nextInt();
//		int m = scanner.nextInt();
//		int tag = 1;
//		Long sum = 0L;
//		for (int i = 1; i <= n;) {
//			for (int j = 0; j < m; j++, i++) {
//				if ((tag & 1) == 1) {
////					arraylist.add(-i);
//					sum += -i;
//				} else {
////					arraylist.add(i);
//					sum += i;
//				}
//			}
//			tag++;
//		}
//		System.out.println(sum);
//		System.out.println(59999225951L>Integer.MAX_VALUE);
////		System.out.println(arraylist);
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Long n = scanner.nextLong();
		Long m = scanner.nextLong();
		Long sum = n/m/2*(m*m);
		System.out.println(sum);

	}

}
