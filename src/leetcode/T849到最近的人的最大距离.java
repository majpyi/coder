package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 21:23
 * @Description: https://leetcode-cn.com/problems/maximize-distance-to-closest-person/
 **/
public class T849到最近的人的最大距离 {
	public static int maxDistToClosest(int[] seats) {
		int[] re = new int[seats.length];
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 1) {
				int k = i;
				int tag = 1;
				while (--k >= 0 && seats[k] != 1 && ( tag <= re[k] || re[k]==0) ) {
					re[k] = tag;
					tag++;
				}
				k = i;
				tag = 1;
				while (++k < seats.length && seats[k] != 1 && ( tag <= re[k] || re[k]==0)) {
					re[k] = tag;
					tag++;
				}
			}
			System.out.println(Arrays.toString(re));
		}
		System.out.println(Arrays.toString(re));
		return Arrays.stream(re).max().getAsInt();
	}

	public static void main(String[] args) {
		System.out.println(maxDistToClosest(new int[]{0,1,0,1,0}));
	}
}
