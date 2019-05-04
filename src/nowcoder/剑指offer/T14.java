package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 13:33
 * @Description: 链表中倒数第k个结点
 **/
public class T14 {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null){
			return null;
		}
		ListNode hk =head;
		while (k--!=0 ){
			hk = hk.next;
			if(hk==null){
				break;
			}
		}
		if(k>0){
			return null;
		}
		while (hk!=null){
			hk = hk.next;
			head =head.next;
		}
		return head;
	}
}
