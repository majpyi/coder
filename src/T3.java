/**
 * @Author: Mr.M
 * @Date: 2019-03-21 10:03
 * @Description:
 **/
public class T3 {
	static int s;
	int i;
	int j;
	{
		int i=1;
		i++;
		j++;
		s++;
//		System.out.println(i+"  "+j+"   "+s);

	}
	public void test(int j){
		j++;
		i++;
		s++;
//		System.out.println(i+" t "+j+"  t "+s);
	}

	public static void main(String[] args) {
		T3 obj1 =new T3();
		T3 obj2 =new T3();
		obj1.test(10);
		obj1.test(20);
		obj2.test(30);
		System.out.println(obj1.i+" x "+obj1.j+" x  "+obj1.s);
		System.out.println(obj2.i+" x "+obj2.j+" x  "+obj2.s);

	}

}
