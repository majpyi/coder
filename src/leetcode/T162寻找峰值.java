package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-27 15:35
 * @Description: https://leetcode-cn.com/problems/find-peak-element/
 **/
public class T162寻找峰值 {
	public int findPeakElement(int[] nums) {
		int[] numss = new int[nums.length+2];
		numss[0] = nums[0]-1;
		numss[numss.length-1] = nums[nums.length-1]-1;
		System.arraycopy(nums, 0, numss, 1, nums.length);
		for (int i=1;i<numss.length-1;i++){
			if(numss[i-1]<numss[i] && numss[i]>numss[i+1]){
				return i-1;
			}
		}
		return 0;
	}
}
