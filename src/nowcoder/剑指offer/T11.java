package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 08:55
 * @Description: 二进制中1的个数
 **/
public class T11 {
	public int NumberOf1(int n) {
		return Integer.bitCount(n);
	}
	public static int NumberOf11(int n) {
		int num = 0;
		while (n!=0){
			n = n&(n-1);
			num++;
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(NumberOf11(9));
	}
}
