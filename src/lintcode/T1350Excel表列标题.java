package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-04-25 16:58
 * @Description:
 **/
public class T1350Excel表列标题 {
	public static String convertToTitle(int n) {
		// write your code here
		StringBuilder sb =new StringBuilder();
		while(n!=0){
//			if (n == 26) {
//				sb.append(('Z'));
//				break;
//			}else {
				sb.append((char)('A'+(n-1)%26));
//			}
			n = (n-1)/26;
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(convertToTitle(676));
		System.out.println(convertToTitle(28));
	}
}
