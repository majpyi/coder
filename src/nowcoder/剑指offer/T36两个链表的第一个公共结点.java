package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-08 15:06
 * @Description: 两个链表的第一个公共结点
 **/
public class T36两个链表的第一个公共结点 {
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		if(pHead1==null || pHead2==null){
			return null;
		}
		int len1 = 0;
		int len2 = 0;
		ListNode x1 = pHead1;
		ListNode x2 = pHead2;
		while (x1.next!=null){
			x1 = x1.next;
			len1++;
		}
		while (x2.next!=null){
			x2 = x2.next;
			len2++;
		}

		int diff = len1-len2;
		while (diff>0){
			pHead1 = pHead1.next;
			diff--;
		}
		while (-diff>0){
			pHead2 = pHead2.next;
			diff++;
		}
		while (pHead1!=pHead2){
			pHead1 = pHead1.next;
			pHead2 = pHead2.next;
		}
		return pHead1;
	}
}
