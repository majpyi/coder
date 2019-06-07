package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-02-28 15:26
 * @Description: https://leetcode-cn.com/problems/number-of-1-bits/
 **/
public class T191位1的个数 {
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
		T191位1的个数 a = new T191位1的个数();
		System.out.println(a.hammingWeight(7));
	}
}
