package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-02-28 15:26
 * @Description: https://leetcode-cn.com/problems/number-of-1-bits/
 **/
public class 位1的个数191 {
	// you need to treat n as an unsigned value
	public int hammingWeight(int n) {
		int i = 0;
		return find1(n, i);
	}

	private int find1(int n, int i) {
		if (n != 0)  {
			n = n & (n - 1);
			i++;
			return find1(n, i);
		}
		return i;
	}


	public static void main(String[] args) {
		位1的个数191 a = new 位1的个数191();
		System.out.println(a.hammingWeight(7));
	}
}
