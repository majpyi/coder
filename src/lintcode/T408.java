package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 10:00
 * @Description: https://www.lintcode.com/problem/add-binary/description
 **/
public class T408 {
	/**
	 * @param a: a number
	 * @param b: a number
	 * @return: the result
	 */
	public String addBinary(String a, String b) {
		// write your code here
		int anInt = Integer.parseInt(a, 2);
		int bnInt = Integer.parseInt(b, 2);
		return Integer.toBinaryString((anInt + bnInt));
	}

	public String addBinary1(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (j >= 0) sum += b.charAt(j--) - '0';
			if (i >= 0) sum += a.charAt(i--) - '0';
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry != 0) sb.append(carry);
		return sb.reverse().toString();
	}
}
