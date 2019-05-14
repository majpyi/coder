package leetcode;

import 常用java数据结构.ListNode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class T206反转链表 {

	//  MY
	public ListNode reverseList1(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode newhead = head.next;   // 单独处理第一个节点,使他下一个节点为空
		head.next = null;
		ListNode newlist = head;
		head = newhead;

		while (head != null) {
			newhead = head.next;
			head.next = newlist;
			newlist = head;
			head = newhead;
		}
		return newlist;
	}

	public ListNode reverseList2(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextTemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextTemp;
		}
		return prev;
	}

	//   MY
	public ListNode reverseList4(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode temp = null;
		while (cur != null) {
			temp = cur.next;  //  记录需要反转的下一个节点
			cur.next = pre;   //  把已经反转链表的起始节点连到当前节点后面
			pre = cur;        //  当前已经反转的节点作为当前反转过的链表的起始节点
			cur = temp;       //  将当前已经反转过的节点的指针指向需要反转的下一个节点
		}
		return pre;
	}


	public ListNode reverseList3(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode p = reverseList3(head.next);
		head.next.next = head;
		head.next = null;
		return p;
	}
}
