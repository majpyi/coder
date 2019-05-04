package nowcoder.剑指offer;

import java.util.LinkedList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-09 12:37
 * @Description: 孩子们的游戏(圆圈中最后剩下的数)
 **/
public class T46 {
	public  static int LastRemaining_Solution(int n, int m) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		int bt = 0;
		for (int i = 0; i < n; i ++) {
			list.add(i);
		}
		while (list.size() > 1) {
			bt = (bt + m - 1) % list.size();
			list.remove(bt);
		}
		return list.get(0);
	}

	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(1,0));
	}

}
