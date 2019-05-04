package nowcoder;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 14:46
 * @Description: 第一个只出现一次的字符
 **/
public class T34 {
	public static int FirstNotRepeatingChar(String str) {
		LinkedHashMap<Character,Integer> linkedHashMap = new LinkedHashMap<>();
		for(Character x : str.toCharArray()){
			if(linkedHashMap.containsKey(x)){
				linkedHashMap.put(x,linkedHashMap.get(x)+1);
			}else {
				linkedHashMap.put(x,1);
			}
		}
		System.out.println(linkedHashMap.keySet());
		for (Character x: linkedHashMap.keySet()){
			if(linkedHashMap.get(x)==1){
				return str.indexOf(x);
			}
		}
		return -1;
	}


	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("google"));
	}
}
