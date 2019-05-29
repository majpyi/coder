package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 12:41
 * @Description: 数组中重复的数字
 **/
public class T50数组中重复的数字 {
	public static boolean duplicate(int numbers[],int length,int [] duplication) {
		if (numbers == null || length == 0 || length == 1)
			return false;
		for (int i = 0; i < length; i++) {
			int index = numbers[i];
			if (index >= length)
				index -= length;
			if (numbers[index] >= length) {
				duplication[0] = index;
				return true;
			}
			numbers[index] += length;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] re= new int[1];
		System.out.println(duplicate(new int[]{1,2,3,2},4,re));
		System.out.println(re[0]);
	}
}
