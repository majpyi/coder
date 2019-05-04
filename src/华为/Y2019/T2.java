package 华为.Y2019;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @Author: Mr.M
 * @Date: 2019-04-03 18:27
 * @Description:
 **/
class Main12334 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> set = new HashSet<>();
		ArrayList<String> arrayList = new ArrayList<>();
		ArrayList<String> arrayList1 = new ArrayList<>();
		ArrayList<String> arrayList2 = new ArrayList<>();
		while (scanner.hasNext()) {
			String s = scanner.nextLine().trim();
			if (s.equals("")) {
				break;
			}
//			Pattern pattern = Pattern.compile("^[0-9a-zA-Z ]+$");
			if (s.matches("[0-9a-zA-Z ]*")) {
//			if (pattern.matcher(s).matches()) {
				if (!set.contains(s)) {
					set.add(s);
					arrayList1.add(s);
				}
			} else {
				arrayList2.add(s);
			}

		}
		print(arrayList1);
		print(arrayList2);


		for (String x : arrayList1) {
			arrayList.add(left10(x));
		}
		print(arrayList);
		Collections.sort(arrayList);
		print(arrayList);

	}

	private static void print(ArrayList<String> arrayList11) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < arrayList11.size() - 1; i++) {
			stringBuilder.append(arrayList11.get(i) + " ");
		}
		stringBuilder.append(arrayList11.get(arrayList11.size() - 1));
		System.out.println(stringBuilder.toString());
	}

	private static String left10(String x) {
		StringBuilder stringBuilder = new StringBuilder();
		while (stringBuilder.length() <= 10) {
			stringBuilder.append(x);
		}
		stringBuilder.append(x);
		return stringBuilder.substring(10, 10 + x.length());
	}
}
