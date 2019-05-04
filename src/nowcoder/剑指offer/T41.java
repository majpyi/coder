package nowcoder.剑指offer;

import java.util.ArrayList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 11:35
 * @Description: 和为S的连续正数序列
 **/
public class T41 {
	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
		for (int i = 1; i < sum; i++) {
			int accumulation = 0;
			for (int j = i; j < sum; j++) {
				if (accumulation > sum) {
					break;
				} else if (accumulation < sum) {
					accumulation += j;
				}
				if (accumulation == sum) {                          //  顺序有问题    ,   如果上一步已经判断是小于sum的而加上这个值之后直接进行下一步的循环而不会进入else 的条件判定
					ArrayList<Integer> arrayList = new ArrayList<>();
					for (int k = i; k <= j; k++) {
						arrayList.add(k);
					}
					arrayLists.add(arrayList);
					break;     //忘记跳出循环
				}
			}
		}
		return arrayLists;
	}
//	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
//		ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
//		for (int i = 1; i < sum; i++) {
//			int accumulation = 0;
//			for (int j = i; j < sum; j++) {
//				if (accumulation == sum) {
//					ArrayList<Integer> arrayList = new ArrayList<>();
//					for (int k = i; k <= j; k++) {
//						arrayList.add(k);
//					}
//					arrayLists.add(arrayList);
//				} else if (accumulation < sum) {
//					accumulation += j;
//				} else {
//					break;
//				}
//			}
//		}
//		return arrayLists;
//	}


	public static void main(String[] args) {
		System.out.println(FindContinuousSequence(9));
	}
}
