package nowcoder.剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 16:02
 * @Description: 字符串的排列
 **/
public class T27字符串的排列 {
	public static ArrayList<String> Permutation(String str) {
		ArrayList<String> re =new ArrayList<>();
		if(str.length()==1){
			re.add(str);
			return re;
		}
		Set<String> set =new HashSet<>();
		getStrings(str,re,set);
		return re;
//		Collections.sort(re);
//		return re;
	}

	private static void getStrings(String str, ArrayList<String> re, Set<String> set) {
		char[] chars =str.toCharArray();
		char x;
		for(int i=1;i<chars.length;i++){
				x = chars[i];
				chars[i] = chars[0];
				chars[0] = x;
				if(!set.contains(String.valueOf(chars))){
					re.add(String.valueOf(chars));
					set.add(String.valueOf(chars));
					getStrings(String.valueOf(chars),re,set);
				}
		}
	}

	public static void main(String[] args) {
		System.out.println(Permutation("abc"));
	}
}
