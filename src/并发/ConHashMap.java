package 并发;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-05-25 16:26
 * @Description:
 **/
public class ConHashMap {
	public static void main(String[] args) throws Throwable {
		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
		ConHashMap conHashMap = new ConHashMap();
		conHashMap.finalize();
	}
}
