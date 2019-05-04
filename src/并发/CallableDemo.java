package 并发;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 21:23
 * @Description: https://zhuanlan.zhihu.com/p/48492896
 **/
public class CallableDemo {

	public static void main(String[] args) {
		Demo demo = new Demo();
		FutureTask<Integer> ft = new FutureTask<Integer>(demo);
		new Thread(ft).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("-----------");
		}
		try {
			Integer sum = ft.get();
			System.out.println("sum=" + sum);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class Demo implements Callable<Integer> {
	int sum;

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
