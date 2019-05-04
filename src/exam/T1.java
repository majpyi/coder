package exam;

/**
 * @Author: Mr.M
 * @Date: 2019-03-20 09:26
 * @Description:
 **/
class Demo {

	static {
		System.out.println("static  demo");
	}

	{
		System.out.println("demo");
	}

	class Super {
		int flag = 1;

		Super() {
			test();
		}

		void test() {
			System.out.println("Super.test() flag=" + flag);
		}
	}

	class Sub extends Super {
		Sub(int i) {
			flag = i;
			System.out.println("Sub.Sub()flag=" + flag);
		}

		void test() {
			System.out.println("Sub.test()flag=" + flag);
		}
	}

	public static void main(String[] args) {
		new Demo().new Sub(5);
	}
}
//Sub.test()flag=1
//	Sub.Sub()flag=5