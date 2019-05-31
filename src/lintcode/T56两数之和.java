package lintcode;

import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-05-31 18:59
 * @Description:
 **/
public class T56两数之和 {
	public int[] twoSum(int[] numbers, int target) {
		// write your code here
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			// 上面的时间复杂度更高
//			if(!hashMap.containsKey(target - numbers[i]))
			if (hashMap.get(target - numbers[i]) == null) {
				hashMap.put(numbers[i], i);
			} else {
				return new int[]{hashMap.get(target - numbers[i]), i};
			}
		}
		return new int[]{};

	}

}
