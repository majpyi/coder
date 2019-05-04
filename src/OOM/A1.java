package OOM;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 15:44
 * @Description: Java heap space
 **/
public class A1 {

	static final int SIZE = 2 * 1024 * 1024 * 1024;

	public static void main(String[] a) {
		int[] i = new int[SIZE];
	}

}
