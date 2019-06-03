package 线程;

/**
 * @Author: Mr.M
 * @Date: 2019-06-01 18:23
 * @Description:
 **/
public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {
		Thread thread =  new Thread(new A());
		thread.start();
		thread.join();
	}
}

class A implements Runnable{

	@Override
	public void run() {
		System.out.println(1);
	}
}