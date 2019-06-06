package lintcode;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-06-06 14:53
 * @Description:
 **/
class MinStack {
	Stack<Integer> stack;
	Stack<Integer> help;

	public MinStack() {
		// do intialization if necessary
		stack = new Stack<>();
		help = new Stack<>();
	}

	/*
	 * @param number: An integer
	 * @return: nothing
	 */
	public void push(int number) {
		// write your code here
		if(help.isEmpty()){
			help.push(number);
			stack.push(number);
		}else {
			if(number<help.peek()){
				stack.push(number);
				help.push(number);
			}else {
				stack.push(number);
				help.push(help.peek());
			}
		}
	}

	/*
	 * @return: An integer
	 */
	public int pop() {
		// write your code here
		help.pop();
		return stack.pop();
	}

	/*
	 * @return: An integer
	 */
	public int min() {
		// write your code here
		return help.peek();
	}
}
