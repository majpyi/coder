package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 12:38
 * @Description: 求1+2+3+...+n
 **/
public class T47 {
	public static int Sum_Solution(int n) {
		int sum = n;
		if(n<=0){
			return 0;
		}
		sum+=Sum_Solution(n-1);
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Sum_Solution(10));
	}
}
