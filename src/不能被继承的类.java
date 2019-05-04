/**
 * @Author: Mr.M
 * @Date: 2019-03-09 19:54
 * @Description:
 **/
public class 不能被继承的类 {
	private 不能被继承的类() {
	}
}

class AA{
	public void speak(int x){
		System.out.println("AA");
	}
}

class BB extends AA{
	@Override
	public void speak(int  xq) {
	}
}