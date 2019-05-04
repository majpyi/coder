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
