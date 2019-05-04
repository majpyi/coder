package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-25 17:04
 * @Description: https://leetcode-cn.com/problems/valid-palindrome/
 **/
public class T125验证回文串 {

	public static boolean isPalindrome(String s) {
		s= s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		return s.equals(new StringBuilder(s).reverse().toString());
	}

	public static boolean isPalindrome1(String s) {
		s= s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
		int i=0;
		int j=s.length()-1;
		while(i<=j){
			if(s.charAt(i)==s.charAt(j)){
				i++;
				j--;
			}else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "Damosel, a poem? A carol? Or a cameo pale? (So mad!)";
		s= s.replaceAll("[^(A-Za-z0-9)]", "");
		System.out.println(isPalindrome1(s));
	}
}
