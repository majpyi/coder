package 网络编程;

import java.net.InetAddress;
import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-04-07 16:44
 * @Description:
 **/
public class InetAddressDemo {
	public static void main(String[] args) throws Exception {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());
		System.out.println(Arrays.toString(address.getAddress()));
		byte[] bytes = address.getAddress();
		System.out.println(Arrays.toString(bytes));   //  -128 - 127
		System.out.println(address);
		InetAddress address1 = InetAddress.getByName("M");
		InetAddress address2 = InetAddress.getByName("169.254.165.235");
	}
}
