package leetcode;

import 集合.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-06-08 15:33
 * @Description:
 **/
public class T92反转链表II {
	public static ListNode so(ListNode head, int m, int n) {
		ListNode a = head;
		ListNode b = head;
		ListNode r = new ListNode(1);
		r.next = head;
		//  当m==1的时候这个时候是头节点，而在链表的处理当中，头结点因为没有前驱节点而需要进行特许的判断和处理
		if (m == 1) {
			a = r;
		} else {
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


	public ListNode reverseBetween(ListNode head, int m, int n) {

		// Empty list
		if (head == null) {
			return null;
		}

		// Move the two pointers until they reach the proper starting point
		// in the list.
		ListNode cur = head, prev = null;
		while (m > 1) {
			prev = cur;
			cur = cur.next;
			m--;
			n--;
		}

		// The two pointers that will fix the final connections.
		ListNode con = prev, tail = cur;

		// Iteratively reverse the nodes until n becomes 0.
		ListNode third = null;
		while (n > 0) {
			third = cur.next;
			cur.next = prev;
			prev = cur;
			cur = third;
			n--;
		}

		// Adjust the final connections as explained in the algorithm
		if (con != null) {
			con.next = prev;
		} else {
			head = prev;
		}

		tail.next = cur;
		return head;
	}


	// Object level variables since we need the changes
	// to persist across recursive calls and Java is pass by value.
	private boolean stop;
	private ListNode left;

	public void recurseAndReverse(ListNode right, int m, int n) {

		// base case. Don't proceed any further
		if (n == 1) {
			return;
		}

		// Keep moving the right pointer one step forward until (n == 1)
		right = right.next;

		// Keep moving left pointer to the right until we reach the proper node
		// from where the reversal is to start.
		if (m > 1) {
			this.left = this.left.next;
		}

		// Recurse with m and n reduced.
		this.recurseAndReverse(right, m - 1, n - 1);

		// In case both the pointers cross each other or become equal, we
		// stop i.e. don't swap data any further. We are done reversing at this
		// point.
		if (this.left == right || right.next == this.left) {
			this.stop = true;
		}

		// Until the boolean stop is false, swap data between the two pointers
		if (!this.stop) {
			int t = this.left.val;
			this.left.val = right.val;
			right.val = t;

			// Move left one step to the right.
			// The right pointer moves one step back via backtracking.
			this.left = this.left.next;
		}
	}

	public ListNode reverseBetween1(ListNode head, int m, int n) {
		this.left = head;
		this.stop = false;
		this.recurseAndReverse(head, m, n);
		return head;
	}


}
