package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-02 14:40
 * @Description: https://leetcode-cn.com/problems/powx-n/submissions/
 **/
public class T50Pow {
	public static double myPow(double x, int n) {
		if(n==0)
			return 1;
		if(x == 0)
			return 0;
		if(n<0)
			return 1/myPow(x,-n);
		if(n%2!=0)
			return x*myPow(x,n-1);
		return myPow(x*x,n/2);
	}

	public static void main(String[] args) {
//		System.out.println(myPow(1,-2147483648));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.pow(0,0));
	}
}


class Solution333 {
	public double myPow(double x, int n) {
		return myPow1(x,n);
	}
	public double myPow1(double x, long n) {
		if(n==0)
			return 1;
		if(x==0&&n!=0)
			return 0;
		if(n<0)
			return 1/myPow1(x,-n);
		if(n%2!=0)
			return x*myPow1(x,n-1);
		return myPow1(x*x,n/2);
	}
}