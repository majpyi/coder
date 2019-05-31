package lintcode;

import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 19:59
 * @Description:
 **/
public class T209第一个只出现一次的字符 {
	public char firstUniqChar(String str) {
		// write your code here
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (Character x : str.toCharArray()) {
			if (hashMap.get(x) != null) {
				hashMap.put(x, 2);
			} else {
				hashMap.put(x, 1);
			}
		}

		for (Character x : str.toCharArray()) {
			if (hashMap.get(x) == 1) {
				return x;
			}
		}
		return ' ';
	}
}
