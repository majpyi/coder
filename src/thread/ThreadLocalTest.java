package thread;

/**
 * @Author: Mr.M
 * @Date: 2019-03-21 14:50
 * @Description:
 **/

import java.util.concurrent.atomic.AtomicInteger;

class UniqueThreadIdGenerator {
	private static final AtomicInteger uniqueId = new AtomicInteger(0);

	private static final ThreadLocal<Integer> uniqueNum = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return uniqueId.getAndIncrement();
		}
	};

	public static void main(String[] args) {
		Thread[] threads = new Thread[5];
		for (int i = 0; i < 5; i++) {
			String name = "Thread-" + i;
			threads[i] = new Thread(name) {
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + ": "
						+ uniqueNum.get());
				}
			};
			threads[i].start();
		}

		System.out.println(Thread.currentThread().getName() + ": "
			+ uniqueNum.get());
	}
}/* Output(输出结果不唯一):
        Thread-1: 2
        Thread-0: 0
        Thread-2: 3
        main: 1
        Thread-3: 4
        Thread-4: 5
 *///:~