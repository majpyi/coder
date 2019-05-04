package 手撕;

/**
 * @Author: Mr.M
 * @Date: 2019-04-25 08:50
 * @Description:
 **/
public class 辗转相除法 {
//	static int fun(int a, int b) {
//		if (b == 0) return a;
//		return a % b == 0 ? b : fun(b, a % b);
//	}

	static int fun(int a, int b) {
		if (b == 0) return a;
		return fun(b, a % b);
	}
	public static void main(String[] args) {
		System.out.println(fun(3,2));
	}
}
