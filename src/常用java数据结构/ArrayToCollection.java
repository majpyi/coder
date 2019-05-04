package 常用java数据结构;

/**
 * @Author: Mr.M
 * @Date: 2019-04-10 10:35
 * @Description:
 **/

import java.util.*;
import java.io.*;

public class ArrayToCollection {
	public static void main(String args[]) {
		int n = 5;         // 5 个元素
//		String[] name = new String[n];
//		int[] name = new int[n];
		Integer[] name = new Integer[n];
		for (int i = 0; i < n; i++) {
			name[i] = i;
		}
//		List<String> list = Arrays.asList(name);
		List<Integer> list = Arrays.asList(name);
		System.out.println();
//		for (String li : list) {
		for (Integer li : list) {
//			String str = li;
			Integer str = li;
			System.out.print(str + " ");
		}
	}


	void s(){
		int[] a ={1,2,3};
//		new ArrayList<Integer>(a);
	}
}