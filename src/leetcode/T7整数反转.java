package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-04-01 19:29
 * @Description: https://leetcode-cn.com/problems/reverse-integer/
 **/
public class T7整数反转 {
	public static int reverse(int x) {
		if(x==0){
			return 0;
		}
		StringBuilder sb = new StringBuilder();
		sb.append(new StringBuilder(String.valueOf(x)).reverse());
		int i = 0;
		while (sb.charAt(i) == '0') {
			sb.deleteCharAt(i);
//			i++;
		}
		if (x < 0) {
			sb.insert(0, "-");
			sb.delete(sb.length()-1,sb.length());
		}
		try{
			return Integer.valueOf(sb.toString());
		}catch(Exception e){
			return 0;
		}

	}

	public static void main(String[] args) {
		System.out.println(reverse(-123));
		System.out.println(reverse(123));
		System.out.println(reverse(120));
		System.out.println(reverse(-120));
		System.out.println(reverse(1534236469));
	}
}
