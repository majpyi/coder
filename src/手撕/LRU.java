package 手撕;

/**
 * @Author: Mr.M
 * @Date: 2019-04-15 14:40
 * @Description:
 **/


import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K, V> extends LinkedHashMap<K, V> {
	private int cacheSize;

	public LRU(int cacheSize) {
		super(16, 0.75f, true);
		this.cacheSize = cacheSize;
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
//		System.out.println(eldest.getKey() + "=" + eldest.getValue());
		return size() > cacheSize;
	}

	@Override
	public V get(Object key) {
		if (super.get(key) == null) {
//			return (V) (new Integer(-1));
			return (V) (Integer.valueOf(-1));
		}
		return super.get(key);
	}

	public static void main(String[] args) {
		LRU<Integer, Integer> cache = new LRU<>(2);
		cache.put(1, 1);
		cache.put(2, 2);
//		cache.get(1);       // 返回  1
		System.out.println(cache.get(1));
//		System.out.println(cache.get(2));
		cache.put(3, 3);    // 该操作会使得密钥 2 作废
//		cache.get(2);       // 返回 -1 (未找到)
		System.out.println(cache.get(2));
		cache.put(4, 4);    // 该操作会使得密钥 1 作废
//		cache.get(1);       // 返回 -1 (未找到)
		System.out.println(cache.get(1));
//		cache.get(3);       // 返回  3
		System.out.println(cache.get(3));
//		cache.get(4);       // 返回  4
		System.out.println(cache.get(4));
	}


}


