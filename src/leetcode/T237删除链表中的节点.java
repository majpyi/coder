package leetcode;

import 常用java数据结构.ListNode;

/**
 * @Author: Mr.M
 * @Date: 2019-03-28 16:24
 * @Description: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 **/
public class T237删除链表中的节点 {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next= node.next.next;
	}
}
