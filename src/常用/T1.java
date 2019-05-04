package 常用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Mr.M
 * @Date: 2019-03-27 21:08
 * @Description:
 **/
public class T1 {
	public static void main(String[] args) {
		String a = "love23next234csdn3423javaeye";
		String regEx = "[^0-9]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(a);
		System.out.println(m);
//		System.out.println(m.replaceAll("").trim());


	}


}
