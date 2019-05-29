import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-05-17 17:12
 * @Description:
 **/
public class T {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<Integer>numsa = new ArrayList<>();
		ArrayList<Integer>numsb = new ArrayList<>();
		for (int i=0;i<n;i++){
			int temp = scanner.nextInt();
			numsa.add(temp);
			numsb.add(temp);
		}

		Collections.sort(numsa);
		Collections.sort(numsb);
		int max = 0;
		int min = 0;
		int a = 0;
		int b = 0;

		//最中间的两个数相乘得最大
		//最大乘以最小得最小
		while (numsa.size()>1){
			a = numsa.get(numsa.size()-1);
			b = numsa.get(numsa.size()-2);
			numsa.remove(numsa.size()-1);
			numsa.remove(numsa.size()-1);
			numsa.add(a*b+1) ;
		}
		min = numsa.get(0);
//		System.out.println(max);

		while (numsb.size()>1){
			a = numsb.get(0);
			b = numsb.get(1);
			numsb.remove(0);
			numsb.remove(0);
//			System.out.println(numsb);
			numsb.add(0,a*b+1) ;
		}
		max = numsb.get(0);
//		System.out.println(min);
		System.out.println(Math.abs(max-min));

	}
}
