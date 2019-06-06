package lintcode;

import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-06-06 15:08
 * @Description: https://www.lintcode.com/problem/stack-push-pop-sequence/description  给定一个栈的 push 和 pop 序列。判定其中是否有合法序列。
 **/
public class T377栈的pushpop序列 {
	public boolean isLegalSeq(int[] push, int[] pop) {
		// write your code here
		if (push.length != pop.length) {
			return false;
		}
		Stack<Integer> stack = new Stack<>();
		int k = 0;
		for (int i = 0; i < push.length; i++) {
			stack.push(push[i]);
			if (pop[k] == stack.peek()) {
				stack.pop();
				k++;
			}
		}

		while (!stack.isEmpty()) {
			if (stack.pop() == pop[k]) {
				k++;
			} else {
				return false;
			}
		}

		return true;

	}
}
