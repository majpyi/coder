package 手撕;

import 集合.ListNode;
/**
 * @Author: Mr.M
 * @Date: 2019-05-06 16:35
 * @Description:
 **/
public class 链表反转 {
	public ListNode reverseList4(ListNode head) {
		ListNode pre = null;  // 已经反转过的头结点
		while (head!=null){
			ListNode temp = head.next;   // 下一个需要反转的

			head.next = pre;  // 反转

			// 改变参数
			pre = head;   // 已经反转过的头结点
			head = temp;    // 下一个需要反转的节点
		}
		return pre;
	}
}
