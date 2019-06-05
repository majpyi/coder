package lintcode;

import 集合.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 19:39
 * @Description:
 **/
public class T466链表节点计数 {
	public int countNodes(ListNode head) {
		// write your code here
		int num = 0;
		while (head!=null){
			head = head.next;
			num++;
		}
		return num;
	}
}
