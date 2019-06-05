package 线程;

import java.util.concurrent.*;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 11:25
 * @Description:
 **/
public class CallableDemo {
	public static void test1(){

		ExecutorService pool = Executors.newCachedThreadPool();
		Future<String> result = pool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(2000);
				return "ok";
			}
		});
		try {
			System.out.println(result.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}


	public static void test2(){
		ExecutorService pool = Executors.newCachedThreadPool();
		Future<String> result = pool.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				Thread.sleep(2000);
				return "ok";
			}
		});
//			System.out.println(result.get());
	}


	public static void test3(){
		FutureTask<String> task = new FutureTask<>(new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "ok";
			}
		});
		Thread t = new Thread(task);
		t.start();
		try {
			System.out.println(task.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}

}



class Test {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newCachedThreadPool();
		Task task = new Task();
		Future<Integer> future = executor.submit(task);

		/**
		 接下来就可以通过future来获取一些关于Task的运行信息了：
		 比如：future.get();来获取最后执行结果
		 future.isDown();来判断是否完成
		 等等...
		 **/

		executor.shutdown();

	}
}

class Task implements Callable<Integer>{
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		//do something;
		return sum;
	}
}


class Test1 {
	public static void main(String[] args) {
		//第一种方式
		ExecutorService executor = Executors.newCachedThreadPool();
		Task task = new Task();
		FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
		executor.submit(futureTask);


		//第二种方式
		/**
		 Task task = new Task();
		 FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
		 Thread thread = new Thread(futureTask);
		 thread.start();
		 **/

		/**
		 接下来就可以通过futureTask来获取一些关于Task的运行信息了：
		 比如：futureTask.get();来获取最后执行结果
		 futureTask.isDown();来判断是否完成
		 等等...
		 **/

		executor.shutdown();
	}
}

