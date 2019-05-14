package 笔试.华为.Y2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-17 21:20
 * @Description:
 **/
public class T4_17_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[] jobs = new int[n];
		for (int i = 0; i < n; i++) {
			jobs[i] = in.nextInt();
		}

		Arrays.sort(jobs);
		if (m >= n) {
			System.out.println(jobs[jobs.length - 1]);
			return;
		}

		int[] cpu = new int[m];
		for (int i = 0; i < m; i++) {
			cpu[i] = jobs[i];
		}
		for (int i = m; i < jobs.length; i++) {
			int index = getMin(cpu);
			cpu[index] += jobs[i];
		}

		System.out.println(cpu[getMax(cpu)]);
		System.out.println(Arrays.stream(cpu).max().getAsInt());
	}

	public static int getMin(int[] cpu) {
		int index = 0;
		for (int i = 1; i < cpu.length; i++) {
			if (cpu[i] < cpu[index]) {
				index = i;
			}
		}
		return index;
	}

	public static int getMax(int[] cpu) {
		int index = 0;
		for (int i = 1; i < cpu.length; i++) {
			if (cpu[i] > cpu[index]) {
				index = i;
			}
		}
		return index;
	}
}
