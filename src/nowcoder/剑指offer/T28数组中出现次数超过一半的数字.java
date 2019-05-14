package nowcoder.剑指offer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 16:03
 * @Description: 数组中出现次数超过一半的数字
 **/
public class T28数组中出现次数超过一半的数字 {

//   思路错误认为占据一半就能有一半到头,其实可以只在中间而两边没有
//	public static int MoreThanHalfNum_Solution(int[] array) {
//		Arrays.sort(array);
//		if ((array.length & 1) == 1) {
//			if (array[((array.length) - 1) / 2] == array[0] || array[((array.length) - 1) / 2] == array[array.length - 1])
//				return array[((array.length) - 1) / 2];
//			else
//				return 0;
//		} else {
//			if (array[(array.length - 1) / 2] == array[0] || array[(array.length - 1) / 2] == array[array.length-1]) {
//				return array[(array.length - 1) / 2];
//			} else {
//				return 0;
//			}
//		}
//	}

//	public static void main(String[] args) {
//		System.out.println(MoreThanHalfNum_Solution(new int[]{1,2,3,2,2,2,5,4,2}));
//	}

	public static int MoreThanHalfNum_Solution(int[] array) {
		if(array.length==0){
			return 0;
		}

		int maxnum = array[0];
		int count = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] != maxnum) {
				count--;
			} else {
				count++;
			}
			if (count == 0) {
				maxnum = array[i];
				count++;
			}

		}
		count=0;
		for(int i=0;i<array.length;i++){
			if(array[i] == maxnum){
				count++;
			}
		}

		if(count>array.length/2){
			return maxnum;
		}else {
			return 0;
		}
	}


	public static void main(String[] args) {
//		System.out.println(MoreThanHalfNum_Solution(new int[]{1,2,3,2,2,2,5,4,2}));
		System.out.println(MoreThanHalfNum_Solution(new int[]{0,0,2,2,2,2}));
	}

}
