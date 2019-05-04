package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 17:08
 * @Description: https://leetcode-cn.com/problems/maximum-subarray/submissions/
 **/
public class T53最大子序和 {
	public int maxSubArray(int[] nums) {
		for(int i=1;i<nums.length;i++){
			if(nums[i-1]<=0){
				nums[i] = nums[i];
			}else{
				nums[i] += nums[i-1];
			}
		}
		return Arrays.stream(nums).max().getAsInt();
	}
}
