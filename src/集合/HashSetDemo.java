package 集合;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @Author: Mr.M
 * @Date: 2019-04-05 16:14
 * @Description:
 **/
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		TreeSet treeSet = new TreeSet();
		hashSet.add(null);
		hashSet.add(null);
//		new Object().equals();
		System.out.println(hashSet.size());
	}
}
