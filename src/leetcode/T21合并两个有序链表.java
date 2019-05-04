package leetcode;

import 常用java数据结构.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 18:37
 * @Description: https://leetcode-cn.com/problems/merge-two-sorted-lists/
 **/
public class T21合并两个有序链表 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head;
		if (l1.val <= l2.val) {
			head = l1;
			l1 = l1.next;
		} else {
			head = l2;
			l2 = l2.next;
		}
		ListNode re = head;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				head.next = l1;
				l1 = l1.next;
				head = head.next;
			} else {
				head.next = l2;
				l2 = l2.next;
				head = head.next;
			}
		}

		while (l1 != null) {
			head.next = l1;
			l1 = l1.next;
			head = head.next;
		}
		while (l2 != null) {
			head.next = l2;
			l2 = l2.next;
			head = head.next;
		}

		return re;
	}
}
