package 笔试.acmcoder;

import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-10 18:36
 * @Description: http://exercise.acmcoder.com/online/online_judge_ques?ques_id=1659&konwledgeId=134
 **/
public class 公交车乘客 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num = 0;
		int max = 0;
		while (n--!=0){
			int xia = scanner.nextInt();
			int shang = scanner.nextInt();
			num+=(shang-xia);
			if(num>max){
				max=num;
			}
		}
		System.out.println(max);
	}
}
