package 并发.多线程求和;

/**
 * @Author: Mr.M
 * @Date: 2019-05-14 09:31
 * @Description:
 **/

import java.util.concurrent.CountDownLatch;

public class ThreadAddLatch {
	public static int sum = 0;
	public static Object LOCK = new Object();
	public static CountDownLatch countdown = new CountDownLatch(4);

	public static void main(String[] args) throws InterruptedException {
		ThreadAddLatch add = new ThreadAddLatch();
		ThreadTest thread1 = add.new ThreadTest(1, 25);
		ThreadTest thread2 = add.new ThreadTest(26, 50);
		ThreadTest thread3 = add.new ThreadTest(51, 75);
		ThreadTest thread4 = add.new ThreadTest(76, 100);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		countdown.await();
		System.out.println("total result: " + sum);
	}

	class ThreadTest extends Thread {
		private int begin;
		private int end;

		@Override
		public void run() {
			synchronized (LOCK) {
				for (int i = begin; i <= end; i++) {
					sum += i;
				}
				System.out.println("from " + Thread.currentThread().getName() + " sum=" + sum);
			}
			countdown.countDown();
		}

		public ThreadTest(int begin, int end) {
			this.begin = begin;
			this.end = end;
		}
	}
}
