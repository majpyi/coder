package leetcode;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-04-01 19:04
 * @Description: https://leetcode-cn.com/problems/min-stack/
 **/
public class T155最小栈 {

	/**
	 * initialize your data structure here.
	 */
	Stack<Integer> min;
	Stack<Integer> stack;

	public T155最小栈() {
		min = new Stack();
		stack = new Stack();
	}

	public void push(int x) {
		stack.push(x);
		if (min.size() != 0) {
			if (x < getMin()) {
				min.add(stack.size() - 1);
			}
		}else {
			min.add(0);
		}
	}

	public void pop() {
		stack.pop();
		if (stack.size() == min.peek()) {
			min.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return stack.get(min.peek());
	}


	public static void main(String[] args) {
		T155最小栈 minStack = new T155最小栈();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}
}
