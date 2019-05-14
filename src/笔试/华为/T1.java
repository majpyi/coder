package 笔试.华为;

import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-03-27 19:42
 * @Description:
 **/
public class T1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = Integer.valueOf(scanner.nextLine());
		int num = 0;
		String string = scanner.nextLine();
		int k = 0;
		while (k < string.length()) {
			if (string.charAt(k) == '0') {
				if(num==x-1){
					System.out.print(new StringBuilder(string.substring(k + 1, k + 9)).reverse().toString());
				}else {
					System.out.print(new StringBuilder(string.substring(k + 1, k + 9)).reverse().toString()+" ");
				}
				num++;
			} else if (string.charAt(k) == '1') {
				if(num==x-1) {
					System.out.print(string.substring(k + 1, k + 9));
				}else {
					System.out.print(string.substring(k + 1, k + 9) + " ");
				}
				num++;
			}
			k = k + 9;
		}
	}
}
