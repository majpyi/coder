package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 12:40
 * @Description: 不用加减乘除做加法
 **/
public class T48 {
	public static int Add(int num1, int num2) {
		while (num2 != 0) {
			int temp = num1 ^ num2;
			num2 = (num1 & num2 )<< 1;
//			num2 = num1 & num2 << 1;
			num1 = temp;
		}
		return num1;
	}

	public static void main(String[] args) {
		System.out.println(Add(111,899));
	}
}
