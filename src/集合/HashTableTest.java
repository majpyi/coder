package 集合;

import java.util.Hashtable;
import java.util.Iterator;

/**
 * @Author: Mr.M
 * @Date: 2019-03-22 21:50
 * @Description:
 **/
public class HashTableTest {
	public static void main(String[] args) {
		Hashtable<String,Integer> hashtable = new Hashtable<>();
		hashtable.put("hello",1);
		hashtable.put("world",1);
		hashtable.put("java",1);
		// 迭代器遍历
		Iterator<String> it = hashtable.keySet().iterator();
		while (it.hasNext()) {
			String s = it.next();
			if ("world".equals(s)) {
				hashtable.put("javaee",1);
			}
		}
		hashtable.put(null,1);
//		hashtable.put("h",null);
		System.out.println(hashtable);


		//Exception in thread "main" java.util.ConcurrentModificationException
//		HashMap<String,Integer> hashmap = new HashMap<>();
//		hashmap.put("hello",1);
//		hashmap.put("world",1);
//		hashmap.put("java",1);
//		// 迭代器遍历
//		Iterator<String> it = hashmap.keySet().iterator();
//		while (it.hasNext()) {
//			String s = it.next();
//			if ("world".equals(s)) {
////				hashmap.put("javaee",1);
//				hashmap.put("world",2);
//			}
//		}
//		hashmap.put(null,1);
//		hashmap.put(null,null);
//		System.out.println(hashmap);


	}
	
	
	
	
}
