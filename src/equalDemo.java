import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-05-21 20:20
 * @Description:
 **/
public class equalDemo {
	public static void main(String[] args) {
		String a = "aaa";
		String b = new String("aaa");
		String c = "aaa";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(c==b);
		System.out.println(c==a);

		HashMap hashMap = new HashMap(1);
		hashMap.entrySet();
		hashMap.put(null,null);
		Hashtable hashtable = new Hashtable();
		ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
		concurrentHashMap.put(null,null);
		System.out.println();
	}
}
