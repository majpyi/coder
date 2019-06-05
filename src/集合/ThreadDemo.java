package 集合;

/**
 * @Author: Mr.M
 * @Date: 2019-03-12 21:15
 * @Description:
 **/
public class ThreadDemo {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		new Thread(new MyThread());
		// 更有难度的
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("hello" + ":" + x);
				}
			}
		}) {
			public void run() {
				for (int x = 0; x < 100; x++) {
					System.out.println("world" + ":" + x);
				}
			}
		}.start();
	}
} //  会按照Thread匿名子类的run()也就是world的方法执行


class MyThread implements Runnable {
	@Override
	public void run() {

	}
}
