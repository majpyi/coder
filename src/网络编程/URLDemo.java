package 网络编程;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * @Author: Mr.M
 * @Date: 2019-04-07 16:52
 * @Description:
 **/
public class URLDemo {
	public static void main(String[] args) throws Exception {
		URL url1 = new URL("http://www.baidu.com");
		URL url = new URL("http://www.baidu.com");
//		URL url = new URL(url1,"/s?wd=q#test");
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getPath());
		System.out.println(url.getFile());
		System.out.println(url.getRef());
		System.out.println(url.getQuery());


		System.out.println(url.openStream());

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
		String data = bufferedReader.readLine();
		while (data != null) {
			System.out.println(data);
			data = bufferedReader.readLine();
		}


	}
}
