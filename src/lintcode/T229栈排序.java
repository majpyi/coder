package lintcode;

import java.sql.SQLOutput;
import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-06-06 10:45
 * @Description:
 **/
public class T229栈排序 {
	public static void stackSorting(Stack<Integer> stk) {
		// write your code here
		Stack<Integer> stack = new Stack<>();
		stack.push(stk.pop());
		while (!stk.isEmpty()){
			if(stack.peek()>stk.peek()){
				stack.push(stk.pop());
			}else {
				Integer temp = stk.pop();
//				int num =0;
				while (!stack.isEmpty() && stack.peek()<temp){
					stk.push(stack.pop());
				}
				stack.push(temp);
//				while (num--!=0){
//					stack.push(stk.pop());
//				}
			}
		}

		while (!stack.isEmpty()){
			stk.push(stack.pop());
		}

	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(2);
		stack.push(1);
		stack.push(3);
		stackSorting(stack);
		while (!stack.isEmpty()){
			System.out.println(stack.pop());
		}
	}

}
