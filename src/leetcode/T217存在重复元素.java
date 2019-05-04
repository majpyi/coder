package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 18:42
 * @Description: https://leetcode-cn.com/problems/contains-duplicate/
 **/
public class T217存在重复元素 {
	public  boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i : nums)
			if(!set.add(i))
//			if(set.contains(i))
				return true;
		return false;
	}
}
