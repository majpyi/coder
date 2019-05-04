package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-04-01 19:44
 * @Description: https://leetcode-cn.com/problems/longest-common-prefix/
 **/
public class T14最长公共前缀 {
	public String longestCommonPrefix(String[] strs) {
		int i = 0;
		int min = Integer.MAX_VALUE;
		for (String x: strs){
			if(x.length()<min){
				min = x.length();
			}
		}
		while (i<min) {
			for (String x : strs) {
				if (x.charAt(i) != strs[0].charAt(i)) {
					return strs[0].substring(0, i);
				}
			}
			i++;
		}
		return strs[0].substring(0, i);
	}

}
