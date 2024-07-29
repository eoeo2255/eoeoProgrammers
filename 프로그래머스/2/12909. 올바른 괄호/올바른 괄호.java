import java.util.Stack;

class Solution {
    boolean solution(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c: chars) {
            if (c == '('){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }
}