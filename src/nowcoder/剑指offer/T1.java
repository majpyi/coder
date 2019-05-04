package nowcoder.剑指offer;

import java.lang.reflect.Field;

/**
 * @Author: Mr.M
 * @Date: 2019-03-05 20:50
 * @Description: https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 **/
public class T1 {
	public static boolean Find(int target, int[][] array) {
		int i = 0, j = array[0].length-1;
		while (i < array.length && j >= 0) {
			if (array[i][j] > target) {
				j--;
			} else if (array[i][j] < target) {
				i++;
			} else {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
			int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
			System.out.println(Find(7,arr));
	}
}
