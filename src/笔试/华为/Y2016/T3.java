package 笔试.华为.Y2016;

import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-03 15:42
 * @Description: https://www.nowcoder.com/question/next?pid=260145&qid=25368&tid=22879286
 **/
public class T3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String[] re = scanner.nextLine().split("-");
			String[] re1 = re[0].split(" ");
			String[] re2 = re[1].split(" ");
			for (int i = 0; i < re1.length; i++) {
				if (re1[i].equals("2")) {
					re1[i] = "@";
				}
			}
			for (int i = 0; i < re2.length; i++) {
				if (re2[i].equals("2")) {
					re2[i] = "@";
				}
			}
			if (re1.length != re2.length) {
				if (isBomb(re1) && isBomb(re2)) {
					if (re1.length < re2.length) {
						System.out.println(re[0]);
					} else {
						System.out.println(re[1]);
					}
				} else if (isBomb(re1)) {
					System.out.println(re[0]);
				} else if (isBomb(re2)) {
					System.out.println(re[1]);
				} else {
					System.out.println("ERROR");
				}
			} else {
				if (re1.length == 1) {
					com(re, re1[0], re2[0]);
				} else if (re1.length == 2) {
					com(re, re1[0], re2[0]);
				} else if (re1.length == 3) {
					com(re, re1[0], re2[0]);
				} else if (re1.length == 4) {
					com(re, re1[0], re2[0]);
				} else if (re1.length == 5) {
					com(re, re1[0], re2[0]);
				}
			}
		}
	}

	private static void com(String[] re, String s, String anotherString) {
		if (s.compareTo("9") <= 0 && anotherString.compareTo("9") <= 0) {
			if (s.length() > anotherString.length()) {
				System.out.println(re[0]);
			} else if (s.length() < anotherString.length()) {
				System.out.println(re[1]);
			} else {
				//		System.out.println(s);
//		System.out.println(anotherString);
//		System.out.println(s.compareTo(anotherString));
				if (s.compareTo(anotherString) > 0) {
					System.out.println(re[0]);
				} else {
					System.out.println(re[1]);
				}
			}
		} else if (s.compareTo("9") > 0 && anotherString.compareTo("9") > 0) {
			if (s.compareTo(anotherString) > 0) {
				System.out.println(re[1]);
			} else {
				System.out.println(re[0]);
			}
		} else {
			if (s.compareTo("9") > 0) {
				System.out.println(re[0]);
			} else {
				System.out.println(re[1]);
			}
		}

	}

	private static boolean isBomb(String[] re1) {
		if (re1.length == 2) {
			return re1[0].equals("joker") || re1[0].equals("JOKER");
		} else return re1.length == 4;
	}
}


class MainT3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] left, right;
		String[] line;
		String nextLine, outString;
		while (sc.hasNext()) {
			nextLine = sc.nextLine();
			//有王炸就王炸最大
			if (nextLine.contains("joker JOKER")) {
				outString = "joker JOKER";
			} else {
				//拆分 先拆成左右 再拆成单排
				line = nextLine.split("-");
				left = line[0].split(" ");
				right = line[1].split(" ");

				//炸弹最大
				if (left.length == 4 && right.length != 4) {
					outString = line[0];
				} else if (right.length == 4 && left.length != 4) {
					outString = line[1];
				}
				// 牌数相同的情况下比较最小的牌的大小，compare方法返回牌所对应的值
				else if (right.length == left.length) {
					if (count(left[0]) > count(right[0])) {
						outString = line[0];
					} else {
						outString = line[1];
					}
				} else {
					outString = "ERROR";
				}
			}

			System.out.println(outString);

		}
	}

	//2-JOKER 按大小返回2-16
	private static int count(String str) {
		return "345678910JQKA2jokerJOKER".indexOf(str);
	}
}