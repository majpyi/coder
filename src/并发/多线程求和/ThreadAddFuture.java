package 并发.多线程求和;

/**
 * @Author: Mr.M
 * @Date: 2019-05-14 09:44
 * @Description:
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadAddFuture {
	public static List<Future> futureList = new ArrayList<Future>();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int sum = 0;
		ThreadAddFuture add = new ThreadAddFuture();
		ExecutorService pool = Executors.newFixedThreadPool(4);

		for (int i = 1; i <= 76; ) {
			ThreadTest thread = add.new ThreadTest(i, i + 24);
			Future<Integer> future = pool.submit(thread);
			futureList.add(future);
			i += 25;
		}

		if (futureList != null && futureList.size() > 0) {
			for (Future<Integer> future : futureList) {
				sum += (Integer) future.get();
			}
		}
		System.out.println("total result: " + sum);
		pool.shutdown();
	}

	class ThreadTest implements Callable<Integer> {
		private int begin;
		private int end;
		public int sum = 0;

		public ThreadTest(int begin, int end) {
			this.begin = begin;
			this.end = end;
		}

		@Override
		public Integer call() throws Exception {
			for (int i = begin; i <= end; i++) {
				sum += i;
			}
			System.out.println("from " + Thread.currentThread().getName() + " sum=" + sum);
			return sum;
		}
	}
}
