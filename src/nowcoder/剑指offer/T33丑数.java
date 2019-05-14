package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 14:39
 * @Description: 丑数
 **/
public class T33丑数 {

	public int GetUglyNumber_Solution(int index) {
		if(index<=0){
			return 0;
		}
		int[] ugly = new int[index];
		ugly[0] = 1;
		int ugly2 = 0;
		int ugly3 = 0;
		int ugly5 = 0;
		for (int i = 1; i < index; i++) {
			ugly[i] = Math.min(ugly[ugly2] * 2, Math.min(ugly[ugly3] * 3, ugly[ugly5] * 5));
			if (ugly[ugly2] * 2 == ugly[i]) {
				ugly2++;
			}
			if (ugly[ugly3] * 3 == ugly[i]) {
				ugly3++;
			}
			if (ugly[ugly5] * 5  == ugly[i]) {
				ugly5++;
			}
		}
		return ugly[index - 1];
	}
}
