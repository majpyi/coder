package 手撕;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-05-22 09:51
 * @Description: https://www.cnblogs.com/JohnTsai/p/5606719.html
 **/
public class 字符串反转 {
	public static String strReverseWithArray(String string) {
		if (string == null || string.length() == 0) return string;
		int length = string.length();
		char[] array = string.toCharArray();
		for (int i = 0; i < length; i++) {
			array[i] = string.charAt(length - 1 - i);
		}
		return new String(array);
	}

	public static String strReverseWithArray2(String string) {
		if (string == null || string.length() == 0) return string;
		int length = string.length();
		char[] array = string.toCharArray();
		for (int i = 0; i < length / 2; i++) {
			array[i] = string.charAt(length - 1 - i);
			array[length - 1 - i] = string.charAt(i);
		}
		return new String(array);
	}

	public static String strReverseWithStack(String string) {
		if (string == null || string.length() == 0) return string;
		Stack<Character> stringStack = new Stack<>();
		char[] array = string.toCharArray();
		for (Character c : array) {
			stringStack.push(c);
		}
		int length = string.length();
		for (int i = 0; i < length; i++) {
			array[i] = stringStack.pop();
		}
		return new String(array);
	}



	public static String strReverseWithReverseLoop(String string) {
		if (string == null || string.length() == 0) return string;
		StringBuilder sb = new StringBuilder();
		for (int i = string.length() - 1; i >= 0; i--) {
			sb.append(string.charAt(i));
		}
		return sb.toString();
	}


	public static String strReverseWithXor(String string) {
		if (string == null || string.length() == 0) return string;
		char[] array = string.toCharArray();
		int length = string.length() - 1;
		for (int i = 0; i < length; i++, length--) {
			array[i] ^= array[length];
			array[length] ^= array[i];
			array[i] ^= array[length];
		}
		return new String(array);
	}

	public static String strReverseWithRecursive(String string) {
		if (string == null || string.length() == 0) return string;
		int length = string.length();
		if (length == 1) {
			return string;
		} else {
			return strReverseWithRecursive(string.substring(1)) + string.charAt(0);
		}
	}

}
