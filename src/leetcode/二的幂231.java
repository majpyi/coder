package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-02-28 15:35
 * @Description: https://leetcode-cn.com/problems/power-of-two/
 **/
public class 二的幂231 {
	public boolean isPowerOfTwo(int n) {

	//  三种写法
	return n > 0 && (n & (n - 1)) == 0;


//	return 	n > 0 ? (n & (n - 1)) == 0 : false;


//	return 	(n & (n - 1)) == 0;
//		if (n==0){
//			return true;
//		}
//		else{
//			return false;
//		}
//		return n == 0;
	}
}
