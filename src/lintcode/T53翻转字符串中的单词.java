package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 19:37
 * @Description:
 **/
public class T53翻转字符串中的单词 {
	public String reverseWords(String s) {
		// write your code here
		String[] strings = s.trim().split("\\s+");
		StringBuilder stringBuilder = new StringBuilder();
		for (int i=strings.length-1;i>=0;i--){
//			stringBuilder.append(reverse(strings[i]));
			stringBuilder.append(strings[i]);
			if(i!=0){
				stringBuilder.append(" ");
			}
		}
		return stringBuilder.toString();

	}

	private static void black(String s){
//		System.out.println(s.split("\\s+").length);
		for (String x:s.split("\\s+")){
			System.out.println(x);
		}
	}
//	private String reverse(String s){
//		StringBuilder stringBuilder = new StringBuilder(s);
//		return stringBuilder.reverse().toString();
//	}

	public static void main(String[] args) {
		black("  1  ");
	}
}
