package lintcode;

import 集合.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 19:42
 * @Description:
 **/
public class T228链表的中点 {
	public ListNode middleNode(ListNode head) {
		if(head==null){
			return null;
		}
		// write your code here
		ListNode mid = head;
		ListNode last = head;

		while (last.next!=null && last.next.next!=null){
			last = last.next.next;
			mid = mid.next;
		}
		return mid;
	}
}
