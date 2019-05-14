package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 13:46
 * @Description: 反转链表
 **/
public class T15反转链表 {
	public ListNode ReverseList(ListNode head) {
		ListNode start = null;
		ListNode next = null;
		while (head!=null){
			next = head.next;  //  记录下一个需要反转的节点


			head.next = start;  //  把当前节点放到反转链表的最前面

			start = head;   // start当前已经反转链表的最前面
			head = next;  // head仍然作为下一个需要反转的节点
		}
		return start;
	}
}
