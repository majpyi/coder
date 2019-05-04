package design_pattern.Observer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-11 15:49
 * @Description:
 **/
public class ConcreteSubject extends Subject {

	private String subjextstate;

	public String getSubjextstate() {
		return subjextstate;
	}

	public void setSubjextstate(String subjextstate) {
		this.subjextstate = subjextstate;
		this.notifyObserver();
	}

}
