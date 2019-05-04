package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-21 19:49
 * @Description:
 **/
public class T392判断子序列 {
	public boolean isSubsequence(String s, String t) {
		if(s==null || s.length()==0){
			return true;
		}
		char[] ss = s.toCharArray();
		int i = 0;
		for (char tt : t.toCharArray()) {
			if(ss[i]==tt){
				i++;
				if(i==s.length()){
					return true;
				}
			}
		}
		return i == s.length();
	}
}
