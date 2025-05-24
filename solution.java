import java.util.Stack;

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<Character>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
                if (stack.size() > 1) {
                    str = str + "(";
                }
            } else {
                if (stack.size() > 1) {
                    str = str + ")";
                }
                stack.pop();
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeOuterParentheses("(()())(())(()(()))"));
        ;
    }
}