package nowcoder.剑指offer;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-03-06 21:21
 * @Description: 栈的压入、弹出序列
 **/
public class T21栈的压入弹出序列 {
	public boolean IsPopOrder(int[] pushA, int[] popA) {
		if (pushA.length != popA.length) {
			return false;
		}
		int index = 0;
		Stack<Integer> stack = new Stack<>();
		for (int aPushA : pushA) {
			stack.push(aPushA);
			while (!stack.isEmpty() && stack.peek() == popA[index]) {
				stack.pop();
				index++;
			}
		}
		return stack.isEmpty();
	}
}
