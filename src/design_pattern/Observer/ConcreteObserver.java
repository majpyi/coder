package design_pattern.Observer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-11 15:54
 * @Description:
 **/
public class ConcreteObserver implements Observer {

	private String observerName;


	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}


	@Override
	public void update(Subject subject) {
		String weatherContent = ((ConcreteSubject) subject).getSubjextstate();
		System.out.println(observerName+"   "+ weatherContent);
	}

}
