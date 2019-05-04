package leetcode;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-04-16 20:57
 * @Description:
 **/
public class T41缺失的第一个正数 {
	public static int firstMissingPositive(int[] nums) {
		for (int i=0;i<nums.length;i++){
			if(nums[i]<=0 || nums[i]>nums.length){
				nums[i] = -1;
			}else {
				if(nums[i]==i+1){
					continue;
				}
				int tag = -2;
				int a = i;
				while (tag != -1){
					tag =  swap(nums, a);
					a = tag;
				}
			}
		}

		System.out.println(Arrays.toString(nums));
		for (int i=0;i<nums.length;i++){
			if(nums[i]!=i+1){
				return i+1;
			}
		}
		return nums.length+1;
	}

	private static int swap(int[] nums, int i) {
		if(nums[i]==i+1 || nums[i]==-1){
			return -1;
		}
		int temp = nums[nums[i]-1];
		nums[nums[i]-1] =  nums[i];
		nums[i] = temp;
		if(nums[i]==temp){
			return -1;
		}
		return i;
	}

	public static void main(String[] args) {
		System.out.println(firstMissingPositive(new int[]{3,4,-1,1}));
	}

}
