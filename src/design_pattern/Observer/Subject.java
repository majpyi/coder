package design_pattern.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-03-11 15:43
 * @Description: 被观察者接口
 **/
abstract class Subject {

	private List<Observer> observerList = new ArrayList<>();

	public void attach(Observer observer){
		observerList.add(observer);
	}

	public void detach(Observer observer){
		observerList.remove(observer);
	}

	public void notifyObserver(){
		for (Observer observer : observerList){
			observer.update(this);
		}

	}

}
