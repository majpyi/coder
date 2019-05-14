package nowcoder.剑指offer;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 13:33
 * @Description: 链表中倒数第k个结点
 **/

//  双指针问题
public class T14链表中倒数第k个结点 {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null){
			return null;
		}
		ListNode hk =head;
		while (k--!=0 ){
			if(hk==null){
				return null;
//				break;
			}
			hk = hk.next;
		}
//		if(k>0){
//			return null;
//		}
		while (hk!=null){
			hk = hk.next;
			head =head.next;
		}
		return head;
	}
}
