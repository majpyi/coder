package nowcoder.剑指offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-03-05 21:26
 * @Description: https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 **/
public class T3从尾到头打印链表 {

	public ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		while (listNode != null) {
			stack.add(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> re = new ArrayList<>();
		while (!stack.isEmpty()) {
			re.add(stack.pop());
		}
		return re;
	}

	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		ArrayList re = new ArrayList();
		while (listNode != null) {
			re.add(0, listNode.val);
			listNode = listNode.next;
		}
		return re;
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> re = new ArrayList<>();   //
		return printListFromTailToHead3(listNode,re);
	}
	public  ArrayList<Integer> printListFromTailToHead3(ListNode listNode,ArrayList<Integer> re) {
			if (listNode != null) {
				if (listNode.next != null) {
//				listNode = listNode.next;
//				return 	printListFromTailToHead3(listNode.next,re);
				printListFromTailToHead3(listNode.next,re);
//				re.add(listNode.val);
				}
				re.add(listNode.val);
			}
			return re;
	}


	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		a.next = b;
		System.out.println(new T3从尾到头打印链表().printListFromTailToHead2(a));
	}

}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}


	static ListNode build(int[] val){
		ArrayList<ListNode> arrayList =new ArrayList<>();
		for (int aVal : val) {
			arrayList.add(new ListNode(aVal));
		}
		for (int i=0;i<arrayList.size()-1;i++){
			arrayList.get(i).next = arrayList.get(i+1);
		}
		return arrayList.get(0);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		System.out.println(stack.peek());
		System.out.println(new ArrayList<>(stack));

		System.out.println();

		ArrayList<Integer> re = new ArrayList<>();
		re.add(0, 1);
		re.add(0, 2);
		re.add(0, 3);
		System.out.println(re);
	}
}