package thread;

/**
 * @Author: Mr.M
 * @Date: 2019-03-19 22:01
 * @Description:
 **/
class CountOperate extends Thread {

	public CountOperate() {
		super("Thread-CO");     // 线程 CountOperate 的名字
		System.out.println("CountOperate---begin");
		System.out.println("Thread.currentThread().getName()="
			+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("CountOperate---end");
	}

	@Override
	public void run() {
		System.out.println("run---begin");
		System.out.println("Thread.currentThread().getName()="
			+ Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("run---end");
	}

	public static void main(String[] args) {
		CountOperate c = new CountOperate();
		Thread t1 = new Thread(c);
		t1.setName("A");
		t1.start();
		c.start();
	}
}/* Output:(输出结果不唯一)
        CountOperate---begin                             ....... 行 1
        Thread.currentThread().getName()=main            ....... 行 2
        this.getName()=Thread-CO                         ....... 行 3
        CountOperate---end                               ....... 行 4
        run---begin                                      ....... 行 5
        Thread.currentThread().getName()=A               ....... 行 6
        run---begin                                      ........行 7
        Thread.currentThread().getName()=Thread-CO       ....... 行 8
        this.getName()=Thread-CO                         ....... 行 9
        run---end                                        ....... 行 10
        this.getName()=Thread-CO                         ....... 行 11
        run---end                                        ....... 行 12
 *///:~
