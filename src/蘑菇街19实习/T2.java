package 蘑菇街19实习;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-04-09 16:42
 * @Description: https://www.nowcoder.com/question/next?pid=15710830&qid=339084&tid=23111723
 **/

public class T2 {

	private static void permutation(char[] s, int from, int to, TreeSet<String> treeSet) {
		if (from == to) {
			arrayList.add(String.valueOf(s));
			treeSet.add(String.valueOf(s));
		} else {
			for (int i = from; i <= to; i++) {
				swap(s, i, from); //交换前缀，使其产生下一个前缀
				permutation(s, from + 1, to, treeSet);
				swap(s, i, from); //将前缀换回，继续做上一个前缀的排列
			}
		}
	}

	private static void swap(char[] s, int i, int j) {
		char tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}

	private static ArrayList<String> arrayList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		TreeSet<String> treeSet =  new TreeSet<>();
//		while (scanner.hasNext()) {
//			String string = scanner.nextLine();
//			treeSet = new TreeSet<>();
//			arrayList = new ArrayList<>();
//			permutation(string.toCharArray(), 0, string.length() - 1, treeSet);
////			System.out.println(treeSet);
//			System.out.println(arrayList);
//		}
		treeSet.add("abc");
		permutation("abc".toCharArray(),0,2,treeSet);
			System.out.println(arrayList);

	}

}
