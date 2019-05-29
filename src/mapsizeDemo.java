/**
 * @Author: Mr.M
 * @Date: 2019-05-21 21:08
 * @Description:
 **/
public class mapsizeDemo {
	private static final int MAXIMUM_CAPACITY = 100;

	public static void main(String[] args) {
		int cap = 3;
		int n = cap - 1;

		n |= n >>> 1;
		System.out.println(n);

		n |= n >>> 2;
		System.out.println(n);

		n |= n >>> 4;
		System.out.println(n);

		n |= n >>> 8;
		System.out.println(n);

		n |= n >>> 16;
		System.out.println(n);

		System.out.println((n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1);

		String a = "abc";

	}
}
