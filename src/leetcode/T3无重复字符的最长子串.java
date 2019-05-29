package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Mr.M
 * @Date: 2019-05-21 15:10
 * @Description:
 **/
public class T3无重复字符的最长子串 {
	public int lengthOfLongestSubstring(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int max = 1;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (is(s.substring(i, j + 1)) && (j - i + 1) > max) {
					max = (j - i + 1);
				}
			}
		}
		return max;
	}

	public static int lengthOfLongestSubstring1(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>(); // current index of character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
//				i = map.get(s.charAt(j));
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}

	public int lengthOfLongestSubstring2(String s) {
		int n = s.length();
		Set<Character> set = new HashSet<>();
		int ans = 0, i = 0, j = 0;
		while (i < n && j < n) {
			// try to extend the range [i, j]
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}

	private boolean is(String s) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (Character x : s.toCharArray()) {
			if (hashMap.containsKey(x)) {
				return false;
			} else {
				hashMap.put(x, 1);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		lengthOfLongestSubstring1("abba");
	}
}
