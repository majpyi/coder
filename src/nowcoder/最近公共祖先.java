package nowcoder;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 17:04
 * @Description: https://www.nowcoder.com/practice/70e00e490b454006976c1fdf47f155d9?tpId=8&&tqId=11017&rp=1&ru
 * =/activity/oj&qru=/ta/cracking-the-coding-interview/question-ranking
 **/
public class 最近公共祖先 {
	public static int getLCA(int a, int b) {
		if (a != b) {
			if (a > b) {
				return getLCA(a / 2, b);
			} else {
				 return getLCA(a, b / 2);
			}
		}else {
			return a;
		}
	}

	public static int getLCA1(int a, int b) {
		int i=a,j=b;
		while(i!=j){
			if(i>>1 > j>>1)
				i>>=1;
			else
				j>>=1;
		}
		return i;
	}

	public static void main(String[] args) {
		System.out.println(getLCA1(2,3));
	}
}
