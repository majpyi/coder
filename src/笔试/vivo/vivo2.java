package 笔试.vivo;

import 集合.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-04 19:23
 * @Description:
 **/
public class vivo2 {
	public static void so(ListNode head, int m, int n) {
		ListNode a = head;
		ListNode b = head;
		while (m-- != 2) {
			a = a.next;
		}
		System.out.println(a.val);
		while (n-- != 1) {
			b = b.next;
		}
		System.out.println(b.val);
		ListNode c = a.next;
		ListNode d = b.next;
		ListNode temp = reverseList(a.next, b.next);
		a.next = temp;
		System.out.println(c.val);
		System.out.println(d.val);
		c.next = d;

	}


	public static ListNode reverseList(ListNode a, ListNode b) {
		ListNode pre = null;  // 已经反转过的头结点
		while (a != b) {
			ListNode temp = a.next;   // 下一个需要反转的

			a.next = pre;  // 反转

			// 改变参数
			pre = a;   // 已经反转过的头结点
			a = temp;    // 下一个需要反转的节点
		}
//		a.next = null;
//		ListNode[] listNodes = new ListNode[2];
//		listNodes[0] = pre;
//		listNodes[1] = a;
//		return listNodes;
		return pre;
	}


	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		ListNode head5 = new ListNode(5);
//		ListNode head5 = new ListNode(9);
//		ListNode head6 = new ListNode(5);
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
//		head5.next = head6;
		so(head1, 3, 4);
		while (head1 != null) {
			System.out.println(head1.val);
			head1 = head1.next;
		}
	}
}
