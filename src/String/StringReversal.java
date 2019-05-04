package String;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 08:45
 * @Description:
 **/
public class StringReversal {
	/**
	 * 反转字符串（循环交换）
	 * 其他字符串反转的方法
	 * 1、java的api：StringBuffer的reverse方法
	 * 2、利用栈的特性（先进后出）
	 * 3、反向遍历字符串
	 *
	 * @param from
	 * @return
	 */
	public static String reChange(String from) {
		char[] froms = from.toCharArray();
		int length = froms.length;
		for (int i = 0; i < length / 2; i++) {
			char temp = froms[i];
			froms[i] = froms[length - 1 - i];
			froms[length - 1 - i] = temp;
		}
//		System.out.println(String.valueOf(froms));
		return String.valueOf(froms);
	}

	/**
	 * 循环左移index位字符串
	 * 思想：先部分反转，后整体反转
	 *
	 * @param from
	 * @param index
	 * @return
	 */
	public static String leftMoveIndex(String from, int index) {
		String first = from.substring(0, index);
		String second = from.substring(index);
		first = reChange(first);
		second = reChange(second);
		from = first + second;
		from = reChange(from);
		return from;
	}

	/**
	 * 循环右移index位字符串
	 * 思想：先整体反转，后部分反转
	 *
	 * @param from
	 * @param index
	 * @return
	 */
	public static String rightMoveIndex(String from, int index) {
		from = reChange(from);
		String first = from.substring(0, index);
		String second = from.substring(index);
		first = reChange(first);
		second = reChange(second);
		from = first + second;
		return from;
	}


	//返回左移n位字符串方法
	private static String moveToLeft(String str,int position) {
		String str1=str.substring(position);
		String str2=str.substring(0, position);
		return str1+str2;
	}
	//返回右移n位字符串方法
	private static String moveToRight(String str,int position) {
		String str1=str.substring(str.length()-position);
		String str2=str.substring(0, str.length()-position);
		return str1+str2;
	}

	public static void main(String[] args) {
		String leftString = "abcdefg";
		String leftString1 = "abcdefg";
		System.out.println(leftMoveIndex(leftString, 3).equals(moveToLeft(leftString1, 3)));
//		System.out.println("左移2位字符串结果：" + leftMoveIndex(leftString, 2));
//		System.out.println("左移2位字符串结果：" + moveToLeft(leftString1, 2));
		String rightString = "abcdefg";
		String rightString1 = "abcdefg";
		System.out.println(rightMoveIndex(rightString, 4).equals(moveToRight(rightString1, 4)));
//		System.out.println("右移2位字符串结果：" + rightMoveIndex(rightString, 2));
//		System.out.println("右移2位字符串结果：" + moveToRight(rightString1, 2));

	}
}