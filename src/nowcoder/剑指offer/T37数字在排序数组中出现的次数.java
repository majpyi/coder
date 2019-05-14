package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 15:07
 * @Description: 数字在排序数组中出现的次数
 **/
public class T37数字在排序数组中出现的次数 {
	public int GetNumberOfK(int[] array, int k) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == k) {
				count++;
			}
		}
		return count;
	}

	public static int GetNumberOfK1(int[] array, int k) {
		int l = 0;
		int r = array.length - 1;
		while (l <= r) {
			int mid = r + l / 2;
			if (array[mid] == k) {
				int t = mid+1;
				int count = 0;
				while (t < array.length && array[t] == k) {
					t++;
					count++;
				}
//				while (array[mid - 1] == k && mid >= 0) {    //   一定要注意越界的问题
				while (mid >= 0 && array[mid] == k) {    //   一定要注意越界的问题,而且要注意&&前后条件的顺序,不然仍然越界,短路
					mid--;
					count++;
				}
				return count;
			} else if (array[mid] > k) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return 0;
	}


	public static void main(String[] args) {
		System.out.println(GetNumberOfK1(new int[]{3,3,3,3,4,5},3));
	}
}
