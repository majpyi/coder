package lintcode;

import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 20:04
 * @Description:
 **/
public class T1654出现次数最多的字母 {
	public int mostFrequentlyAppearingLetters(String str) {
		// Write your code here.
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (Character x : str.toCharArray()) {
			if (hashMap.get(x) != null) {
				hashMap.put(x, hashMap.get(x)+1);
			} else {
				hashMap.put(x, 1);
			}
		}
		int max = 0;
		for (Character x : str.toCharArray()) {
			max = Math.max(max,hashMap.get(x));
		}

		return max;
	}
}
