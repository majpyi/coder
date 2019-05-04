package 笔试.微众.选择;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 21:50
 * @Description:
 **/
public class T3 {
	public static void greet(){
		System.out.println("hello");
	}

	public static void main(String[] args) {
		T3 x = null;
		x.greet();
		((T3)x).greet();
		((T3) null).greet();
	}
}
