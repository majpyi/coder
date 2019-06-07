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

	public static int lengthOfLongestSubstring1(String s) {
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

	public static int lengthOfLongestSubstring2(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				//j是当前所在的字符索引，而i是已经被标记重复的地方，这里应该选择重复地方中的最大的地方
				i = Math.max(map.get(s.charAt(j)), i);
//				i = map.get(s.charAt(j));
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}


	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring2("abba"));
	}
}
