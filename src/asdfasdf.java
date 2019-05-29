import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-05-17 17:33
 * @Description:
 **/
public class asdfasdf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.valueOf(scanner.nextLine()) ;
		String  s = scanner.nextLine();

		Stack<Character> stack = new Stack<>();
		for (Character c: s.toCharArray()){
			if(stack.size()>=1){
				Character a = stack.peek();
				if(a=='0'&&c=='1'||a=='1'&&c=='0'){
					stack.pop();
				}else {
					stack.push(c);
				}
			}else {
				stack.push(c);
			}

		}

		System.out.println(stack.size());
	}
}
