package lintcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-06-05 15:34
 * @Description:
 **/
public class T159寻找旋转排序数组中的最小值 {
	public int findMin(int[] nums) {
		// write your code here
		return Arrays.stream(nums).min().getAsInt();
	}
}
