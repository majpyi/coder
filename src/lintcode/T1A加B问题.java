package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 15:14
 * @Description:
 **/
public class T1A加B问题 {
	public static int aplusb(int a, int b) {
		// write your code here
		if(a==0){
			return b;
		}
			int temp  = a&b;
			int temp1 = a^b;
		return 	aplusb(temp<<1,temp1);
	}

	public static void main(String[] args) {
		System.out.println(aplusb(1,2));
	}
}
