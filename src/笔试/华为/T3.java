package 笔试.华为;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-17 19:07
 * @Description:
 **/
public class T3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] strings = scanner.nextLine().split(",");
		int[] re = new int[6];
		re[0] = Integer.valueOf(strings[0].substring(1));
		for (int i = 1; i < strings.length - 1; i++) {
			re[i] = Integer.valueOf(strings[i]);
		}
		re[5] = Integer.valueOf(strings[5].substring(0, strings[5].length() - 1));

//		Arrays.sort(re);
		ArrayList<Integer> hour1 = new ArrayList<>();
		ArrayList<Integer> hour2 = new ArrayList<>();
		ArrayList<Integer> min1 = new ArrayList<>();
		ArrayList<Integer> min2 = new ArrayList<>();
		for (int i = 0; i < re.length; i++) {
			if (re[i] <= 2) {
				hour1.add(re[i]);
			}
			if (re[i] <= 4) {
				hour2.add(re[i]);
			}
			if (re[i] <= 6) {
				min1.add(re[i]);
			}
			min2.add(re[i]);
		}

		String string = "";
		String string1 = "";
		String string2 = "";
		if (hour1.isEmpty() && hour2.size() < 2) {
			System.out.println("invalid");
		} else {
			string = String.valueOf(hour1.get(0));
			hour2.remove(hour1.get(0));
			min1.remove(hour1.get(0));
			min2.remove(hour1.get(0));
			hour1.remove(hour1.get(0));
			string = string + hour2.get(0);
			min1.remove(hour2.get(0));
			min2.remove(hour2.get(0));
			hour2.remove(hour2.get(0));
		}

		if (min1.size() < 2) {
			System.out.println("invalid");
		} else {
			string1 = String.valueOf(min1.get(0));
			min2.remove(min1.get(0));
			min1.remove(min1.get(0));
			string2 = String.valueOf(min1.get(0));
			min2.remove(min1.get(0));
			min1.remove(min1.get(0));
			string1 = string1 + String.valueOf(min2.get(0));
			string2 = string2 + String.valueOf(min2.get(1));
		}

		if (string1.equals("") || string.equals("") || string2.equals("")) {
			System.out.println("invalid");
		} else {
			System.out.println(string + ":" + string1 + ":" + string2);
		}

	}
}


//	private static String find_(int[] re) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < re.length; i++) {
//			if (re[i] < 6) {
//				sb.append(re[i]);
//				re[i] = -1;
//				}
//			}
//		return "";
//	}
//
//	private static String find_hour(int[] re) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < re.length; i++) {
//			if (re[i] <= 2) {
//				sb.append(re[i]);
//				re[i] = -1;
//				for (int j = 0; j < re.length; j++) {
//					if (re[i] < 4 && re[i] >= 0) {
//						sb.append(re[i]);
//						return sb.toString();
//					}
//				}
//			}
//		}
//		return "";
//	}
//}
