package nowcoder.剑指offer;

import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 12:13
 * @Description: 翻转单词顺序列
 **/
public class T44翻转单词顺序列 {
	public static String ReverseSentence(String str) {
//				return new String(new StringBuilder(str).reverse());
		if(str==null || str.length()==0){
			return str;
		}
		System.out.println(str.length());
		String[] strings = str.split(" ");
		if(strings.length==0){
			return str;
		}//   "如果全是加空格这里就不会分割了
		System.out.println(strings.length);
		for (int i = 0; i < strings.length / 2; i++) {
			String x = strings[i];
			strings[i] = strings[strings.length - 1 - i];
			strings[strings.length - 1 - i] = x;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strings.length-1; i++) {
			sb.append(strings[i]);
			sb.append(" ");                                     //   要考虑到最后一个string是不需要加空格的特殊情况
		}
		sb.append(strings[strings.length-1]);
		return new String(sb);
	}

	public static void main(String[] args) {
		System.out.println(ReverseSentence("  "));
//		System.out.println(Arrays.toString("student. a am I".split(" ")));
	}
}
