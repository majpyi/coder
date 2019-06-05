package 集合;

import java.util.ArrayList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 16:28
 * @Description:
 **/
public class ArrayListDemo {
	public static void main(String[] args) {
		String case1 = "case1";
		String case3 = "case3";
		String case4 = "case4";

		ArrayList<String> list = new ArrayList<String>();
		list.add(case1);
		list.add(case3);
		list.add(case4);

		String case2 = "case2";
		System.out.println(list.size());
		list.add(4, case2);
		System.out.println(list);
	}
}
