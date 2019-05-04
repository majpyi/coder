package 手撕;

import java.util.Random;

/**
 * @Author: Mr.M
 * @Date: 2019-04-25 09:37
 * @Description:
 **/
class RandomAlgor {

	static int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

	public static void main(String[] args) {
		fisherYatesShuffle(A);
		System.out.println("打乱后的数组");
		arrayPrint(A);
		System.out.println(new Random().nextInt(100));
	}

	/**
	 * 数组随机排序：洗牌算法(Fisher–Yates shuffle  费雪-耶兹洗牌算法)
	 *
	 * @param A
	 */
	public static void fisherYatesShuffle(int[] A) {

		int rand = 0;
		int swap = 0;
		int n = A.length;

		Random util = new Random();

		for (int i = n - 1; i > 0; i--) {
			rand = Math.abs(util.nextInt() % (i + 1));// 随机生成一个待置换的数组下标,它的范围是[0,i]
			if (rand != i) {
				swap = A[i];
				A[i] = A[rand];
				A[rand] = swap;
			}
		}
	}

	public static void arrayPrint(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
	}
}
