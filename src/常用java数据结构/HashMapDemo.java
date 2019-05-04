package 常用java数据结构;

import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-04-05 16:29
 * @Description:
 **/
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();

		System.out.println(hashMap.put(1, 2));

		System.out.println(hashMap.put(1, 3));
	}
}
