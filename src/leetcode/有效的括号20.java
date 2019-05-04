package leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Author: Mr.M
 * @Date: 2019-02-23 20:03
 * @Description: https://leetcode-cn.com/problems/valid-parentheses/submissions/
 **/
public class 有效的括号20 {
    public static boolean isValid1(String s) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        char[] ch = s.toCharArray();
        for (char x : ch) {
            st1.push(x);
        }
        if (ch.length % 2 != 0) {
            return false;
        }
        while (!st1.isEmpty()) {
            char x = st1.pop();
            if (x == ')' || x == ']' || x == '}') {
                st2.push(x);
            } else {
                if (st2.isEmpty()) {
                    return false;
                }
                char y = st2.pop();
                if (x == '(' && y == ')') {
                    continue;
                } else if (x == '{' && y == '}') {
                    continue;
                } else if (x == '[' && y == ']') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValid2(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put(']','[');
        hm.put('}','{');
        for(char x : s.toCharArray()){
            if(!hm.containsKey(x)){
                st.push(x);
            }
            else if (st.isEmpty() || hm.get(x)!=st.pop()){
                return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid2("()"));
    }
}



class Solution1 {
    public boolean isValid2(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> hm = new HashMap<>();
        hm.put(')','(');
        hm.put('}','{');
        hm.put(']','[');
        for(char x : s.toCharArray()){
            if(!hm.containsKey(x)){
                st.push(x);
            }
            else if (st.isEmpty() || hm.get(x)!=st.pop()){
                return false;
            }
        }
        return st.isEmpty();
    }
}