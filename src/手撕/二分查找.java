package 手撕;

/**
 * @Author: Mr.M
 * @Date: 2019-04-28 15:21
 * @Description:
 **/
public class 二分查找 {
	public static void main(String[] args) {

		System.out.println(binarySearch(new int[]{1,2,3,4},1));
	}

	static int binarySearch(int[] arr, int target) {
		int l = 0;
		int r = arr.length - 1;
		int mid = l + (r - l) / 2;
//		int mid = (l + r ) / 2;
		while (l <= r) {
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] < target) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
			mid = l + (r - l) / 2;
//			mid = (l + r ) / 2;

		}
		return -1;
	}
}
