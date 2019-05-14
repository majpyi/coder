package nowcoder.剑指offer;

import java.util.LinkedList;

/**
 * @Author: Mr.M
 * @Date: 2019-03-07 10:42
 * @Description: 复杂链表的复制
 **/

class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label) {
		this.label = label;
	}
}
public class T25复杂链表的复制 {
	public RandomListNode Clone(RandomListNode pHead)
	{
		if(pHead==null){
			return null;
		}
		RandomListNode head = new RandomListNode(pHead.label);
		RandomListNode temp = head;

		while (pHead.next != null){
			temp.next = new RandomListNode(pHead.next.label);
			if(pHead.random!=null){
				temp.random = new RandomListNode(pHead.random.label);
			}
			temp = temp.next;
			pHead = pHead.next;
		}
		return head;
	}
}
