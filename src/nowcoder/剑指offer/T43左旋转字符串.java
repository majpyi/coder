package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 12:03
 * @Description: 左旋转字符串
 **/
public class T43左旋转字符串 {
	public static String LeftRotateString(String str,int n) {
		StringBuilder sb = new StringBuilder(str);
		for (int i=0;i<str.length();i++){
			int l = str.length();
			char x =  str.charAt((i-n+l)%l);
			sb.replace((i-n+l)%l,(i-n+l)%l+1,str.substring(i,i+1));
		}
		return new String(sb);
	}

	public static String LeftRotateString1(String str,int n) {
//		StringBuilder s1 = new StringBuilder(str.substring(0,n)).reverse();
//		StringBuilder s2 = new StringBuilder(str.substring(n,str.length())).reverse();
		if(str.length()==0){
			return str;
		}
		return str.substring(n)+str.substring(0,n);
	}

	public String LeftRotateString3(String str,int n) {
		if(str.length() == 0){
			return str;
		}
		StringBuffer buffer = new StringBuffer(str);
		StringBuffer buffer1 = new StringBuffer(str);
		StringBuffer buffer2 = new StringBuffer();
		buffer.delete(0,n);
		buffer1.delete(n,str.length());
		buffer2.append(buffer.toString()).append(buffer1.toString());
		return buffer2.toString();
	}

	public static void main(String[] args) {
		System.out.println(LeftRotateString("abcdefg",2));
		System.out.println(LeftRotateString1("abcdefg",2));
		System.out.println(LeftRotateString1("abcdefg",0));
		System.out.println(LeftRotateString1("",0));
		System.out.println(LeftRotateString1("",2));
	}
}
