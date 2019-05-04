import java.util.Collections;
import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-04-17 21:08
 * @Description:
 **/
public class T6 {
	static String string ="hello";
	public static class a{
		public void sp(){
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		T6.a  a = new T6.a();
		a.sp();

		HashMap<String,Integer> hashMap = new HashMap<>();


		hashMap.put("cc",12);
		hashMap.put("dd",13);
		hashMap.put("aa",15);
//		System.out.println(Collections.sort(hashMap));


	}




}
