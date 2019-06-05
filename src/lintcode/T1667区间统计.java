package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-05 14:44
 * @Description:
 **/
public class T1667区间统计 {
	public static long intervalStatistics(int[] arr, int k) {
		// Write your code here.
		long re = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				continue;
			}
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 1) {
					continue;
				}
				if (verify(arr, i, j, k)) {
					re++;
				}
			}
		}
		return re;
	}

	private static boolean verify(int[] arr, int i, int j, int k) {
//		if (arr[i] == 1 || arr[j] == 1) {
//			return false;
//		}
		int sum = 0;
		for (int a = i; a <= j; a++) {
			if (arr[a] == 1) {
				sum++;
			}
		}
		if (sum <= k) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(intervalStatistics(new int[]{0, 0, 1, 0, 1, 1, 0}, 1));
	}


	public long intervalStatistics1(int[] arr, int k) {
		if (arr == null || arr.length == 0) {
			return 0;
		}

		int left = 0, right = 0;
		long numOfOne = 0, sum = 0;

		while (right < arr.length) {
			if (arr[right] == 1) {
				numOfOne++;
				right++;
				continue;
			}

			if (arr[left] == 1) {
				numOfOne--;
				left++;
				continue;
			}

			while (numOfOne > k) {
				if (arr[left] == 1) {
					numOfOne--;
				}
				left++;
			}

			sum += right - left + 1 - numOfOne;

			right++;

		}

		return sum;
	}

}
