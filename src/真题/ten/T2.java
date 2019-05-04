package 真题.ten;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-02 19:30
 * @Description: https://www.nowcoder.com/question/next?pid=10611931&qid=161631&tid=22857608
 **/
public class T2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.valueOf(scanner.nextLine());
		Long sum = 0L;
		String[] strings;
		strings = scanner.nextLine().split(" ");
		int[] re = new int[n];
		for(int i=0;i<n;i++){
			re[i] = Integer.valueOf(strings[i]);
		}
		Arrays.sort(re);
		if((n&1)==0){
			for(int i=0;i<n;i++){
				if((i&1)==0){
					sum-=re[i];
				}else {
					sum+=re[i];
				}
			}
		}else {
			for(int i=0;i<n;i++){
				if((i&1)==0){
					sum+=re[i];
				}else {
					sum-=re[i];
				}
			}
		}
		System.out.println(sum);


//		System.out.println(Integer.MAX_VALUE > Math.pow(10,5));
//		System.out.println(Integer.MAX_VALUE > Math.pow(10,9));
//		System.out.println(Integer.MAX_VALUE > Math.pow(10,10));
//		System.out.println(Integer.MIN_VALUE);
	}
}
