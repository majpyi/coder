import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-04-05 21:00
 * @Description:
 **/
class TT11 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int m = scanner.nextInt();
//		int n = scanner.nextInt();
//		Long[] nums = new Long[n.intValue()];
//		for (int i = 0; i < n; i++) {
//			nums[i] = scanner.nextLong();
//		}
//		if (nums[0] != 1) {
//			System.out.println(-1);
//		}

//		Arrays.sort(nums);
		int[] nums = {1};
		int m = 1000000000;
		int n = nums.length;
		int sum = 0;
		int ans = 0;
		while (sum < m) {
			for (int i = n - 1; i >= 0; i--) {
				if (sum + 1 >= nums[i]) {
//				if (sum+1  >= nums[i]) {
					sum += nums[i];
					ans++;
					break;
				}
			}
		}
		System.out.println(ans);
		System.out.println(Integer.MAX_VALUE > Math.pow(10, 9));
		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Math.pow(10,9));
		System.out.println(Integer.toString((int) Math.pow(10, 9)));
//		System.out.println("1000000000");
	}
}
