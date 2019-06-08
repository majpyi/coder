package 笔试.vivo;

import 集合.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-04 19:23
 * @Description:
 **/
public class vivo2 {
	public static ListNode so(ListNode head, int m, int n) {
		ListNode a = head;
		ListNode b = head;
		ListNode r = new ListNode(1);
		r.next = head;
		if(m==1){
			a = r;
		}else {
			while (m-- != 2) {
				a = a.next;
			}
		}
		while (n-- != 1) {
			b = b.next;
		}
		ListNode c = a.next;
		ListNode d = b.next;
		ListNode temp = reverseList(a.next, b.next);
		a.next = temp;
		c.next = d;
		return r.next;
	}


	public static ListNode reverseList(ListNode a, ListNode b) {
		ListNode pre = null;
		while (a != b) {
			ListNode temp = a.next;
			a.next = pre;
			pre = a;
			a = temp;
		}
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
//		so(head1, 3, 4);
		so(head1, 1, 1);
//		so(head1, 2, 3);
		while (head1 != null) {
			System.out.println(head1.val);
			head1 = head1.next;
		}
	}
}
