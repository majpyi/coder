package 笔试.微众.选择;

import java.text.DateFormat;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 22:14
 * @Description:
 **/
public class T5 {

	public static void main(String[] args) {
		DateFormat df;
		Date date = new Date();
		df = DateFormat.getInstance();
		String s =df.format(date);

		ConcurrentHashMap concurrentHashMap =new ConcurrentHashMap();
	}
}
