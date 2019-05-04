package leetcode;

import java.util.HashSet;

/**
 * @Author: Mr.M
 * @Date: 2019-04-04 09:30
 * @Description: https://leetcode-cn.com/problems/unique-email-addresses/
 **/
public class T929独特的电子邮件地址 {
	public int numUniqueEmails(String[] emails) {
		HashSet<String> hashSet = new HashSet<>();
		for (String x : emails){
			String[] strings1= x.split("\\+");
			String[] strings2= x.split("@");
			hashSet.add(strings1[0].replace(".","")+strings2[strings2.length-1]);
		}
		return hashSet.size();
	}
}
