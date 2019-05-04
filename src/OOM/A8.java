package OOM;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 15:38
 * @Description: Kill process or sacrifice child
 * Linux 系统日志 /var/log/kern.log
 * java.lang.OutOfMemoryError: Java heap space
 **/
public class A8 {
	public static void main(String[] args){
		ArrayList l = new ArrayList();
		for (int i = 10000; i < 100000; i++) {
			try {
				l.add(new int[100000000]);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}
}
