package design_pattern.Observer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-11 15:57
 * @Description:
 **/
public class Client {

	public static void main(String[] args) {
		ConcreteSubject weather = new ConcreteSubject();

		ConcreteObserver observer1 = new ConcreteObserver();
		ConcreteObserver observer2 = new ConcreteObserver();


		observer1.setObserverName("mjy");
		observer2.setObserverName("ws");

		weather.attach(observer1);
		weather.attach(observer2);

		weather.setSubjextstate("hello");


	}


}
