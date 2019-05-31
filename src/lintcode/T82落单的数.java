package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 16:04
 * @Description:
 **/
public class T82落单的数 {
	public static int singleNumber(int[] A) {
		// write your code here
		int temp = A[0];
		for (int i=1;i<A.length;i++){
			temp^=A[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[]{1,1,2}));
	}
}
