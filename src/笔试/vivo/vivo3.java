package 笔试.vivo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-06-04 19:24
 * @Description:
 **/
public class vivo3 {

	public static void main(String[] args) {

		int total = 1000;

		int[] value = new int[]{200, 600, 100, 180, 300, 450};

		int[] hot = new int[]{6, 10, 3, 4, 5, 8};

		double[] w = new double[value.length];

		HashMap<Double, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < value.length; i++) {
			w[i] = hot[i] / (double) value[i];
			hashMap.put(w[i], i);
		}
		Arrays.sort(w);
		System.out.println(Arrays.toString(w));
		int sum = 0;
		while (total >= 0) {
			boolean a = false;
			for (int i = w.length - 1; i >= 0; i--) {
				if (value[hashMap.get(w[i])] <= total) {
					a = true;
					total -= value[hashMap.get(w[i])];
					sum += hot[hashMap.get(w[i])];
					System.out.println(hot[hashMap.get(w[i])]);
					break;
				}
			}
			if (!a) {
				break;
			}
		}

		System.out.println(sum);

	}

}


class test {

	public static int getMaxValue(int[] weight, int[] value, int w, int n) {
		int[][] table = new int[n + 1][w + 1];
		for (int i = 1; i <= n; i++) { //物品
			for (int j = 1; j <= w; j++) {  //背包大小
				if (weight[i - 1] > j) {
					//当前物品i的重量比背包容量j大，装不下，肯定就是不装
					table[i][j] = table[i - 1][j];
					// System.out.print(table[i][j]+ " ");
				} else { //装得下，Max{装物品i， 不装物品i}
					table[i][j] = Math.max(table[i - 1][j], table[i - 1][j - weight[i - 1]] + value[i - 1]);
					//System.out.print(table[i][j]+ " ");
				}
			}
			// System.out.println();
		}
		return table[n][w];
	}

	public static void main(String[] args) {

		int n = 6, w = 1000;                    //物品个数，背包容量
		int[] value = new int[]{6, 10, 3, 4, 5, 8};   //各个物品的价值
		int[] weight = new int[]{200, 600, 100, 180, 300, 450};    //各个物品的重量
		System.out.println(getMaxValue(weight, value, w, n));

	}
}
