/**
 * @Author: Mr.M
 * @Date: 2019-03-18 18:46
 * @Description:
 **/
public class C {
	static int  a =1 ;
	static {
		System.out.println("C  static  "+a);
	}

	{
		System.out.println("C  "+a);
	}

	C(){
		System.out.println("fu   "+a);
//		System.out.println(1);
//		System.out.println(this.hashCode());
		a =2;
		System.out.println("fu   "+a);

	}
}

class cc extends C{
	{
		System.out.println("cc   "+a);
	}

	static {
		System.out.println("cc   static  "+a);
	}

	public static void main(String[] args) {
		System.out.println(a);
		cc  b=  new cc();
		System.out.println(a);
	}
}


//C  static  1
//	cc   static  1
//	1
//	C  1
//	fu   1
//	fu   2
//	cc   2
//	2