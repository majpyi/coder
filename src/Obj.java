/**
 * @Author: Mr.M
 * @Date: 2019-03-05 10:25
 * @Description:
 **/
public class Obj {
	public static void main(String[] args) {
		Number n = 0;
//		Class<? extends Number> c = n.getClass();
//		System.out.println(c);
		System.out.println(n.getClass());

		Obj a;
		a = new chlien();
		System.out.println(a.getClass());
		System.out.println(Obj.class);


	}
}

class chlien extends Obj {

}


class Father1 {
	//	private String name = "Father'name";
	String name = "Father'name";

	public static void main(String[] args) {
		Father1 instance = new Son();
		System.out.println(instance.name);
		System.out.println(instance.hashCode());
	}
}

class Son extends Father1 {
	public String name = "Son'name";

	public static void main(String[] args) {
		Father1 instance = new Son();
		System.out.println(instance.name);
		System.out.println(instance.hashCode());
		System.out.println(1 ^ 2);  // 如果相对应位值相同，则结果为0，否则为1
		instance.notify();
	}
}


class A {
	int count = 20;
}

class B extends A {
	int count = 200;
}

class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.count);
		B b = new B();
		System.out.println(b.count);
		A ab = b; //向上转型
		System.out.println(ab.count);
	}
}


class Person{

	private int age;
	private String name;

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public Person() {
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person(23, "zhang");
		Person p1 = (Person) p.clone();

		boolean result = p.getName() == p1.getName();
//			? "clone是浅拷贝的" : "clone是深拷贝的";

		System.out.println(result);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}