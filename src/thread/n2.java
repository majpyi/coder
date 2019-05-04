package thread;

import java.io.IOException;

/**
 * @Author: Mr.M
 * @Date: 2019-03-19 21:47
 * @Description:
 **/
public class n2 {

	public static void main(String[] args) throws IOException {
		n2 test = new n2();
		MyThread thread = test.new MyThread();
		thread.start();
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
		}
		thread.interrupt();
	}

	class MyThread extends Thread {
		@Override
		public void run() {
			int i = 0;
			while (i < Integer.MAX_VALUE) {
				System.out.println(i + " while循环");
				i++;
			}
		}
	}
}
