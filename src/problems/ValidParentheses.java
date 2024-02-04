package problems;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String args[]) {
        String s = new String("{[]");
        ValidParentheses vp = new ValidParentheses();
        boolean result = vp.isValid(s);
        System.out.println("result:" + result);
    }

    public boolean isValid(String s) {
        boolean result = true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='(' || c=='[' || c=='{') {
                stack.push(c);
            } else if (c==')') {
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            } else if (c==']') {
                if (!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                else
                    return false;
            } else if (c=='}') {
                if(!stack.isEmpty() && stack.peek() == '{')
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
