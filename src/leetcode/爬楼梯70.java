package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-02-28 17:19
 * @Description: https://leetcode-cn.com/problems/climbing-stairs/submissions/
 **/
public class 爬楼梯70 {
	static int[] re = new int[1000];
	static  {
		re[0] = 1;
		re[1] = 1;
		for(int i=2;i<1000;i++){
			re[i] = re[0] +re[1];
		}
	}

	public int climbStairs(int n) {
		return re[n];
	}
}
