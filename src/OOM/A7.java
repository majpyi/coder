package OOM;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 15:40
 * @Description: Requested array size exceeds VM limit
 **/
public class A7 {
	public static void main(String[] args) {
		for (int i = 3; i >= 0; i--) {
			try {
				int[] arr = new int[Integer.MAX_VALUE-i];
				System.out.format("Successfully initialized an array with %,d elements.\n", Integer.MAX_VALUE-i);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}
}
