class Solution {

	static int a;
	final int b = 1;
	static final int c = 1;

	public void s() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
//		PriorityQueue<Integer> queue = new PriorityQueue<>(16);
////		PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
//			queue.add(1);
//			queue.add(21);
//		System.out.println(queue.peek());
//		System.out.println(queue.size());

		Solution x = new Solution();
		x.s();


	}
}

interface a {

}

interface b extends a {

}


//class Father {
//	static int b;
//	public static int a = 1;
//	static {
//		a = 2;
////		b= a;
//		b =a;
//	}
//
//}
//
//class Child extends Father {
//	public static int b = a;
//}
//
//class ClinitTest {
//	public static void main(String[] args) {
//		System.out.println(Child.b);
//	}
//}


class Super {
	public static int m = 11;

	static {
		System.out.println("执行了super类静态语句块");
	}
}


class Father extends Super {
	public static int m = 33;

	static {
		System.out.println("执行了父类静态语句块");
	}
}

class Child extends Father {
	static {
		System.out.println("执行了子类静态语句块");
	}
}

class StaticTest {
	public static void main(String[] args) {
		System.out.println(Child.m);
	}
}


