package lintcode;

import 集合.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 19:59
 * @Description:
 **/
public class T1661删除链表中的第n到m个节点 {
	public ListNode deleteNode(ListNode head, int n, int m) {
		// Write your code here
		if(n==0){
			while (m--!=0){
				head = head.next;
			}
			return head.next;
		}else {
			ListNode p = head;
			ListNode q = head;
			while (--n!=0){
				p = p.next;
			}
			while (m--!=0){
				q = q.next;
			}
			p.next = q.next;
			return head;
		}
	}
}
