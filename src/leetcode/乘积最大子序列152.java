package leetcode;

import java.util.ArrayList;

/**
 * @Author: Mr.M
 * @Date: 2019-02-28 17:37
 * @Description: https://leetcode-cn.com/problems/maximum-product-subarray/
 **/
public class 乘积最大子序列152 {

	//   错误 忘记考虑零的特殊情况
	public static int maxProduct(int[] nums) {
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
				if(i==b.get(b.size()-1)) break;
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
		System.out.println(maxProduct(new int[]{2,3,-2,4,2}));
	}
}
