package nowcoder.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 08:42
 * @Description: 把数组排成最小的数
 **/
public class T32把数组排成最小的数 {
	public static String PrintMinNumber(int[] numbers) {
		ArrayList<String> arrayList = new ArrayList<>();
		for (int number : numbers) {
			arrayList.add(String.valueOf(number));
		}

		Collections.sort(arrayList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				int l = Math.min(o1.length(), o2.length());
				for (int i = 0; i < l; i++) {
					if (o1.charAt(i) > o2.charAt(i)) {
//						return -1;
						return 1;
					}
					if (o1.charAt(i) < o2.charAt(i)) {
//						return 1;
						return -1;
					}
				}
				if (o1.length() > o2.length()) {
					return 	compare(o1.substring(o2.length()), o2);   //  这里记得要有返回语句
				}
				if (o1.length() < o2.length()) {
					return compare(o1, o2.substring(o1.length()));
				}
				return 0;
			}
		});

		System.out.println(arrayList);
		StringBuilder stringBuilder = new StringBuilder();
		for (String s : arrayList) {
			stringBuilder.append(s);
		}
		return new String(stringBuilder);

	}


	public static void main(String[] args) {
		System.out.println(PrintMinNumber(new int[]{3, 32, 321}));
		System.out.println(PrintMinNumber(new int[]{3, 32, 325}));
	}
}
