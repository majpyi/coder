package 笔试.微众;

import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 19:47
 * @Description:
 **/
public class T3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int i=0;i<t;i++){
			int n = scanner.nextInt();
			int num = 0;
			while (n!=1){
				num++;
				if(n%2==1){
					n=3*n+1;
				}else {
					n = n/2;
				}
			}
			System.out.println(num);
		}
	}
}
