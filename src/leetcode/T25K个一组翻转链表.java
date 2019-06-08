package leetcode;

import 集合.ListNode;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-06-07 17:09
 * @Description:
 **/
public class T25K个一组翻转链表 {
	public static ListNode reverseKGroup(ListNode head, int k) {
		Stack<ListNode> stack = new Stack<>();
		ListNode re = new ListNode(1);
		ListNode r = re;
		while (head != null) {
			if (stack.size() < k) {
				stack.push(head);
				head = head.next;
			}
			if(stack.size()==k){
				while (!stack.isEmpty()) {
					re.next = stack.pop();
					re = re.next;
				}
			}
		}
		while (!stack.isEmpty()){
			re.next = stack.remove(0);
			re = re.next;
		}
		re.next = null;
		return r.next;
	}

	public static void main(String[] args) {
//		ListNode a = buildlist(new int[]{1,2,3,4,5});
		ListNode a = buildlist(new int[]{1,2});
		showlist(a);
		ListNode b = reverseKGroup(a,2);
		System.out.println();
		showlist(b);
	}

	private static void showlist(ListNode a) {
		while (a!=null){
			System.out.print(a.val+"  ");
			a = a.next;
		}
	}

	private static ListNode buildlist(int[] ints) {
		ListNode head = new ListNode(1);
		ListNode re = head;
		for (int x : ints){
			head.next = new ListNode(x);
			head = head.next;
		}
		return re.next;
	}

}
