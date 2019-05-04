/**
 * @Author: Mr.M
 * @Date: 2019-03-21 09:55
 * @Description:
 **/
public class T2 {
	public static void main(String[] args) {
		int i = 1;
		i = i++;
		int j = i++;
		int k = i + ++i * i++;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
