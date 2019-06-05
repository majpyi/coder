package lintcode;

import 集合.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 19:51
 * @Description:
 **/
public class T822相反的顺序存储 {
	public List<Integer> reverseStore(ListNode head) {
		// write your code here
		Stack<Integer> stack = new Stack<>();
		while (head!=null){
			stack.push(head.val);
			head = head.next;
		}
		ArrayList<Integer> arrayList = new ArrayList<>();
		while (!stack.isEmpty()){
			arrayList.add(stack.pop());
		}
		return arrayList;
	}
}
