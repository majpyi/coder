package 手撕;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-06-07 16:48
 * @Description:
 **/
public class 实现栈的逆序而不使用额外的数据结构 {
	public static int get(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		} else {
			int last = get(stack);
			stack.push(result);
			return last;
		}
	}

	public static void reverse(Stack<Integer> stack) {
		if (stack.isEmpty()) {
			return;
		}
		int i = get(stack);
		reverse(stack);
		stack.push(i);
	}


	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		reverse(stack);
		while (!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}
}
