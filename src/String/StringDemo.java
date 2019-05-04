package String;

/**
 * @Author: Mr.M
 * @Date: 2019-03-19 16:55
 * @Description:
 **/
public class StringDemo {
	public static void main(java.lang.String[] args) {
//		String original = "abc";
//		String a = "abc";
//		String s = new String(a);
//		System.out.println(a==s);

		java.lang.String s0 = "kvill";
//		s0.substring()
		java.lang.String s1 = new java.lang.String("kvill");
		java.lang.String s2 = "kv" + new java.lang.String("ill");

		java.lang.String s = "ill";
		java.lang.String s3 = "kv" + s;


//		System.out.println(s0 == s1);       // false
//		System.out.println(s0 == s2);       // false
//		System.out.println(s1 == s2);       // false
//		System.out.println(s0 == s3);       // false
//		System.out.println(s1 == s3);       // false



		java.lang.String ss = "123456";
		System.out.println("ss = " + ss);     // ss = 123456

		java.lang.String ss1 = ss.replace('1', '0');
		java.lang.String ss2 = ss.substring(1);
		System.out.println("ss = " + ss);     //ss = 123456
		System.out.println("ss1 = " + ss1);     //ss = 123456
		System.out.println(ss2==ss);     //ss = 123456
	}
}


class TestString{
	public static void main(java.lang.String args[]){
		java.lang.String str1 = "abc";
		java.lang.String str2 = new java.lang.String("abc");
		java.lang.String str3 = str1.intern();

		System.out.println( str1 == str2 );   //false
		System.out.println( str1 == str3 );   //true
	}
}


class test{
	public static void main(java.lang.String[] args) {

		java.lang.String str2 = "ab";  //1个对象
		java.lang.String str3 = "cd";  //1个对象
		java.lang.String str4 = str2+str3;
		java.lang.String str5 = "abcd";
		System.out.println("str4 = str5 : " + (str4==str5)); // false


		java.lang.String str1 = "ab" + "cd";  //1个对象
		java.lang.String str11 = "abcd";
		System.out.println("str1 = str11 : "+ (str1 == str11));   // true

		final java.lang.String str8 = "cd";
		java.lang.String str9 = "ab" + str8;
		java.lang.String str89 = "abcd";
		System.out.println("str9 = str89 : "+ (str9 == str89));     // true
		//↑str8为常量变量，编译期会被优化

		java.lang.String str6 = "b";
		java.lang.String str7 = "a" + str6;
		java.lang.String str67 = "ab";
		System.out.println("str7 = str67 : "+ (str7 == str67));     // false
		//↑str6为变量，在运行期才会被解析。
	}
}

//private class a{
//
//}