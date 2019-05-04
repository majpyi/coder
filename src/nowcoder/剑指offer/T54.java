package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 09:55
 * @Description: 字符流中第一个不重复的字符
 **/
public class T54 {


	char[] chars = new char[128];
	StringBuilder sb = new StringBuilder();

	public void Insert(char ch) {
		sb.append(ch);
		chars[ch]++;
	}

	public char FirstAppearingOnce() {
		char[] str = sb.toString().toCharArray();
		for (char c : str) {
			if (chars[c] == 1) {
				return c;
			}
		}
		return '#';
	}


}
