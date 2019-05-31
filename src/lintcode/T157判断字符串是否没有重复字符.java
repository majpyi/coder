package lintcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 19:20
 * @Description:
 **/
public class T157判断字符串是否没有重复字符 {
	public boolean isUnique(String str) {
		// write your code here
		HashSet<Character> hashSet = new HashSet<>();
		for (char x : str.toCharArray()){
			if(hashSet.contains(x)){
				return false;
			}else {
				hashSet.add(x);
			}
		}
		return true;
	}

	public boolean isUnique1(String str) {
		// write your code here
		HashSet<Character> hashSet = new HashSet<>();
		for (char x : str.toCharArray()){
			if(hashSet.contains(x)){
				return false;
			}else {
				hashSet.add(x);
			}
		}
		return true;
	}
}
