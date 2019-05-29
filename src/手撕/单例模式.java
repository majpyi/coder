package 手撕;

/**
 * @Author: Mr.M
 * @Date: 2019-05-22 10:02
 * @Description:
 **/
class Singleton1 {
	private static Singleton1 instance = new Singleton1();

	private Singleton1() {
	}

	public static Singleton1 getInstance() {
		return instance;
	}
}

class Singleton2 {
	private static Singleton2 instance;

	private Singleton2() {
	}

	public static Singleton2 getInstance() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
}


class Singleton3 {
	private static Singleton3 instance;

	private Singleton3() {
	}

	public static synchronized Singleton3 getInstance() {
		if (instance == null) {
			instance = new Singleton3();
		}
		return instance;
	}
}


class Singleton4 {
	private volatile static Singleton4 instance;

	private Singleton4() {
	}

	public static Singleton4 getInstance() {
		if (instance == null) {
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
}


class Singleton5 {
	private Singleton5() {
	}

	public static Singleton5 getInstance() {
		return SingletonHolder.sInstance;
	}

	private static class SingletonHolder {
		private static final Singleton5 sInstance = new Singleton5();
	}
}

enum EasySingleton {
	INSTANCE;

	public static void main(String[] args) {
		System.out.println(EasySingleton.INSTANCE);
	}
}