package OOM;

import java.util.Map;
import java.util.Random;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 15:47
 * @Description: GC overhead limit exceeded
 **/
public class A2 {
	public static void main(String args[]) throws Exception {
		Map map = System.getProperties();
		Random r = new Random();
		while (true) {
			map.put(r.nextInt(), "value");
		}
	}
}
