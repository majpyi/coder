package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-04-15 16:12
 * @Description: https://leetcode-cn.com/problems/maximum-product-subarray/
 **/
public class T152乘积最大子序列 {
	public static int maxProduct(int[] nums) {
		System.out.println(Arrays.toString(nums));
		int[] min = new int[nums.length];
		min[0] = nums[0];
		int re = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			min[i] = Math.min(nums[i] * min[i - 1], nums[i] * nums[i - 1]);
			if (nums[i] > 0) {
				nums[i] = nums[i - 1] * nums[i];
			} else {
				nums[i] = min[i - 1] * nums[i];
			}
			nums[i] = Math.max(nums[i], temp);
			min[i] = Math.min(min[i], temp);
			re = Math.max(re, nums[i]);
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(min));
		return re;
	}

	public static int[] generateRandomArray(int len, int maxValue, int minValue) {
		int[] res = new int[len];
		for (int i = 0; i != res.length; i++) {
			res[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
		}
		return res;
	}



	//   错误 忘记考虑零的特殊情况
	public static int maxProduct1(int[] nums) {
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		int sum = 1;
		int neg = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>0){
				sum*=nums[i];
			}else {
				a.add(sum);   //  记录前面为正数时候的累乘
				a.add(nums[i]); //  记录当前的负数
				b.add(a.size()-1);  //  记录当前负数在集合中的index
				neg++;
				sum = 1;
			}
		}
		if(nums[nums.length-1]>0){
			a.add(sum);
		}
		int re = 1;
		if(neg%2==0){
			for(Integer x : a){
				re*=x;
			}
			return re;
		}else{
			int re1 = 1;
			for(int i=0;i<a.size();i++){
				if(i==b.get(b.size()-1)) {
					break;
				}
				re1*=a.get(i);
			}
			int re2 = 1;
			for(int i=a.size()-1;i>=0;i--){
				if(i==b.get(0)) break;
				re2*=a.get(i);
			}
			return Math.max(re1,re2);
		}
	}

	public static void main(String[] args) {
//		System.out.println(maxProduct(generateRandomArray(5, 10, -10)));
		System.out.println(maxProduct(new int[]{2, -5, -2, -4, 3}));
//		System.out.println(1.1%0.2);
	}

}
