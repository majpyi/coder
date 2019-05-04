package bit;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 17:33
 * @Description:
 **/
public class T1 {
	public static void main(String[] args) {
		int mask = 7;
		int t = 2;
		int mask1 = mask | (1 << t);
		int mask2 = mask & (~(1 << t));
		System.out.println(mask1);
		System.out.println(mask2);
	}
}
