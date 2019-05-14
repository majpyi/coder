package 笔试.腾讯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-05 20:16
 * @Description:
 **/
public class T1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[] coin = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			coin[i] = scanner.nextInt();
		}
		Arrays.sort(coin);

		int[][] dp = new int[n + 1][m + 1];
//		for (int i = 0; i <= n; i++) dp[i][0] = 0;
		for (int i = 0; i <= m; i++) dp[0][i] = Integer.MAX_VALUE - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				dp[i][j] = Integer.MAX_VALUE - 1;
			}
		}
		ArrayList<ArrayList<Integer>> arrayLists;


		System.out.println(Arrays.toString(coin));
		for (int i = 1; i <= n; i++) {
			arrayLists = new ArrayList<>();
			for (int j = 1; j <= m; j++) {

				if (j - coin[i] >= 0) {
					dp[i][j] = Math.min(dp[i][j - coin[i]] + 1, dp[i - 1][j]);
//					arrayLists.get(arrayLists.get(j - coin[i]));
				} else {
					dp[i][j] = dp[i - 1][j];
				}


			}
		}

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= m; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

		if (dp[n][m] == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(dp[n][m]);
		}


	}
}
