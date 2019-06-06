package lintcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Mr.M
 * @Date: 2019-06-06 19:32
 * @Description:
 **/
public class T9FizzBuzz问题 {
	public List<String> fizzBuzz(int n) {
		// write your code here
		ArrayList<String> arrayList = new ArrayList<>();
		for(int i=1;i<=n;i++){
			if (i % 3 == 0 && i % 5 == 0) {
				arrayList.add("fizz buzz");
			}else if(i%3==0){
				arrayList.add("fizz");
			}else if(i%5==0){
				arrayList.add("buzz");
			}else {
				arrayList.add(String.valueOf(i));
			}
		}
		return arrayList;
	}
}
