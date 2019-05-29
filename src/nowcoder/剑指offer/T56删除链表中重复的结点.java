package nowcoder.剑指offer;

import java.util.HashMap;

/**
 * @Author: Mr.M
 * @Date: 2019-03-10 10:36
 * @Description: 删除链表中重复的结点
 **/
public class T56删除链表中重复的结点 {
	public static ListNode deleteDuplication(ListNode pHead) {
		pHead = getListNode(pHead);
		return pHead;
	}

	private static ListNode getListNode(ListNode pHead) {
		ListNode x = pHead;

		if (pHead == null) {
			return null;
		}
		while (pHead != null && pHead.next != null && pHead.val == pHead.next.val) {  //  这里需要判断一下pHead是不是为空,
			// 因为在里面的while结束时,可能吧pHead变为空,而里面的循环不会有这种情况的发出
			while (pHead.next != null && pHead.val == pHead.next.val) {
				pHead = pHead.next;
			}
			pHead = pHead.next;
		}

		if (pHead == null) {
			return null;
		} else {
			x.next = pHead;
			getListNode(pHead);
		}
		return pHead;
	}


	public static ListNode deleteDuplication1(ListNode pHead) {
		ListNode result;
		ListNode temp = pHead;
		ListNode index = new ListNode(1);
		index.next = pHead;
		result = index;
		while (temp != null) {
			if (temp.next != null && temp.next.val == temp.val) {
				while (temp.next != null && temp.next.val == temp.val) {
					temp = temp.next;
				}
				temp = temp.next;
				index.next = temp;
			} else {
				index = index.next;
				temp = temp.next;
			}
		}
		return result.next;
	}


	public static void main(String[] args) {
//		ListNode a = new ListNode(1);
//		ListNode a1 = new ListNode(1);
//		ListNode a2 = new ListNode(1);
//		ListNode b = new ListNode(2);
//		ListNode b1 = new ListNode(2);
//		ListNode b2 = new ListNode(2);
//		ListNode c = new ListNode(3);
//		a.next = a1;
//		a1.next = a2;
//		a2.next = b;
//		b.next = b1;
//		b1.next = b2;
//		b2.next = c;
		ListNode a = ListNode.build(new int[]{1, 2, 3, 3, 4, 4, 5});
//		System.out.println();
		ListNode x = deleteDuplication1(a);
		while (x != null) {
			System.out.println(x.val);
			x = x.next;
		}
	}
}
