package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-22 15:34
 * @Description: https://leetcode-cn.com/problems/palindrome-number/
 **/
public class T9回文数 {
	public static boolean isPalindrome(int x) {
		return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(123));
		System.out.println(isPalindrome(121));
	}
}
