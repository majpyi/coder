package test;

/**
 * @Author: Mr.M
 * @Date: 2019-03-24 21:36
 * @Description:
 **/
public class a1 {
	{
		speak();
	}
	void speak() {
		System.out.println("a1");
	}
}

class b2 extends a1 {
	void speak() {
		System.out.println("b2");
	}

	public static void main(String[] args) {
		b2 test = new b2();
		a1 test1 = new a1();
		a1 test2 = new b2();
	}
}