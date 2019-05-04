/**
 * @Author: Mr.M
 * @Date: 2019-03-25 21:15
 * @Description:
 **/
interface an {
	int add();
}


//jdk1.8及1.9版本的确可以不写final了，但是还是不可变，相当于final。
// https://www.zhihu.com/question/21395848
public class InnerClass {
//	final int x = 1;
	int x = 1;
	{
		x=x+2;
	}
//	an get(int x) {
	an get() {                   // 只是外部对内部来说是不可变的,内部不能改变外部,而外部是可以改变的
//		final int y = 1;
		int y = 1;
		return new an() {
			int z = 3;
			public int add() {
//				y++;
//				x++;
				return x + y + z;
			}
		};
	}


	public static void main(String[] args) {
		InnerClass x = new InnerClass();
//		System.out.println(x.get(1).add());
		System.out.println(x.get().add());
	}
}
