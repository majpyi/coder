package leetcode;

import java.util.ArrayList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 20:08
 * @Description:
 **/
public class T933最近的请求次数 {

	 static ArrayList<Integer> arraylist = new ArrayList<>();

	public static int ping(int t) {
		int num = 0;
//		int l = arraylist.size();
		for (int i = 0; i <arraylist.size(); i++) {
			if (arraylist.get(i) >= t - 3000) {
				num++;
			} else {
				arraylist.remove(i);
//				i=0;
				i=-1;
			}
		}
		arraylist.add(t);
		return num + 1;
	}

	public static void main(String[] args) {
		System.out.println(ping(1178));
		System.out.println(ping(1483));
		System.out.println(ping(1563));
		System.out.println(ping(4054));
		System.out.println(ping(4152));
	}
}
