package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-21 21:42
 * @Description: https://www.lintcode.com/problem/backpack/description
 **/
public class T92背包问题 {
	/**
	 * @param m: An integer m denotes the size of a backpack
	 * @param A: Given n items with size A[i]
	 * @return: The maximum size
	 */
	public static int backPack(int m, int[] A) {
		// write your code here
		int[][] re = new int[A.length + 1][m + 1];
		for (int i = 1; i < re.length; i++) {
			for (int j = 1; j < re[0].length; j++) {
				if (j - A[i - 1] >= 0) {
					re[i][j] = Math.max(re[i - 1][j], re[i - 1][j - A[i - 1]] + A[i - 1]);
				} else {
					re[i][j] = re[i - 1][j];
				}
			}
		}
		for (int i = 1; i < re.length; i++) {
			for (int j = 1; j < re[0].length; j++) {
				System.out.print(re[i][j] + " ");
			}
			System.out.println();
		}
		return re[A.length][m];
	}

	public static void main(String[] args) {
		backPack(10, new int[]{3, 4, 8, 5});
	}
}
