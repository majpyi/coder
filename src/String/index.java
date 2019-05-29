package String;

/**
 * @Author: Mr.M
 * @Date: 2019-04-24 21:57
 * @Description:
 **/
public class index {
	public static void main(String[] args) {
		String string = "123.123.ooo";
		System.out.println(string.indexOf("122")); ;
		System.out.println(string.indexOf("."));
		System.out.println(string.lastIndexOf("."));
		System.out.println(string.substring(string.indexOf(".")));
	}
}
