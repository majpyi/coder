package 常用java数据结构;

import java.util.*;

/**
 * @Author: Mr.M
 * @Date: 2019-04-17 21:40
 * @Description:
 **/
class TreeMapTestKey {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>(
			new Comparator<String>() {
				public int compare(String obj1, String obj2) {
					// 降序排序
					return obj2.compareTo(obj1);
				}
			});
		map.put("b", "ccccc");
		map.put("d", "aaaaa");
		map.put("c", "bbbbb");
		map.put("a", "ddddd");

		Set<String> keySet = map.keySet();
		Iterator<String> iter = keySet.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + ":" + map.get(key));
		}
	}
}


class TreeMapTestValue {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("a", "ddddd");
		map.put("c", "bbbbb");
		map.put("d", "aaaaa");
		map.put("b", "ccccc");

		//这里将map.entrySet()转换成list
		List<Map.Entry<String,String>> list = new ArrayList<>(map.entrySet());
		//然后通过比较器来实现排序
		Collections.sort(list,new Comparator<Map.Entry<String,String>>() {
			//升序排序
			public int compare(Map.Entry<String, String> o1,
			                   Map.Entry<String, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}

		});

		for(Map.Entry<String,String> mapping:list){
			System.out.println(mapping.getKey()+":"+mapping.getValue());
		}
	}
}