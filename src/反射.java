/**
 * @Author: Mr.M
 * @Date: 2019-05-23 16:34
 * @Description:
 **/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class Main1 {
	/**
	 * 代理接口
	 */
	interface ITest {
		String test(String val);
	}

	/**
	 * 代理实现类
	 */
	class Test implements ITest {
		@Override
		public String test(String val) {
			return val + "我是Test";
		}
	}

	/**
	 * 调用处理器
	 */
	class TestInvocationHandler implements InvocationHandler {

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println(method);
			return args[0] + "我是TestProxy";
		}
	}

	/**
	 * 分别对正常实现的 ITest 实现类和动态代理实现类进行调用
	 */
	void testProxy() {
		ITest test = new Test();
		ITest testProxy = (ITest) Proxy.newProxyInstance(this.getClass().getClassLoader(),
			new Class[]{ITest.class}, new TestInvocationHandler());
		System.out.println(test.test("Hello，"));
		System.out.println("----------");
		System.out.println(testProxy.test("Hello，"));
	}

	public static void main(String[] args) {
		new Main1().testProxy();
	}

}


class A12121 extends Exception{
	public static void main(String[] args) throws Exception {
		throw  new A12121();
	}
}