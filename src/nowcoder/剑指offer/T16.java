package nowcoder.剑指offer;

import java.lang.reflect.WildcardType;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 14:06
 * @Description: 合并两个排序的链表
 **/
public class T16 {

	//   非递归
	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode re = new ListNode(1);
		ListNode r = re;
		ListNode r1 = null;
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				re.next = list1;
				r1 = list1.next;
				list1.next = null;
				list1 = r1;
				re = re.next;
			} else {
				re.next = list2;
				r1 = list2.next;
				list2.next = null;
				list2 = r1;
				re = re.next;
			}
		}
		while (list1 != null) {
			re.next = list1;
			r1 = list1.next;
			list1.next = null;
			list1 = r1;
			re = re.next;
		}
		while (list2 != null) {
			re.next = list2;
			r1 = list2.next;
			list2.next = null;
			list2 = r1;
			re = re.next;
		}
		return r.next;
	}

	public ListNode Merge1(ListNode list1, ListNode list2) {
		if(list1==null){
			return list2;
		}
		if(list2==null){
			return list1;
		}
		ListNode newHead = null;
		if(list1.val < list2.val){
			newHead = list1;
			newHead.next = Merge1(list1.next,list2);
		}
		if(list2.val < list1.val){
			newHead = list2;
			newHead.next = Merge1(list1,list2.next);
		}
		return newHead;
	}





	}
