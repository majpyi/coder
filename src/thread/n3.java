package thread;

/**
 * @Author: Mr.M
 * @Date: 2019-03-19 21:52
 * @Description:
 **/
class MyThread extends Thread{
	private volatile boolean isStop = false;
	@Override
	public void run() {
		int i = 0;
		while(!isStop){
			i++;
		}
	}

	public void setStop(boolean stop){
		this.isStop = stop;
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread thread =new MyThread();
		thread.start();
		thread.sleep(100);
		thread.setStop(true);
	}
}
