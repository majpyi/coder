package lintcode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @Author: Mr.M
 * @Date: 2019-04-11 09:34
 * @Description:
 **/
class Stack11 {
	/*
	 * @param x: An integer
	 * @return: nothing
	 */
	LinkedList<Integer> arrayList = new LinkedList<>();
	public void push(int x) {
		// write your code here
		arrayList.push(x);
	}

	/*
	 * @return: nothing
	 */
	public void pop() {
		// write your code here
		arrayList.poll();
	}

	/*
	 * @return: An integer
	 */
	public int top() {
		// write your code here
		return arrayList.peek();
	}

	/*
	 * @return: True if the stack is empty
	 */
	public boolean isEmpty() {
		// write your code here
		return arrayList.isEmpty();
	}


	public static void main(String[] args) {
		Stack11 x = new Stack11();
		x.push(1);
		x.push(2);
		x.pop();
		System.out.println(x.top());
	}
}
