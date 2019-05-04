package thread;

import java.io.IOException;

/**
 * @Author: Mr.M
 * @Date: 2019-03-19 21:44
 * @Description:
 **/
class Test {

	public static void main(String[] args) throws IOException {
		Test test = new Test();
		MyThread thread = test.new MyThread();
		thread.start();
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {

		}
		thread.interrupt();
	}

	private class MyThread extends Thread {
		@Override
		public void run() {
			try {
				System.out.println("进入睡眠状态");
				Thread.currentThread().sleep(10000);
				System.out.println("睡眠完毕");
			} catch (InterruptedException e) {
				System.out.println("得到中断异常");
			}
			System.out.println("run方法执行完毕");
		}
	}
}


