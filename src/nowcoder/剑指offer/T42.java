package nowcoder.剑指offer;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 11:55
 * @Description: 和为S的两个数字
 **/
public class T42 {
	public static ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> re = new ArrayList<>();
		for (int x : array) {
			int remin = sum - x;
			for (int i = array.length - 1; i >= 0; i--) {
				if (array[i] == remin) {
					re.add(x);
					re.add(remin);
					return re;                //   不应该break因为这这是跳出当前循环,而外面的那一层循环还没有跳出,得到答案直接范围就可以了
				}
				if (array[i] < remin) {
					break;
				}
			}
		}
		return re;
	}


	public static void main(String[] args) {
		System.out.println(FindNumbersWithSum(new int[]{1,2,3,4,5},5));
	}
}
