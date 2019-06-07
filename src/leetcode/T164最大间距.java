package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-06-07 14:17
 * @Description:
 **/
public class T164最大间距 {
	/**
	 * 如果数组的长度很小但是相差很大的时候可能会造成内存溢出
	 *
	 * @param nums
	 * @return
	 */
	public static int maximumGap(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int x : nums) {
			if (x < min) {
				min = x;
			}
			if (x > max) {
				max = x;
			}
		}
		int[] bucket = new int[(max - min + 1)];
		for (int x : nums) {
			bucket[x - min] = 1;
		}

		int temp = 0;
		int maxlength = 0;
		for (int i = 1; i < bucket.length; i++) {
			if (bucket[i] == 0) {
				temp++;
			} else {
				maxlength = Math.max(maxlength, temp);
				temp = 0;
			}
		}
		return maxlength + 1;
	}

	public static int maximumGap1(int[] num) {
		if (num == null || num.length < 2)
			return 0;
		// get the max and min value of the array
		int min = num[0];
		int max = num[0];
		for (int i : num) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		// the minimum possibale gap, ceiling of the integer division
		int gap = (int) Math.ceil((double) (max - min) / (num.length - 1));
		int[] bucketsMIN = new int[num.length - 1]; // store the min value in that bucket
		int[] bucketsMAX = new int[num.length - 1]; // store the max value in that bucket
		Arrays.fill(bucketsMIN, Integer.MAX_VALUE);
		Arrays.fill(bucketsMAX, Integer.MIN_VALUE);
		// put numbers into buckets
		for (int i : num) {
			if (i == min || i == max)
				continue;
			int idx = (i - min) / gap; // index of the right position in the buckets
			bucketsMIN[idx] = Math.min(i, bucketsMIN[idx]);
			bucketsMAX[idx] = Math.max(i, bucketsMAX[idx]);
		}
		// scan the buckets for the max gap
		int maxGap = Integer.MIN_VALUE;
		int previous = min;
		for (int i = 0; i < num.length - 1; i++) {
			if (bucketsMIN[i] == Integer.MAX_VALUE && bucketsMAX[i] == Integer.MIN_VALUE)
				// empty bucket
				continue;
			// min value minus the previous value is the current gap
			maxGap = Math.max(maxGap, bucketsMIN[i] - previous);
			// update previous bucket value
			previous = bucketsMAX[i];
		}
		maxGap = Math.max(maxGap, max - previous); // updata the final max value gap
		return maxGap;
	}


	public static int maximumGap2(int[] num) {
		if (num == null || num.length < 2)
			return 0;
		// get the max and min value of the array
		int min = num[0];
		int max = num[0];
		for (int i : num) {
			min = Math.min(min, i);
			max = Math.max(max, i);
		}
		// the minimum possibale gap, ceiling of the integer division
		int gap = (int) Math.ceil((double) (max - min) / (num.length - 1));
		int[] bucketsMIN = new int[num.length + 1]; // store the min value in that bucket
		int[] bucketsMAX = new int[num.length + 1]; // store the max value in that bucket
		Arrays.fill(bucketsMIN, Integer.MAX_VALUE);
		Arrays.fill(bucketsMAX, Integer.MIN_VALUE);
		// put numbers into buckets
		// 这样写的问题是如果最大值和最小值的大小是一致的该怎么办
		for (int i : num) {
			if (i == min || i == max) {
				if (i == min) {
					bucketsMAX[0] = Math.max(i, bucketsMAX[0]);
					bucketsMIN[0] = min;
				}
				if (i == max) {
					bucketsMAX[bucketsMAX.length - 1] = max;
					bucketsMIN[bucketsMIN.length - 1] = Math.min(i, bucketsMIN[bucketsMIN.length - 1]);
				}
				continue;
			}

			int idx = (i - min) / gap; // index of the right position in the buckets
			bucketsMIN[idx] = Math.min(i, bucketsMIN[idx]);
			bucketsMAX[idx] = Math.max(i, bucketsMAX[idx]);
		}

		System.out.println(Arrays.toString(bucketsMAX));
		System.out.println(Arrays.toString(bucketsMIN));

		int maxGap = Integer.MIN_VALUE;
		int previous = bucketsMAX[0];
		for (int i = 1; i < bucketsMAX.length; i++) {
			if (bucketsMIN[i] == Integer.MAX_VALUE && bucketsMAX[i] == Integer.MIN_VALUE)
				continue;
			maxGap = Math.max(maxGap, bucketsMIN[i] - previous);
			previous = bucketsMAX[i];
		}
		return maxGap;
	}


	public static void main(String[] args) {
//		System.out.println(maximumGap2(new int[]{3, 6, 9, 1}));
//		System.out.println(maximumGap2(new int[]{1, 10000000}));
		System.out.println(maximumGap2(new int[]{1, 1, 1, 1}));
	}
}
