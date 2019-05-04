package leetcode;

import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 09:50
 * @Description: https://leetcode-cn.com/problems/roman-to-integer/
 **/
public class T13罗马数字转整数 {
	public int romanToInt(String s) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		hashMap.put('I', 1);
		hashMap.put('V', 5);
		hashMap.put('X', 10);
		hashMap.put('L', 50);
		hashMap.put('C', 100);
		hashMap.put('D', 500);
		hashMap.put('M', 1000);
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 < s.length()) {
				if (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
					num -= hashMap.get(s.charAt(i));
					continue;
				}
			}
			num += hashMap.get(s.charAt(i));
		}
		return num;
	}
}
