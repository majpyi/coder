package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 10:06
 * @Description: 链表中环的入口结点
 **/
public class T55链表中环的入口结点 {
	//	public static ListNode EntryNodeOfLoop(ListNode pHead) {
//		if (pHead == null) {
//			return null;
//		}
//		ListNode fast = pHead;
//		ListNode slow = pHead.next;
//		while (fast != slow) {
//			if (fast.next != null) {
//				fast = fast.next.next;
//				if (fast == null) {
//					return null;
//				}
//			}else {
//				return null;
//			}
//			if (slow == null) {
//				return null;
//			}else {
//				slow = slow.next;
//			}
//		}
//
//		fast = pHead;
//		while (fast != slow) {
//			fast = fast.next;
//			slow = slow.next;
//		}
//		return fast;
//	}
	public static ListNode EntryNodeOfLoop(ListNode pHead) {
		if (pHead == null) {
			return null;
		}
		ListNode fast = pHead;
		ListNode slow = pHead;
//		while (fast != slow) {
//			if (fast.next != null) {
//				fast = fast.next.next;
//				if (fast == null) {
//					return null;
//				}
//			}else {
//				return null;
//			}
//			if (slow == null) {
//				return null;
//			}else {
//				slow = slow.next;
//			}
//		}
		while (fast != null && fast.next != null && slow != null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow){
				fast = pHead;
				while (fast != slow) {
					fast = fast.next;
					slow = slow.next;
				}
				return fast;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ListNode x = new ListNode(1);
		ListNode y = new ListNode(2);
		ListNode z = new ListNode(3);
		ListNode a = new ListNode(4);
		x.next = y;
		y.next = z;
		z.next = a;
		a.next = y;
		System.out.println(EntryNodeOfLoop(x).val);
	}
}
