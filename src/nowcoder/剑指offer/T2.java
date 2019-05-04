package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-05 21:16
 * @Description: https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 **/
public class T2 {
	public static String replaceSpace(StringBuffer str) {
		return str.toString().replaceAll("\\s","%20");
	}

	public static void main(String[] args) {
		System.out.println(replaceSpace(new StringBuffer("We%20Are%20Happy")));
	}
}
