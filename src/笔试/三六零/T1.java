package 笔试.三六零;

/**
 * @Author: Mr.M
 * @Date: 2019-04-24 18:55
 * @Description:
 **/
public class T1 {
	static int string2int(String str) {
		if (str == null || str.length() == 0) {
			return 0;
		}
		str = str.intern();
		if (str.contains(".")) {
			str = str.substring(0, str.indexOf('.'));
		}

		char firstChar = str.charAt(0);
		int f = 1;
		int start = 0;
		int sum = 0;
		if (firstChar == '+') {
			start++;
		} else if (firstChar == '-') {
			f = -1;
			start++;
		}

		for (int i = start; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i))) {
				return 0;
			}
			sum = sum * 10 + str.charAt(i) - '0';
		}
		return sum * f;
	}

	public static void main(String[] args) {
		System.out.println(string2int("0360.1-2"));
	}
}
