package leetcode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-22 15:32
 * @Description: https://leetcode-cn.com/problems/longest-palindromic-substring/
 **/
public class T5最长回文子串 {
//	public String longestPalindrome(String s) {
//		String[] dp = new String[s.length()];
//		dp[0] = "";
//		for (int i = 1; i < dp.length; i++) {
//			for (int j = 0; j <= i; j++) {
//				if (dp[i - 1].length() > isP(s.substring(j, i)).length()) {
//					dp[i] = dp[i - 1];
//				} else {
//					dp[i] = isP(s.substring(j, i));
//				}
//			}
//		}
//		return dp[dp.length - 1];
//	}


	public String longestPalindrome(String s) {
		if(s.length()==0){
			return "";
		}
		String[] dp = new String[s.length()+1];
		dp[0] = "";
		for (int i = 1; i < dp.length; i++) {
			if (dp[i - 1].length() > isP(s.substring(0, i)).length()) {
				dp[i] = dp[i - 1];
			} else {
				dp[i] = isP(s.substring(0, i));
			}
		}
		return dp[dp.length - 1];
	}

	public String isP(String s) {
		String temp ="";
		for (int j = 0; j <= s.length() - 1; j++) {
			if (s.substring(j).compareTo(new StringBuilder(s.substring(j)).reverse().toString()) == 0) {
				if(s.substring(j).length()>temp.length()){
					temp = s.substring(j);
				}
			}
		}
		return temp;
	}


	public String longestPalindrome1(String s) {
		int n = s.length();
		String res = null;

		boolean[][] dp = new boolean[n][n];

		for (int i = n - 1; i >= 0; i--) {
			for (int j = i; j < n; j++) {
				dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

				if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
					res = s.substring(i, j + 1);
				}
			}
		}

		return res;
	}


	public static void main(String[] args) {
		T5最长回文子串 test = new T5最长回文子串();
//		System.out.println(test.longestPalindrome("babad"));
		System.out.println(test.longestPalindrome("a"));
		System.out.println(test.longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"));
	}
}
