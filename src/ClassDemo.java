/**
 * @Author: Mr.M
 * @Date: 2019-05-18 18:24
 * @Description: // 如果在不同包中不能直接调用父类中的protected方法，但是可以调用自己的protected方法
 **/
public class ClassDemo extends  ClassLoader {
//public class ClassDemo {
	public void a(String[] args) {
//		Class.forName();
		ClassDemo classDemo =new ClassDemo();
//		classDemo.loadClass();
	}
}
