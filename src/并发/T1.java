package 并发;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 20:11
 * @Description:
 **/
public class T1 {

	public static void main(String[] args) {
		T1 a =new T1();
		a.test();
	}

	public void test() {
		final ReentrantLock reentrantLock = new ReentrantLock();
		final Condition condition = reentrantLock.newCondition();


		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					reentrantLock.lock();
					System.out.println(Thread.currentThread().getName() + "在等待被唤醒");
					condition.await();
					System.out.println(Thread.currentThread().getName() + "恢复执行了");
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					reentrantLock.unlock();
				}
			}
		}, "thread1").start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					reentrantLock.lock();
					System.out.println(Thread.currentThread().getName() + "抢到了锁");
					condition.signal();
					System.out.println(Thread.currentThread().getName() + "唤醒其它等待的线程");
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					reentrantLock.unlock();
					System.out.println("释放锁");
				}
			}
		}, "thread2").start();

	}
}
