package 并发.多线程求和;

/**
 * @Author: Mr.M
 * @Date: 2019-05-14 09:38
 * @Description:
 **/

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ThreadAddBarrier {
	public static int sum = 0;
	public static Object LOCK = new Object();

	public static CyclicBarrier cyclicbarrier = new CyclicBarrier(4,
		new Runnable() {
			public void run() {
				System.out.println(sum);
			}
		});

	public static void main(String[] args) throws InterruptedException {
		ThreadAddBarrier add = new ThreadAddBarrier();
		ThreadTest thread1 = add.new ThreadTest(1, 25);
		ThreadTest thread2 = add.new ThreadTest(26, 50);
		ThreadTest thread3 = add.new ThreadTest(51, 75);
		ThreadTest thread4 = add.new ThreadTest(76, 100);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

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
			try {
				cyclicbarrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		}

		public ThreadTest(int begin, int end) {
			this.begin = begin;
			this.end = end;
		}
	}
}