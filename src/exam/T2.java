package exam;

/**
 * @Author: Mr.M
 * @Date: 2019-03-20 09:37
 * @Description:
 **/
class ClassTest {
	String str = new String("hello");
	char[] ch = {'a', 'b', 'c'};
//	str ="hello";
//	ch[0] = 'd';
//	int a;
//	a = 11;

	public void fun(String str, char ch[]) {
		str = "world";
		ch[0] = 'd';
	}

	public static void main(String[] args) {
		ClassTest test1 = new ClassTest();
		test1.fun(test1.str, test1.ch);
		System.out.print(test1.str + " and ");
		System.out.print(test1.ch);
	}
}
