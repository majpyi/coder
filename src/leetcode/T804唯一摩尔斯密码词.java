package leetcode;

import java.util.HashSet;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 09:11
 * @Description: https://leetcode-cn.com/problems/unique-morse-code-words/
 **/
public class T804唯一摩尔斯密码词 {
	public int uniqueMorseRepresentations(String[] words) {
		String[] strings = {
		".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
			"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		HashSet<String> hashSet = new HashSet<>();
		StringBuilder sb ;
		for (String x: words){
			sb =new StringBuilder();
			for (char c : x.toCharArray()){
				sb.append(strings[c-'a']);
			}
			hashSet.add(sb.toString());
		}
		System.out.println(hashSet);
		return hashSet.size();
	}

	public static void main(String[] args) {
		System.out.println((char)97);
	}
}
