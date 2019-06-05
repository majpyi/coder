package lintcode;

import 集合.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-03 15:06
 * @Description:
 **/
public class T219在排序链表中插入一个节点 {
	public ListNode insertNode(ListNode head, int val) {
		// write your code here
		ListNode pre = head;

		if (head == null) {
			return new ListNode(val);
		}

		if (head.val >= val) {
			ListNode node = new ListNode(val);
			node.next = head;
			return node;
		}
		if (head.next == null) {
			head.next = new ListNode(val);
			return head;
		}

		ListNode cur = head.next;
		while (cur != null && cur.val < val) {
			pre = pre.next;
			cur = cur.next;
		}

		ListNode node = new ListNode(val);
		pre.next = node;
		node.next = cur;

		return head;
	}
}
