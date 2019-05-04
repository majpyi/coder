import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 21:53
 * @Description:
 **/
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread b = new MyThread();
		for (int i = 0; i < 3; i++) {
//				Thread a =new Thread(b);
//				Thread a =new Thread(new MyThread());
				Thread a =new Thread(new MyThread());
				a.start();
		}
	}
}
class MyThread implements Runnable {
	@Override
	public synchronized void run() {
		System.out.println("method begin");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("method end");
	}
//	public void run() {
//		System.out.println("method begin");
//		try {
//			Thread.sleep(300);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("method end");
//	}
}


class ThreadLocalExample {

	public static class MyRunnable implements Runnable {

		private ThreadLocal threadLocal = new ThreadLocal();

		@Override
		public void run() {
			threadLocal.set((int) (Math.random() * 100D));
			threadLocal.set((int) (Math.random() * 100D));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
			System.out.println(threadLocal.get());
		}
	}

	public static void main(String[] args) {
		MyRunnable sharedRunnableInstance = new MyRunnable();
		Thread thread1 = new Thread(sharedRunnableInstance);
		Thread thread2 = new Thread(sharedRunnableInstance);
		thread1.start();
		thread2.start();
	}

}



//import java.lang.reflect.Field;
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.ThreadPoolExecutor;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;

class CallerRunsPolicyDemo {

	private static final int THREADS_SIZE = 1;
	private static final int CAPACITY = 1;

	public static void main(String[] args) throws Exception {

		// 创建线程池。线程池的"最大池大小"和"核心池大小"都为1(THREADS_SIZE)，"线程池"的阻塞队列容量为1(CAPACITY)。
		ThreadPoolExecutor pool = new ThreadPoolExecutor(THREADS_SIZE, THREADS_SIZE, 0, TimeUnit.SECONDS,
			new ArrayBlockingQueue<Runnable>(CAPACITY));
		// 设置线程池的拒绝策略为"CallerRunsPolicy"
		pool.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

		// 新建10个任务，并将它们添加到线程池中。
		for (int i = 0; i < 10; i++) {
			Runnable myrun = new MyRunnable("task-"+i);
			pool.execute(myrun);
		}

		// 关闭线程池
		pool.shutdown();
	}
}

class MyRunnable implements Runnable {
	private String name;
	public MyRunnable(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		try {
			System.out.println(this.name + " is running.");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


class MyThread1 extends Thread {
	public void run(){
		super.run();
		for(int i=0; i<500000; i++){
			System.out.println("i="+(i+1));
		}
	}
}

class Run {
	public static void main(String args[]){
		Thread thread = new MyThread1();
		thread.start();
		try {
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}




class MyThread2 extends Thread {
	public void run(){
		super.run();
		for(int i=0; i<500000; i++){
			if(this.interrupted()) {
				System.out.println("线程已经终止， for循环不再执行");
				break;//使用break中断
			}
			System.out.println("i="+(i+1));
		}
		System.out.println("这是for循环外面的语句，也会被执行");

	}
}

class Run2 {
	public static void main(String args[]){
		Thread thread = new MyThread2();
		thread.start();
		try {
			Thread.sleep(2000);
			thread.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}