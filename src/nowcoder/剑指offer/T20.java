package nowcoder.剑指offer;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 19:29
 * @Description: 包含min函数的栈
 **/
public class T20 {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> min = new Stack<>();
	public void push(int node) {
		if(stack.isEmpty()){
			min.add(0);
		}else {
			if(node<min()){
				min.add(stack.size());
			}
		}
		stack.push(node);
	}

	public void pop() {
		stack.pop();
		if(min.peek()==stack.size()){
			min.pop();
		}
	}

	public int top() {
		return stack.peek();
	}

	public int min() {
		return stack.get(min.peek());
	}

	public static void main(String[] args) {
		T20 a = new T20();
		a.push(3);
		System.out.println(a.min());
		a.push(4);
		System.out.println(a.min());
		a.push(2);
		System.out.println(a.min());
		a.push(3);
		System.out.println(a.min());
		a.pop();
		System.out.println(a.min());
		a.pop();
		System.out.println(a.min());
		a.pop();
		System.out.println(a.min());
		a.push(0);
		System.out.println(a.min());

	}
}
