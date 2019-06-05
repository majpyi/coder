package lintcode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-05 16:10
 * @Description:
 **/
public class T74第一个错误的代码版本 {
	/**
	 * @param n: An integer
	 * @return: An integer which is the first bad version.
	 */
	public static int findFirstBadVersion(int n) {
		// write your code here
		int l = 1;
		int r = n;
//		int mid = l + ((r - l) >> 1);
		int mid = l + (r - l) >> 1;
//		System.out.println(mid);
//		System.out.println(mid1);
//		while (l <= r) {
//			if (SVNRepo.isBadVersion(mid)) {
//				if(!SVNRepo.isBadVersion(mid-1)){
//					return mid;
//				}
//				r= mid -1;
//
//			} else{
//				if(SVNRepo.isBadVersion(mid+1)){
//					return mid;
//				}
//				l = mid +1;
//			}
//			mid = l + (r - l) >> 1;
//		}
		return mid;

	}

	public int findFirstBadVersion1(int n) {
		int start = 1, end = n;
//		while (start + 1 < end) {
//			int mid = start + (end - start) / 2;
//			if (SVNRepo.isBadVersion(mid)) {
//				end = mid;
//			} else {
//				start = mid;
//			}
//		}
//
//		if (SVNRepo.isBadVersion(start)) {
//			return start;
//		}
		return end;
	}

	public static void main(String[] args) {
		System.out.println(findFirstBadVersion(4));
	}
}
