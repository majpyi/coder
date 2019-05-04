package 常用java数据结构;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-04-17 22:19
 * @Description:
 **/
public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("b", "ccccc");
		map.put("d", "aaaaa");
		map.put("c", "bbbbb");
		map.put("a", "ddddd");

//先转成ArrayList集合
		ArrayList<Map.Entry<String, String>> list =
			new ArrayList<Map.Entry<String, String>>(map.entrySet());

//从小到大排序（从大到小将o1与o2交换即可）
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {

			@Override
			public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
//				return o2.getValue().compareTo(o1.getValue());
				return o1.getValue().compareTo(o2.getValue());
			}

		});

		System.out.println(list);

////新建一个LinkedHashMap，把排序后的List放入
//		LinkedHashMap<String, Float> map2 = new LinkedHashMap<>();
//		for (Map.Entry<String, Float> entry : list) {
//			map2.put(entry.getKey(), entry.getValue());
//		}
//
////遍历输出
//		for (Map.Entry<String, Float> entry : map2.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}




	}
}
