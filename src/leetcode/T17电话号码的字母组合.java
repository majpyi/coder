package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-23 11:23
 * @Description: https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 **/
public class T17电话号码的字母组合 {
	HashMap<Character, String > hashMap = new HashMap<>();

	{
		hashMap.put('2',"abc");
		hashMap.put('3',"def");
		hashMap.put('4',"ghi");
		hashMap.put('5',"jkl");
		hashMap.put('6',"mno");
		hashMap.put('7',"pqrs");
		hashMap.put('8',"tuv");
		hashMap.put('9',"wxyz");
	}

	public List<String> letterCombinations(String digits) {
//		ArrayList<Character> arrayList = new ArrayList<>();
		char[] r = new char[digits.length()];
		ArrayList<String> re = new ArrayList<>();
//		dfs(digits.toCharArray(),0,arrayList,re);
		for (Character x : digits.toCharArray()){
			String s = hashMap.get(x);
		}
		return re;
	}

//	private void dfs(char[] digits, int i, ArrayList<Character> arrayList,ArrayList<String> re) {
//		if(arrayList.size()==digits.length){
//			re.add();
//		}
//	}


	public static void main(String[] args) {
//		Character[] characters =new Character[3];
		char[] characters =new char[3];
		characters[0] = 'a';
		System.out.println(String.valueOf(characters));
	}
}
