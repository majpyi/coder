package IO_;

import java.io.FileReader;
import java.util.Properties;

/**
 * @Author: Mr.M
 * @Date: 2019-05-09 15:12
 * @Description:
 **/
public class 读取配置文件 {
	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader("m.properties");
//		FileReader fileReader = new FileReader("aa.txt");
		Properties properties = new Properties();
		properties.load(fileReader);
		System.out.println(properties.getProperty("mailSender.setPassword"));
	}
}
