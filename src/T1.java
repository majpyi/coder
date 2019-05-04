import java.util.Scanner;

/**
 * @Author: Mr.M
 * @Date: 2019-03-12 10:33
 * @Description:
 **/
class X {
	Y b = new Y();

	X() {
		System.out.print("X");
	}
}

class Y {
	Y() {
		System.out.print("Y");
	}
}

class Z extends X {
	Y y = new Y();

	Z() {
		//super
		System.out.print("Z");
//		System.out.println(y);  //   必须先进行成员变量的初始化才能调用
	}

	public static void main(String[] args) {
		new Z();
	}
}

//   YXYZ


class Fu {
	public int num = 10;

	{
		System.out.println(num);
	}


	public Fu() {
		System.out.println("fu");
//		System.out.println(num);
	}
}

class Zi extends Fu {
	public int num = 20;
	static String a = "a";

	static {
		System.out.println(a);
	}

	{
		System.out.println(num);
		System.out.println(super.num);
	}

	public Zi() {
		System.out.println("zi");
//		System.out.println(num);
//		System.out.println(super.num);

	}
//	public void show(){
//		int num = 30;
//		System.out.println(num); //30
//		System.out.println(this.num); //20
//		System.out.println(super.num); //10
//	}
}

class ExtendsTest {
	public static void main(String[] args) {
		Zi z = new Zi();
//		z.show();
	}
}


class s {
	//	final int age;
	static int age;

	//    int age;
//{
//    age =10;
//}
	public static void main(String[] args) {
		s a = new s();
		System.out.println(a.age);
	}
}


class finala {
	int age = 10;
}

class cilne {
	public static void main(String[] args) {
		final finala a = new finala();
		final int b = 1;
//		b =2;
		a.age = 11;
		System.out.println(a.age);
	}
}


interface abstr2 {
	public void x();

	public void y();
}

abstract class imply2 implements abstr2 {

}


class outter {
	public void outerer() {
		int a = 1;
		class inner {
			public void bbb() {
				System.out.println(a);
			}
		}
	}

	public static void main(String[] args) {
		String s4 = "";
		String s5 = null;
		System.out.println("isEmpty:" + s4.isEmpty());
		// NullPointerException
		// s5对象都不存在，所以不能调用方法，空指针异常
		System.out.println("isEmpty:" + s5.isEmpty());
	}
}


class StringDemo4 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);// false
		System.out.println(s3.equals((s1 + s2)));// true

		System.out.println(s3 == "hello" + "world");// false 这个我们错了，应该是true
		System.out.println(s3.equals("hello" + "world"));// true

		// 通过反编译看源码，我们知道这里已经做好了处理。
		// System.out.println(s3 == "helloworld");
		// System.out.println(s3.equals("helloworld"));


		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		String s = sc2.nextLine();
		String s = sc.nextLine();
		System.out.println("a:" + a + ",s:" + s);
	}
}

class TT1{
	public static void str(String x){
		x = "123";
	}

	public static void main(String[] args) {
		String a ="abc";
		int[] b =new int[12];
//		str(a);
//		System.out.println(a);
		System.out.println(a.length());
		System.out.println(b.length);
	}

}