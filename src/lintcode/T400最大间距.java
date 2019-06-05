package lintcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-04-08 19:40
 * @Description: https://www.lintcode.com/problem/maximum-gap/description
 **/
public class T400最大间距 {
//	public static int maximumGap(int[] nums) {
//		// write your code here
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		for (int x : nums) {
//			if (x < min) {
//				min = x;
//			}
//			if (x > max) {
//				max = x;
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);
//		int[] bucket = new int[(max - min + 1)];
////		int[] bucket = new int[(long) (max - min + 1)];
//		for (int x : nums) {
//			bucket[x-min] = 1;
//		}
//
//		int pre = 0;
//		int maxlength = 0;
//		for (int i = 1; i < bucket.length; i++) {
//			if(bucket[i]==1){
//				if((i-pre)>maxlength){
//					maxlength = i-pre;
//				}
//				pre = i;
//			}
//		}
//		return maxlength;
//	}


	public int maximumGap(int[] num) {
		if (num == null || num.length < 2) {
			return 0;
		}
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


	public static void main(String[] args) {
		int x = 2147483647;
		System.out.println(Integer.MAX_VALUE);
//		System.out.println(maximumGap(new int[]{2147483647,0}) );
	}
}
